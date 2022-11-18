/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_PBO.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author peter
 */
public class CategoryUser {

    static DatabaseHandler conn = new DatabaseHandler();
    
    public String checkLogin(String email, String password){
        conn.connect();
        String query = "SELECT * FROM member WHERE email='" + email + "'&&password='" + password + "'";
        Member member = Member.getMemberInst();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                member.setEmail(rs.getString("email"));
                member.setPassword(rs.getString("password"));
                member.setUsername(rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
