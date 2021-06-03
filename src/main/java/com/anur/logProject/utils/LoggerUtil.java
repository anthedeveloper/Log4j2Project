package com.anur.logProject.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LoggerUtil {
    private LoggerUtil(){
        super();
    }

    private static Logger InfoLogger = LogManager.getLogger("infoLogger");

    private static Logger ErrorLogger = LogManager.getLogger("errorLogger");

    public static Logger getInfoLogger() {
        return InfoLogger;
    }

    public static void setInfoLogger(Logger infoLogger) {
        InfoLogger = infoLogger;
    }

    public static Logger getErrorLogger() {
        return ErrorLogger;
    }

    public static void setErrorLogger(Logger errorLogger) {
        ErrorLogger = errorLogger;
    }
}
