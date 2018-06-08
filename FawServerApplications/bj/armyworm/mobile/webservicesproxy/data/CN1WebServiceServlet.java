/*
 * This is generated code, copyright free and unrestricted
 */
package bj.armyworm.mobile.webservicesproxy.data;

import com.codename1.io.Externalizable;
import com.codename1.proxy.server.ProxyServerHelper;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is a generated servlet that maps calls to the Server class static methods,
 * your code should go in that class!
 *
 * @author Codename One
 */
@WebServlet(name = "CN1WebServiceServlet", urlPatterns = {"/cn1proxydata"})
public class CN1WebServiceServlet extends HttpServlet {
    private static final ProxyServerHelper.WSDefinition def_createPestRecord = ProxyServerHelper.createServiceDefinition("createPestRecord", ProxyServerHelper.TYPE_BOOLEAN, ProxyServerHelper.TYPE_STRING_ARRAY);
    private static final ProxyServerHelper.WSDefinition def_readPestRecord = ProxyServerHelper.createServiceDefinition("readPestRecord", ProxyServerHelper.TYPE_BOOLEAN, ProxyServerHelper.TYPE_INT);
    private static final ProxyServerHelper.WSDefinition def_updatePestRecord = ProxyServerHelper.createServiceDefinition("updatePestRecord", ProxyServerHelper.TYPE_BOOLEAN, ProxyServerHelper.TYPE_STRING_ARRAY);
    private static final ProxyServerHelper.WSDefinition def_deletePestRecord = ProxyServerHelper.createServiceDefinition("deletePestRecord", ProxyServerHelper.TYPE_BOOLEAN, ProxyServerHelper.TYPE_INT);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Webservice access only!</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DataInputStream di = new DataInputStream(request.getInputStream());
        String methodName = di.readUTF();
        
        if(methodName.equals("createPestRecord")) {
            Object[] args = ProxyServerHelper.readMethodArguments(di, def_createPestRecord);
            ProxyServerHelper.writeResponse(response, def_createPestRecord, FawDataServer.createPestRecord((String[])args[0]));
            return;
        }
        if(methodName.equals("readPestRecord")) {
            Object[] args = ProxyServerHelper.readMethodArguments(di, def_readPestRecord);
            ProxyServerHelper.writeResponse(response, def_readPestRecord, FawDataServer.readPestRecord((int)args[0]));
            return;
        }
        if(methodName.equals("updatePestRecord")) {
            Object[] args = ProxyServerHelper.readMethodArguments(di, def_updatePestRecord);
            ProxyServerHelper.writeResponse(response, def_updatePestRecord, FawDataServer.updatePestRecord((String[])args[0]));
            return;
        }
        if(methodName.equals("deletePestRecord")) {
            Object[] args = ProxyServerHelper.readMethodArguments(di, def_deletePestRecord);
            ProxyServerHelper.writeResponse(response, def_deletePestRecord, FawDataServer.deletePestRecord((int)args[0]));
            return;
        }
    }
}
