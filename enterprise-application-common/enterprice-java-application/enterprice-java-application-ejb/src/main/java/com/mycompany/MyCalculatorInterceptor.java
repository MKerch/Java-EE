/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Arrays;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author kerch
 */
public class MyCalculatorInterceptor {

    @AroundInvoke
    public Object filter(InvocationContext context) throws Exception {
        System.out.println("@Before call to Calculator");
        System.out.println("target:"+context.getTarget());
        System.out.println("method:"+context.getMethod());
        System.out.println("params:"+Arrays.toString(context.getParameters()));        
        Object res=context.proceed();
        System.out.println("@After call to Calculator");
        return res;
    }

}
