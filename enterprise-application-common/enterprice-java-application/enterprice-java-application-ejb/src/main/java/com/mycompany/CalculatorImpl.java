/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.Singleton;
import javax.interceptor.Interceptors;

/**
 *
 * @author kerch
 */
@Singleton(mappedName = "calculator")
@Interceptors({MyCalculatorInterceptor.class})
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        long start = System.currentTimeMillis();
        System.out.println("Claculator.subtract");
        while (System.currentTimeMillis() - start <= 20000) {
        }
        return a - b;
    }

}
