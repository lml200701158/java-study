package com.pattern.component;

public class test {
    public static void main(String[] args) {
        batchPenguin grandFatherPenguin = new batchPenguin("grandFatherPenguin");
        batchPenguin fatherPenguin = new batchPenguin("fatherPenguin");
        batchPenguin motherPenguin = new batchPenguin("motherPenguin");
        batchPenguin childPenguin1 = new batchPenguin("childPenguin1");
        batchPenguin childPenguin2 = new batchPenguin("childPenguin2");
        batchPenguin childPenguin3 = new batchPenguin("childPenguin3");
        batchPenguin childPenguin4 = new batchPenguin("childPenguin4");
        fatherPenguin.add(childPenguin1);
        fatherPenguin.add(childPenguin2);
        motherPenguin.add(childPenguin3);
        motherPenguin.add(childPenguin4);
        grandFatherPenguin.add(fatherPenguin);
        grandFatherPenguin.add(motherPenguin);

        leaf leaf1 = new leaf("leaf1");
        leaf leaf2 = new leaf("leaf2");
        leaf leaf3 = new leaf("leaf3");
        leaf leaf4 = new leaf("leaf4");
        childPenguin1.add(leaf1);
        childPenguin2.add(leaf2);
        childPenguin3.add(leaf3);
        childPenguin4.add(leaf4);

        grandFatherPenguin.beating();
    }
}
