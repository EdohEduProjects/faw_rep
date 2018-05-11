package bj.armyworm.learning;

public class ClassifyPestsProxy implements bj.armyworm.learning.ClassifyPests {
  private String _endpoint = null;
  private bj.armyworm.learning.ClassifyPests classifyPests = null;
  
  public ClassifyPestsProxy() {
    _initClassifyPestsProxy();
  }
  
  public ClassifyPestsProxy(String endpoint) {
    _endpoint = endpoint;
    _initClassifyPestsProxy();
  }
  
  private void _initClassifyPestsProxy() {
    try {
      classifyPests = (new bj.armyworm.learning.ClassifyPestsServiceLocator()).getClassifyPests();
      if (classifyPests != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)classifyPests)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)classifyPests)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (classifyPests != null)
      ((javax.xml.rpc.Stub)classifyPests)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bj.armyworm.learning.ClassifyPests getClassifyPests() {
    if (classifyPests == null)
      _initClassifyPestsProxy();
    return classifyPests;
  }
  
  public boolean MLPCPestClassifier(java.lang.String trainingfile, java.lang.String evaluationfile) throws java.rmi.RemoteException{
    if (classifyPests == null)
      _initClassifyPestsProxy();
    return classifyPests.MLPCPestClassifier(trainingfile, evaluationfile);
  }
  
  public java.lang.String updateTrainingFile(java.lang.String oldtraingfile, java.lang.String newImage) throws java.rmi.RemoteException{
    if (classifyPests == null)
      _initClassifyPestsProxy();
    return classifyPests.updateTrainingFile(oldtraingfile, newImage);
  }
  
  public java.lang.String classifyAPest(java.lang.String pclass) throws java.rmi.RemoteException{
    if (classifyPests == null)
      _initClassifyPestsProxy();
    return classifyPests.classifyAPest(pclass);
  }
  
  
}