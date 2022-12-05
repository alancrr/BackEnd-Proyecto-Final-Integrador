package com.dh.clinicaodontologica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Aux {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/be_tpi","sa","sa");
    }
}
