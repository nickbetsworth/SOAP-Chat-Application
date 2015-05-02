
package chatclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ChatServer", targetNamespace = "http://chatserver/", wsdlLocation = "http://localhost:8080/ChatApplication/ChatServer?wsdl")
public class ChatServer_Service
    extends Service
{

    private final static URL CHATSERVER_WSDL_LOCATION;
    private final static WebServiceException CHATSERVER_EXCEPTION;
    private final static QName CHATSERVER_QNAME = new QName("http://chatserver/", "ChatServer");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ChatApplication/ChatServer?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHATSERVER_WSDL_LOCATION = url;
        CHATSERVER_EXCEPTION = e;
    }

    public ChatServer_Service() {
        super(__getWsdlLocation(), CHATSERVER_QNAME);
    }

    public ChatServer_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHATSERVER_QNAME, features);
    }

    public ChatServer_Service(URL wsdlLocation) {
        super(wsdlLocation, CHATSERVER_QNAME);
    }

    public ChatServer_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHATSERVER_QNAME, features);
    }

    public ChatServer_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChatServer_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChatServer
     */
    @WebEndpoint(name = "ChatServerPort")
    public ChatServer getChatServerPort() {
        return super.getPort(new QName("http://chatserver/", "ChatServerPort"), ChatServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChatServer
     */
    @WebEndpoint(name = "ChatServerPort")
    public ChatServer getChatServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://chatserver/", "ChatServerPort"), ChatServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHATSERVER_EXCEPTION!= null) {
            throw CHATSERVER_EXCEPTION;
        }
        return CHATSERVER_WSDL_LOCATION;
    }

}