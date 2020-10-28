package com.leo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example {
    private static final Logger log = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        String str = "占位符";

        log.trace("trace level");
        log.debug("debug level, {}", str);
        log.info("info level");
        log.warn("warn level");
        log.error("error level");
        log.fatal("fatal level");
    }
}
