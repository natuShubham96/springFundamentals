package com.shubham.spring.springDemo.xml;

//We will not be using annotations here as we will create application context using xml
public class XMLPersonDao {

    public XMLJdbcConnection getXmljdbcConnection() {
        return xmljdbcConnection;
    }

    public void setXmljdbcConnection(XMLJdbcConnection xmljdbcConnection) {
        this.xmljdbcConnection = xmljdbcConnection;
    }

    private XMLJdbcConnection xmljdbcConnection;
}
