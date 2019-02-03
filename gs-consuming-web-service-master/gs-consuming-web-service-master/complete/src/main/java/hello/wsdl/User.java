//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.03 at 04:34:03 PM MST 
//


package hello.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="demographics" type="{http://psychometrics.com/webservices}demographic" maxOccurs="unbounded"/>
 *         &lt;element name="testResults" type="{http://psychometrics.com/webservices}testResult" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "userId",
    "firstName",
    "lastName",
    "accessUrl",
    "demographics",
    "testResults"
})
public class User {

    protected int userId;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String accessUrl;
    @XmlElement(required = true)
    protected List<Demographic> demographics;
    @XmlElement(required = true)
    protected List<TestResult> testResults;

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the accessUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessUrl() {
        return accessUrl;
    }

    /**
     * Sets the value of the accessUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessUrl(String value) {
        this.accessUrl = value;
    }

    /**
     * Gets the value of the demographics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demographics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemographics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Demographic }
     * 
     * 
     */
    public List<Demographic> getDemographics() {
        if (demographics == null) {
            demographics = new ArrayList<Demographic>();
        }
        return this.demographics;
    }

    /**
     * Gets the value of the testResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestResult }
     * 
     * 
     */
    public List<TestResult> getTestResults() {
        if (testResults == null) {
            testResults = new ArrayList<TestResult>();
        }
        return this.testResults;
    }

}
