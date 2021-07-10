package com.java.parallel.lock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankTransferDemo {

    private static final Object tieLock = new Object();

    public boolean transfer(BankAccount sourceAccount, BankAccount targetAccount, double amount, long timeout, TimeUnit unit) throws InterruptedException {
        long stopTime = System.nanoTime() + unit.toNanos(timeout);
        while (true) {
            long nanosToLock = unit.toNanos(timeout);
            if (sourceAccount.lock.tryLock(nanosToLock, TimeUnit.NANOSECONDS)) {
                try {
                    if (targetAccount.lock.tryLock()) {
                        try {
                            if (sourceAccount.getBalance() > amount) {
                                sourceAccount.setBalance(sourceAccount.getBalance() - amount);
                                targetAccount.setBalance(targetAccount.getBalance() + amount);
                            }
                        } finally {
                            targetAccount.lock.unlock();
                        }
                    }
                } finally {
                    sourceAccount.lock.unlock();
                }
            }
            if (System.nanoTime() < stopTime) {
                return false;
            }
        }
    }

    public static void main(String args[]) {
        Lock lock = new ReentrantLock();
        //...
        lock.lock();
        try {
            // ...
        } finally {
            lock.unlock();
        }
    }
}
