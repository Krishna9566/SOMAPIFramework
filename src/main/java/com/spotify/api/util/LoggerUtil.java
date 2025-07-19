package com.spotify.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LoggerUtil {

    private LoggerUtil() {
    }

    public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}

