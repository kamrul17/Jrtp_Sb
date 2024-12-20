package com.domorecode.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;



	@RestController
	public class DataRestController {

	    private static final String REDIS_CIRCUIT_BREAKER = "redisService";

	    @GetMapping("/data")
	    @CircuitBreaker(name = REDIS_CIRCUIT_BREAKER, fallbackMethod = "getDataFromDB")
	    public String getDataFromRedis() {
	        System.out.println("**getDataFromRedis() method called**");
	        if (new Random().nextInt(10) <=10) { // Fail with 30% probability
	            throw new RuntimeException("Redis Server Is Down");
	        }
	        // Logic to access data from Redis
	        return "data accessed from Redis (main logic) ....";
	    }

	    public String getDataFromDB(Throwable throwable) {
	        System.out.println("**getDataFromDB() method called**");
	        // Logic to access data from DB
	        return "data accessed from database (fallback logic) ....";
	    }
	}
