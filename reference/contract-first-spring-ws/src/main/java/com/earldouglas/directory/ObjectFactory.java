//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.13 at 02:35:31 PM PDT 
//


package com.earldouglas.directory;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.earldouglas.directory package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Name_QNAME = new QName("http://www.earldouglas.com/directory", "name");
    private final static QName _EmployeeResponse_QNAME = new QName("http://www.earldouglas.com/directory", "employee-response");
    private final static QName _Title_QNAME = new QName("http://www.earldouglas.com/directory", "title");
    private final static QName _EmployeeRequest_QNAME = new QName("http://www.earldouglas.com/directory", "employee-request");
    private final static QName _Id_QNAME = new QName("http://www.earldouglas.com/directory", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.earldouglas.directory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.earldouglas.com/directory", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.earldouglas.com/directory", name = "employee-response")
    public JAXBElement<Employee> createEmployeeResponse(Employee value) {
        return new JAXBElement<Employee>(_EmployeeResponse_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.earldouglas.com/directory", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Id }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.earldouglas.com/directory", name = "employee-request")
    public JAXBElement<Id> createEmployeeRequest(Id value) {
        return new JAXBElement<Id>(_EmployeeRequest_QNAME, Id.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.earldouglas.com/directory", name = "id")
    public JAXBElement<BigInteger> createId(BigInteger value) {
        return new JAXBElement<BigInteger>(_Id_QNAME, BigInteger.class, null, value);
    }

}
