package com.pw.camel.camelrest.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class CamelRestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:mybean")
                .routeId("BeanRoute")
                .bean("myFormat")
                .log(LoggingLevel.TRACE, "TEST3: ${body}");
    }
}
