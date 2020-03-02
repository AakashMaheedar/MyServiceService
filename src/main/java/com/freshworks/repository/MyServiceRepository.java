package com.freshworks.repository;

import com.freshworks.domain.MyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class MyServiceRepository {

    private static final String template = "Hello, %s!";

}
