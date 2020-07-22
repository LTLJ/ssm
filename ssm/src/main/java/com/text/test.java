package com.text;



import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class test {
    private static Logger log = Logger.getLogger(Test.class.getClass());
    @Test
    public void testLog(){
        log.debug("debug");
        log.error("error");
    }
}
