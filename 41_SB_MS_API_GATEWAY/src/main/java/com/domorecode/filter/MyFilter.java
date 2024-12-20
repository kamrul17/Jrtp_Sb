package com.domorecode.filter;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;


import reactor.core.publisher.Mono;
@Component
public class MyFilter implements GlobalFilter{

	
//	write security logic here
//	like you want to print log each request
//	check whether  req is valid or not
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
	ServerHttpRequest req =exchange.getRequest();
	org.springframework.http.HttpHeaders headers=req.getHeaders();
	Set<String>keyset=headers.keySet();
	for (String key : keyset) {
		List<String>values=headers.get(key);
		System.out.println(key+" :: "+values);
	}
		return chain.filter(exchange);
	}

}
