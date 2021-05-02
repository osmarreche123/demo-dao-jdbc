package application;

import db.DB;

import java.sql.Connection;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {
        Connection conn = null;


            conn = DB.getConnection();

            DB.closeConnection();


    }
}
