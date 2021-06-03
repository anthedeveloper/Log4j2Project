package com.anur.logProject.main;

import org.apache.logging.log4j.Logger;
import com.anur.logProject.utils.LoggerUtil;

public class Main {

    private static final Logger infoLogger = LoggerUtil.getInfoLogger();
    private static final Logger errorLogger = LoggerUtil.getErrorLogger();



    public static void main(String[] args) {
        System.out.println("running main");
        System.out.println(System.getProperty("server.dir"));
        infoLogger.info("NEW INFO LOGGER");

        errorLogger.error("NEW ERROR LOGGER");

    }


}
