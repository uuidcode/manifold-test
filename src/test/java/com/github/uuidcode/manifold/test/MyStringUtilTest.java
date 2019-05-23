package com.github.uuidcode.manifold.test;

import org.junit.Test;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class MyStringUtilTest {
    protected static Logger logger = getLogger(MyStringUtilTest.class);

    @Test
    public void echo() {
        "java".helloWorld();
    }

    @Test
    public void twice() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> twice logger: {}", "hello".twice());
        }
    }
}