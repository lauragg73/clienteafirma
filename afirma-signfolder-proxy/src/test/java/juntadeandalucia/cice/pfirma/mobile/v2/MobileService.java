
package juntadeandalucia.cice.pfirma.mobile.v2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileApplicationList;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileDocSignInfoList;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileDocument;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileDocumentList;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileRequest;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileRequestFilterList;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileRequestList;
import juntadeandalucia.cice.pfirma.mobile.type.v2.MobileStringList;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MobileService", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:v2.0")
@XmlSeeAlso({
    juntadeandalucia.cice.pfirma.mobile.request.v2.ObjectFactory.class,
    juntadeandalucia.cice.pfirma.mobile.type.v2.ObjectFactory.class
})
public interface MobileService {


    /**
     * 
     * @param initPage
     * @param certificate
     * @param signFormats
     * @param pageSize
     * @param state
     * @param filters
     * @return
     *     returns juntadeandalucia.cice.pfirma.mobile.type.v2.MobileRequestList
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "requestList", targetNamespace = "")
    @RequestWrapper(localName = "queryRequestList", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.QueryRequestList")
    @ResponseWrapper(localName = "queryRequestListResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.QueryRequestListResponse")
    public MobileRequestList queryRequestList(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "state", targetNamespace = "")
        String state,
        @WebParam(name = "initPage", targetNamespace = "")
        String initPage,
        @WebParam(name = "pageSize", targetNamespace = "")
        String pageSize,
        @WebParam(name = "signFormats", targetNamespace = "")
        MobileStringList signFormats,
        @WebParam(name = "filters", targetNamespace = "")
        MobileRequestFilterList filters)
        throws MobileException
    ;

    /**
     * 
     * @param certificate
     * @param requestId
     * @return
     *     returns juntadeandalucia.cice.pfirma.mobile.type.v2.MobileRequest
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "request", targetNamespace = "")
    @RequestWrapper(localName = "queryRequest", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.QueryRequest")
    @ResponseWrapper(localName = "queryRequestResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.QueryRequestResponse")
    public MobileRequest queryRequest(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "requestId", targetNamespace = "")
        String requestId)
        throws MobileException
    ;

    /**
     * 
     * @param certificate
     * @param documentId
     * @return
     *     returns juntadeandalucia.cice.pfirma.mobile.type.v2.MobileDocument
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "document", targetNamespace = "")
    @RequestWrapper(localName = "documentPreview", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.DocumentPreview")
    @ResponseWrapper(localName = "documentPreviewResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.DocumentPreviewResponse")
    public MobileDocument documentPreview(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "documentId", targetNamespace = "")
        String documentId)
        throws MobileException
    ;

    /**
     * 
     * @param requestTagId
     * @param certificate
     * @return
     *     returns juntadeandalucia.cice.pfirma.mobile.type.v2.MobileDocumentList
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "documentList", targetNamespace = "")
    @RequestWrapper(localName = "getDocumentsToSign", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.GetDocumentsToSign")
    @ResponseWrapper(localName = "getDocumentsToSignResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.GetDocumentsToSignResponse")
    public MobileDocumentList getDocumentsToSign(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "requestTagId", targetNamespace = "")
        String requestTagId)
        throws MobileException
    ;

    /**
     * 
     * @param requestTagId
     * @param docSignInfoList
     * @param certificate
     * @return
     *     returns java.lang.String
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "saveSign", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.SaveSign")
    @ResponseWrapper(localName = "saveSignResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.SaveSignResponse")
    public String saveSign(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "requestTagId", targetNamespace = "")
        String requestTagId,
        @WebParam(name = "docSignInfoList", targetNamespace = "")
        MobileDocSignInfoList docSignInfoList)
        throws MobileException
    ;

    /**
     * 
     * @param certificate
     * @param textRejection
     * @param requestId
     * @return
     *     returns java.lang.String
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "responseId", targetNamespace = "")
    @RequestWrapper(localName = "rejectRequest", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.RejectRequest")
    @ResponseWrapper(localName = "rejectRequestResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.RejectRequestResponse")
    public String rejectRequest(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "requestId", targetNamespace = "")
        String requestId,
        @WebParam(name = "textRejection", targetNamespace = "")
        String textRejection)
        throws MobileException
    ;

    /**
     * 
     * @param certificate
     * @return
     *     returns juntadeandalucia.cice.pfirma.mobile.type.v2.MobileApplicationList
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "applicationList", targetNamespace = "")
    @RequestWrapper(localName = "queryApplicationsMobile", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.QueryApplicationsMobile")
    @ResponseWrapper(localName = "queryApplicationsMobileResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.QueryApplicationsMobileResponse")
    public MobileApplicationList queryApplicationsMobile(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate)
        throws MobileException
    ;

    /**
     * 
     * @param requestTagId
     * @param certificate
     * @return
     *     returns java.lang.String
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "responseId", targetNamespace = "")
    @RequestWrapper(localName = "approveRequest", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.ApproveRequest")
    @ResponseWrapper(localName = "approveRequestResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.ApproveRequestResponse")
    public String approveRequest(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "requestTagId", targetNamespace = "")
        String requestTagId)
        throws MobileException
    ;

    /**
     * 
     * @param certificate
     * @param documentId
     * @return
     *     returns juntadeandalucia.cice.pfirma.mobile.type.v2.MobileDocument
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "document", targetNamespace = "")
    @RequestWrapper(localName = "signPreview", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.SignPreview")
    @ResponseWrapper(localName = "signPreviewResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.SignPreviewResponse")
    public MobileDocument signPreview(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "documentId", targetNamespace = "")
        String documentId)
        throws MobileException
    ;

    /**
     * 
     * @param certificate
     * @param documentId
     * @return
     *     returns juntadeandalucia.cice.pfirma.mobile.type.v2.MobileDocument
     * @throws MobileException
     */
    @WebMethod
    @WebResult(name = "document", targetNamespace = "")
    @RequestWrapper(localName = "reportPreview", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.ReportPreview")
    @ResponseWrapper(localName = "reportPreviewResponse", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:request:v2.0", className = "juntadeandalucia.cice.pfirma.mobile.request.v2.ReportPreviewResponse")
    public MobileDocument reportPreview(
        @WebParam(name = "certificate", targetNamespace = "")
        byte[] certificate,
        @WebParam(name = "documentId", targetNamespace = "")
        String documentId)
        throws MobileException
    ;

}