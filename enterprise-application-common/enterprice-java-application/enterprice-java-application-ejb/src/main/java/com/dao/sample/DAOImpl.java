/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author kerch
 */
@Stateless(mappedName = "dao")
public class DAOImpl implements DAO {
    
    @Resource(name="myDS")
    private DataSource dataSource;
    
    
    @Override
    public List<String> getPersons() {
        List<String> list = new ArrayList();
        try(Connection c = dataSource.getConnection()){
            PreparedStatement ps = c.prepareStatement("SELECT * FROM persons");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String name=rs.getString("name");
                list.add(name);
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
