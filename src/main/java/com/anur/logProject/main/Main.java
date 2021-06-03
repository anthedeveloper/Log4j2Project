package com.anur.logProject.main;

import org.apache.logging.log4j.Logger;
import com.anur.logProject.utils.LoggerUtil;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Main {

    private static final Logger infoLogger = LoggerUtil.getInfoLogger();
    private static final Logger errorLogger = LoggerUtil.getErrorLogger();
    private static final Logger otherLogger = LoggerUtil.getOtherLogger();

    final static Marker OTHER = MarkerManager.getMarker("OTHER");
    final static Marker INFO = MarkerManager.getMarker("INFO");


    public static void main(String[] args) {
        System.out.println("running main");
        System.out.println(System.getProperty("server.dir"));
        infoLogger.info(INFO, "NEW INFO LOGGER");

        errorLogger.error("NEW ERROR LOGGER");
        otherLogger.info(OTHER, "other log test");

    }


}
