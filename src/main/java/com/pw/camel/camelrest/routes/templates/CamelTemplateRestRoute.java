package com.pw.camel.camelrest.routes.templates;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.TemplatedRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//@Component
public class CamelTemplateRestRoute {

    @Autowired
    CamelContext context;

    @Value("${receiver.endpoint}")
    String templateName;

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationEvent() {

        TemplatedRouteBuilder.builder(context, templateName)
                .parameter("port", "8083").routeId("RestRoute")
                .add();
    }
}
