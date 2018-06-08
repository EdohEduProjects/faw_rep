/*
 * This is generated code, copyright free and unrestricted
 */
package bj.armyworm.mobile.webservicesproxy.logics;

import com.codename1.io.WebServiceProxyCall;
import com.codename1.io.Externalizable;
import com.codename1.util.Callback;
import com.codename1.util.SuccessCallback;
import com.codename1.util.FailureCallback;
import java.io.IOException;


public class FawLogics {
    private static final String DESTINATION_URL = "http://localhost:8080/cn1proxylogics";

    private static final WebServiceProxyCall.WSDefinition def_ClassifyPest = WebServiceProxyCall.defineWebService(DESTINATION_URL, "ClassifyPest", WebServiceProxyCall.TYPE_BOOLEAN, WebServiceProxyCall.TYPE_STRING);
    
    public static boolean ClassifyPest(String pictureUrl) throws IOException {
        return ((Boolean)WebServiceProxyCall.invokeWebserviceSync(def_ClassifyPest, pictureUrl)).booleanValue();
    }

    public static void ClassifyPestAsync(String pictureUrl, Callback<Boolean> returnValueFromMethod) {
        WebServiceProxyCall.invokeWebserviceASync(def_ClassifyPest, returnValueFromMethod, pictureUrl);
    }

}
