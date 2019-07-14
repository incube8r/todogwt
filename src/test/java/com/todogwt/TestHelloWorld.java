package com.todogwt;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.Window;
import org.jboss.errai.common.client.logging.util.Console;

public class TestHelloWorld extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.todogwt.App";
    }

    public void test() {
        Window.alert("Hello world!");
        Console.log("Hello world!");
        delayTestFinish(1000);
        finishTest();
    }

}
