package com.freshworks.service;

import com.freshworks.domain.MyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class MyServiceService {

    private static final String template = "Hello, %s!";

}
