/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author kerch
 */
@Stateful(mappedName = "sessionData")
public class ProjectStarterImpl4 implements ProjectStarter {
    private List<Integer> allResults = new ArrayList<>();

    @Override
    public int process(int a, int b) {
        int sum=a+b;
        allResults.add(sum);
        return sum;
    }
    
}
