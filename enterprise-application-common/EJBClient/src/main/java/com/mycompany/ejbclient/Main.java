/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejbclient;

import com.mycompany.Calculator;
import com.mycompany.ProjectStarter;
import com.mycompany.ProjectStarterImpl;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import weblogic.jndi.WLInitialContextFactory;

/**
 *
 * @author kerch
 */
public class Main {
    
    public static void main(String[] args) throws NamingException {
        Hashtable settings = new Hashtable();
        settings.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        settings.put(Context.PROVIDER_URL, "t3://127.0.0.1:7001");              
        InitialContext context = new InitialContext(settings);
       // context.lookup("projectStarterImpl#com.mycompany.ProjectStarter");
        
        ProjectStarter projectStarter = (ProjectStarter) context.lookup("projectStarterImpl#com.mycompany.ProjectStarter");
        int res=projectStarter.process(1, 2);
        System.out.println("res="+res);
        projectStarter = (ProjectStarter) context.lookup("b#com.mycompany.ProjectStarter");
        res=projectStarter.process(1, 2);
        System.out.println("res="+res);
        System.out.println("---------------------------");
      //  Calculator calculator = (Calculator) context.lookup("calculator#com.mycompany.Calculator");
      //  calculator.add(1, 4);
    }
    
}
