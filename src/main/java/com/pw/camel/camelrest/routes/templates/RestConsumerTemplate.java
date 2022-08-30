package com.pw.camel.camelrest.routes.templates;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class RestConsumerTemplate extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        routeTemplate("restTemplate")
                .templateParameter("port")
                .from("timer:restTemplateName?period=10000")
                .to("rest:get:rest/hello/philip1?host=192.168.5.0:{{port}}")
                .log(LoggingLevel.TRACE, "TEST: ${body}")
                .to("direct:mybean");
    }
}
