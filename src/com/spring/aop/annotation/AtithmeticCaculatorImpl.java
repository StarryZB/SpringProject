package com.spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by StarryZB on 2018/1/28.
 */

@Component
public class AtithmeticCaculatorImpl implements AtithmeticCaculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
