package com.pw.camel.camelrest.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/cam")
public class CamelController {

    //@Autowired
    CamelContext context;

    //@GetMapping("/helloc/{name}")
    public String getGreeting(@PathVariable String name) {

        Object headerValue = "Philip";
        Object body = "Philip2";
        ProducerTemplate template = context.createProducerTemplate();
        String response = template.requestBodyAndHeader("rest:get:rest/hello/Philip5?host=192.168.5.0:8083", body, "name", headerValue, String.class);

        return response;
    }
}

class MyCamelRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

    }
}
