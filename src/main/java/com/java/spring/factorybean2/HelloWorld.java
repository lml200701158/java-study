package com.java.spring.factorybean2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
public class HelloWorld {
    private static Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
    public void sayHello(String message) {
        SimpleDateFormat formatter =  new SimpleDateFormat("dd.MM.YYYY");
        String today = formatter.format(new Date());
        LOGGER.info(today + ":" + message);
    }
}
