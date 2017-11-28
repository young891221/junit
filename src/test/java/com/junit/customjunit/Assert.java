package com.junit.customjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assert {
    private static final Logger logger = LoggerFactory.getLogger(Assert.class);

    private Assert() {

    }

    public static boolean assertTrue(Object a, Object b) {
        if(a.equals(b)) {
            logger.info("테스트 성공!");
            return true;
        }
        logger.info("테스트 실패!");
        return false;
    }
}
