/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejbclient;

import java.lang.reflect.Method;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author kerch
 */
public class Main3 {
    
    public static void main(String[] args) throws Exception {
        Hashtable settings = new Hashtable();
        settings.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        settings.put(Context.PROVIDER_URL, "t3://127.0.0.1:7001");
        InitialContext context = new InitialContext(settings);

        Object remoteEJB = context.lookup("c#com.mycompany.ProjectStarter");
        Method[] methods = remoteEJB.getClass().getDeclaredMethods();
        Method method = null;
        for (Method m : methods) {
            if ("process".equals(m.getName())) {
                method = m;
            }
        }
        if (method != null) {
            Object res = method.invoke(remoteEJB, 1, 2);
            System.out.println("res=" + res);
        }

    }
    
}
