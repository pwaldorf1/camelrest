package com.pw.camel.camelrest.format;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Component
public class MyFormat {

    static Logger logger = LoggerFactory.getLogger(MyFormat.class);

    public void logWrite() {
        logger.trace("Inside MyFormat Bean");
    }
}
