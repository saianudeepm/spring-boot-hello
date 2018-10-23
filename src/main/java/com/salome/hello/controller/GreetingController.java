package com.salome.hello.controller;

import com.salome.hello.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Sai Anudeep Machavarapu on 10/23/18.
 */
@RestController
public class GreetingController {

    private Logger logger = LoggerFactory.getLogger(GreetingController.class);

    //example of a get Request
    @RequestMapping("/greeting")
    public Greeting wish(@RequestParam(value ="name", defaultValue="World") String name){
        logger.debug("wow I got a request");
        logger.info("Got a request for /greeting");
        AtomicLong id = new AtomicLong();
        logger.info("Sending a response");
        return new Greeting(id.incrementAndGet(), name);
    }

}
