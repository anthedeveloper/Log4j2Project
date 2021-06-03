package com.anur.logProject.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LoggerUtil {
    private LoggerUtil(){
        super();
    }

    private static Logger InfoLogger = LogManager.getLogger("InfoLogger");

    private static Logger ErrorLogger = LogManager.getLogger("ErrorLogger");
    private static Logger OtherLogger = LogManager.getLogger("OtherLogger");

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

    public static Logger getOtherLogger() {
        return OtherLogger;
    }

    public static void setOtherLogger(Logger otherLogger) {
        OtherLogger = otherLogger;
    }


}
