/**
 * ClassifyPests.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bj.armyworm.learning;

public interface ClassifyPests extends java.rmi.Remote {
    public boolean MLPCPestClassifier(java.lang.String trainingfile, java.lang.String evaluationfile) throws java.rmi.RemoteException;
    public java.lang.String updateTrainingFile(java.lang.String oldtraingfile, java.lang.String newImage) throws java.rmi.RemoteException;
    public java.lang.String classifyAPest(java.lang.String pclass) throws java.rmi.RemoteException;
}
