package com.testproject.util;

import com.testproject.exception.BsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssertUtil {
    private static final Logger log = LoggerFactory.getLogger(AssertUtil.class);

    /**
     * 判断true
     *
     * @param cond
     * @param message
     */
    public static void assertTrue(boolean cond, String message) {
        if (!cond) {
            log.error("errorCode : -1   message :" + message);
            throw new BsException(-1, message);
        }
    }

    /**
     * 判断false
     *
     * @param cond
     * @param message
     */
    public static void assertFalse(boolean cond, String message) {
        if (cond) {
            log.error("errorCode : -1   message :" + message);
            throw new BsException(-1, message);
        }
    }

    /**
     * 判断false
     *
     * @param cond
     * @param message
     */
    public static void assertFalse(boolean cond, Integer code, String message) {
        if (cond) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new BsException(code, message);
        }
    }

    /**
     * 判断true
     *
     * @param cond
     * @param code
     * @param message
     */
    public static void assertTrue(boolean cond, Integer code, String message) {
        if (!cond) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new BsException(code, message);
        }
    }


    /**
     * 判断NULL
     *
     * @param object
     * @param message
     */
    public static void assertNotNull(Object object, String message) {
        if (object == null) {
            log.error("errorCode : -1   message :" + message);
            throw new BsException(-1, message);
        }
    }

    /**
     * 判断NULL
     *
     * @param object
     * @param code
     * @param message
     */
    public static void assertNotNull(Object object, Integer code, String message) {
        if (object == null) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new BsException(code, message);
        }
    }

    /**
     * 判断对象为null
     *
     * @param object
     * @param code
     * @param message
     */
    public static void assertNull(Object object, Integer code, String message) {

        if (object != null) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new BsException(code, message);
        }
    }
}
