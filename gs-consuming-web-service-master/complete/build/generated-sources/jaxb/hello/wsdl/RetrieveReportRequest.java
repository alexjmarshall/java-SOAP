//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 12:27:18 AM MST 
//


package hello.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationToken" type="{http://psychometrics.com/webservices}authenticationToken"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="testId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticationToken",
    "userId",
    "testId",
    "reportId"
})
@XmlRootElement(name = "retrieveReportRequest")
public class RetrieveReportRequest {

    @XmlElement(required = true)
    protected AuthenticationToken authenticationToken;
    protected int userId;
    protected int testId;
    protected int reportId;

    /**
     * Gets the value of the authenticationToken property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationToken }
     *     
     */
    public AuthenticationToken getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Sets the value of the authenticationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationToken }
     *     
     */
    public void setAuthenticationToken(AuthenticationToken value) {
        this.authenticationToken = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the testId property.
     * 
     */
    public int getTestId() {
        return testId;
    }

    /**
     * Sets the value of the testId property.
     * 
     */
    public void setTestId(int value) {
        this.testId = value;
    }

    /**
     * Gets the value of the reportId property.
     * 
     */
    public int getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     */
    public void setReportId(int value) {
        this.reportId = value;
    }

}
