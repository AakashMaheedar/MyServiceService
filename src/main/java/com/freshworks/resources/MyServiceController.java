package com.freshworks.resources;

import com.freshworks.domain.MyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MyServiceController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public MyService greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new MyService(counter.incrementAndGet(),
                String.format(template, name));
    }
}
