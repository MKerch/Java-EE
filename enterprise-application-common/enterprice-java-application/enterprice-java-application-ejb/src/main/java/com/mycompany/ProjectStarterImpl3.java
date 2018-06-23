/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.EJB;
import javax.ejb.Startup;
import javax.ejb.Stateless;

/**
 *
 * @author kerch
 */
@Stateless(mappedName = "c")
public class ProjectStarterImpl3 implements ProjectStarter {
    @EJB
    private Calculator calculator;
    
    @Override
    public int process(int a, int b) {
         System.out.println("PROCESS-c().hashCode="+hashCode());
         return calculator.subtract(a, b);
    }
    
}
