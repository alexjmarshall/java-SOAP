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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="localeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localizedName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locale", propOrder = {
    "localeId",
    "localeCode",
    "localeName",
    "localizedName"
})
public class Locale {

    protected int localeId;
    @XmlElement(required = true)
    protected String localeCode;
    @XmlElement(required = true)
    protected String localeName;
    @XmlElement(required = true)
    protected String localizedName;

    /**
     * Gets the value of the localeId property.
     * 
     */
    public int getLocaleId() {
        return localeId;
    }

    /**
     * Sets the value of the localeId property.
     * 
     */
    public void setLocaleId(int value) {
        this.localeId = value;
    }

    /**
     * Gets the value of the localeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCode() {
        return localeCode;
    }

    /**
     * Sets the value of the localeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCode(String value) {
        this.localeCode = value;
    }

    /**
     * Gets the value of the localeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleName() {
        return localeName;
    }

    /**
     * Sets the value of the localeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleName(String value) {
        this.localeName = value;
    }

    /**
     * Gets the value of the localizedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedName() {
        return localizedName;
    }

    /**
     * Sets the value of the localizedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizedName(String value) {
        this.localizedName = value;
    }

}
