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
 * <p>Java class for scale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scaleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scaleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scale", propOrder = {
    "scaleId",
    "scaleName"
})
public class Scale {

    protected int scaleId;
    @XmlElement(required = true)
    protected String scaleName;

    /**
     * Gets the value of the scaleId property.
     * 
     */
    public int getScaleId() {
        return scaleId;
    }

    /**
     * Sets the value of the scaleId property.
     * 
     */
    public void setScaleId(int value) {
        this.scaleId = value;
    }

    /**
     * Gets the value of the scaleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleName() {
        return scaleName;
    }

    /**
     * Sets the value of the scaleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleName(String value) {
        this.scaleName = value;
    }

}
