package com.shubham.spring.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return jdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @Autowired
    private ComponentJdbcConnection jdbcConnection;
}
