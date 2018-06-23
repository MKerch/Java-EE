/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.Remote;
/**
 *
 * @author kerch
 */
@Remote
public interface ProjectStarter {
    
    public int process(int a, int b);
    
}
