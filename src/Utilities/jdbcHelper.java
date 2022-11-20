/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TUF
 */
public class jdbcHelper {
     public static ResultSet selectTongQuat(String sql, Object... params) {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Connection con = null;

        try {
            con = DBConnect.getConnect();
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstm.setObject(i + 1, params[i]);

            }
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            close(con, pstm, rs);
            return null;
        }
    }

    public static void close(Connection con, PreparedStatement pstm) {
        try {
            pstm.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection con, PreparedStatement pstm, ResultSet rs) {
        try {
            rs.close();
            close(con, pstm);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int updateTongQuat(String sql, Object... params) {
            PreparedStatement pstm = null;
            Connection con = null;
        try {
            
            
            con = DBConnect.getConnect();
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstm.setObject(i + 1, params[i]);

            }
            return pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }finally{
            close(con, pstm);
        }
    }
}
