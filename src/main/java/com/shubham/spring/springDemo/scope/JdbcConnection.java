package com.shubham.spring.springDemo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value  = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//So that, even though bean is singleton and dependency is prototype, we don't get single instance of the dependency
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }
}
