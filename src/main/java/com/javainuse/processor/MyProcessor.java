package com.javainuse.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.concurrent.ScheduledExecutorService;

public class MyProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("hello");
    }

}
