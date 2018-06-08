/*
 * This is generated code, copyright free and unrestricted
 */
package bj.armyworm.mobile.webservicesproxy.data;

import com.codename1.io.WebServiceProxyCall;
import com.codename1.io.Externalizable;
import com.codename1.util.Callback;
import com.codename1.util.SuccessCallback;
import com.codename1.util.FailureCallback;
import java.io.IOException;


public class FawData {
    private static final String DESTINATION_URL = "http://localhost:8080/cn1proxydata";

    private static final WebServiceProxyCall.WSDefinition def_createPestRecord = WebServiceProxyCall.defineWebService(DESTINATION_URL, "createPestRecord", WebServiceProxyCall.TYPE_BOOLEAN, WebServiceProxyCall.TYPE_STRING_ARRAY);
    private static final WebServiceProxyCall.WSDefinition def_readPestRecord = WebServiceProxyCall.defineWebService(DESTINATION_URL, "readPestRecord", WebServiceProxyCall.TYPE_BOOLEAN, WebServiceProxyCall.TYPE_INT);
    private static final WebServiceProxyCall.WSDefinition def_updatePestRecord = WebServiceProxyCall.defineWebService(DESTINATION_URL, "updatePestRecord", WebServiceProxyCall.TYPE_BOOLEAN, WebServiceProxyCall.TYPE_STRING_ARRAY);
    private static final WebServiceProxyCall.WSDefinition def_deletePestRecord = WebServiceProxyCall.defineWebService(DESTINATION_URL, "deletePestRecord", WebServiceProxyCall.TYPE_BOOLEAN, WebServiceProxyCall.TYPE_INT);
    
    public static boolean createPestRecord(String[] newpest) throws IOException {
        return ((Boolean)WebServiceProxyCall.invokeWebserviceSync(def_createPestRecord, (Object)newpest)).booleanValue();
    }

    public static void createPestRecordAsync(String[] newpest, Callback<Boolean> returnValueFromMethod) {
        WebServiceProxyCall.invokeWebserviceASync(def_createPestRecord, returnValueFromMethod, (Object)newpest);
    }

    public static boolean readPestRecord(int farmerId) throws IOException {
        return ((Boolean)WebServiceProxyCall.invokeWebserviceSync(def_readPestRecord, farmerId)).booleanValue();
    }

    public static void readPestRecordAsync(int farmerId, Callback<Boolean> returnValueFromMethod) {
        WebServiceProxyCall.invokeWebserviceASync(def_readPestRecord, returnValueFromMethod, farmerId);
    }

    public static boolean updatePestRecord(String[] newRecordElements) throws IOException {
        return ((Boolean)WebServiceProxyCall.invokeWebserviceSync(def_updatePestRecord, (Object)newRecordElements)).booleanValue();
    }

    public static void updatePestRecordAsync(String[] newRecordElements, Callback<Boolean> returnValueFromMethod) {
        WebServiceProxyCall.invokeWebserviceASync(def_updatePestRecord, returnValueFromMethod, (Object)newRecordElements);
    }

    public static boolean deletePestRecord(int farmerId) throws IOException {
        return ((Boolean)WebServiceProxyCall.invokeWebserviceSync(def_deletePestRecord, farmerId)).booleanValue();
    }

    public static void deletePestRecordAsync(int farmerId, Callback<Boolean> returnValueFromMethod) {
        WebServiceProxyCall.invokeWebserviceASync(def_deletePestRecord, returnValueFromMethod, farmerId);
    }

}
