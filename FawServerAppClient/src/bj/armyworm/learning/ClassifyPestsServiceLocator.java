/**
 * ClassifyPestsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bj.armyworm.learning;

public class ClassifyPestsServiceLocator extends org.apache.axis.client.Service implements bj.armyworm.learning.ClassifyPestsService {

    public ClassifyPestsServiceLocator() {
    }


    public ClassifyPestsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClassifyPestsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClassifyPests
    private java.lang.String ClassifyPests_address = "http://localhost:8080/FawServerApplications/services/ClassifyPests";

    public java.lang.String getClassifyPestsAddress() {
        return ClassifyPests_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClassifyPestsWSDDServiceName = "ClassifyPests";

    public java.lang.String getClassifyPestsWSDDServiceName() {
        return ClassifyPestsWSDDServiceName;
    }

    public void setClassifyPestsWSDDServiceName(java.lang.String name) {
        ClassifyPestsWSDDServiceName = name;
    }

    public bj.armyworm.learning.ClassifyPests getClassifyPests() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClassifyPests_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClassifyPests(endpoint);
    }

    public bj.armyworm.learning.ClassifyPests getClassifyPests(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bj.armyworm.learning.ClassifyPestsSoapBindingStub _stub = new bj.armyworm.learning.ClassifyPestsSoapBindingStub(portAddress, this);
            _stub.setPortName(getClassifyPestsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClassifyPestsEndpointAddress(java.lang.String address) {
        ClassifyPests_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bj.armyworm.learning.ClassifyPests.class.isAssignableFrom(serviceEndpointInterface)) {
                bj.armyworm.learning.ClassifyPestsSoapBindingStub _stub = new bj.armyworm.learning.ClassifyPestsSoapBindingStub(new java.net.URL(ClassifyPests_address), this);
                _stub.setPortName(getClassifyPestsWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ClassifyPests".equals(inputPortName)) {
            return getClassifyPests();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://learning.armyworm.bj", "ClassifyPestsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://learning.armyworm.bj", "ClassifyPests"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClassifyPests".equals(portName)) {
            setClassifyPestsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
