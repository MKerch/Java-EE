/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author kerch
 */
@Singleton(mappedName = "b")
public class ProjectStarterImpl2 implements ProjectStarter {
    @EJB
    private Calculator calculator;
    
   @Override
    public int process(int a, int b) {
         System.out.println("PROCESS-b()");
         return calculator.subtract(a, b);
    }  
    
}
