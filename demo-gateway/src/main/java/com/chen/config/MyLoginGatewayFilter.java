package com.chen.config;

import cn.hutool.core.collection.CollectionUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class MyLoginGatewayFilter implements GlobalFilter, Ordered {

    private final static String REGISTRY_URL = "";
    private final static String LOGIN_URL = "";


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        // 判断是否为登录或者注册
        if (StringUtils.equals(REGISTRY_URL,path) || StringUtils.equals(LOGIN_URL,path)) {
            chain.filter(exchange);
        } else {
            // 其他请求需要校验token
            List<String> token = request.getHeaders().get("token");
            if (CollectionUtil.isNotEmpty(token)) {
                // 校验token
                // 1.先判断token是否在有效期
                // 2.如果在有效期则先找缓存里面是否有对应的token
                // 3.缓存中有则直接进行判断.
                // 4.缓存中没有则拒绝请求
                if (true) {
                    chain.filter(exchange);
                } else {
                    exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
                    return exchange.getResponse().setComplete();
                }
            }

        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
