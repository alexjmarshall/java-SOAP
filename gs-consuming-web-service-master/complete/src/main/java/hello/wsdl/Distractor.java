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
 * <p>Java class for distractor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distractor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distractorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="distractorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distractorText" type="{http://psychometrics.com/webservices}distractorText" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distractor", propOrder = {
    "distractorId",
    "position",
    "distractorName",
    "distractorText"
})
public class Distractor {

    protected int distractorId;
    protected int position;
    @XmlElement(required = true)
    protected String distractorName;
    @XmlElement(required = true)
    protected List<DistractorText> distractorText;

    /**
     * Gets the value of the distractorId property.
     * 
     */
    public int getDistractorId() {
        return distractorId;
    }

    /**
     * Sets the value of the distractorId property.
     * 
     */
    public void setDistractorId(int value) {
        this.distractorId = value;
    }

    /**
     * Gets the value of the position property.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Gets the value of the distractorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistractorName() {
        return distractorName;
    }

    /**
     * Sets the value of the distractorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistractorName(String value) {
        this.distractorName = value;
    }

    /**
     * Gets the value of the distractorText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distractorText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistractorText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistractorText }
     * 
     * 
     */
    public List<DistractorText> getDistractorText() {
        if (distractorText == null) {
            distractorText = new ArrayList<DistractorText>();
        }
        return this.distractorText;
    }

}
