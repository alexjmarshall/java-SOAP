//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 12:27:18 AM MST 
//


package hello.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poolItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="poolItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minResponses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxResponses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="distractors" type="{http://psychometrics.com/webservices}distractor" maxOccurs="unbounded"/>
 *         &lt;element name="itemText" type="{http://psychometrics.com/webservices}itemText" maxOccurs="unbounded"/>
 *         &lt;element name="scales" type="{http://psychometrics.com/webservices}scale" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "poolItem", propOrder = {
    "itemId",
    "itemName",
    "position",
    "minResponses",
    "maxResponses",
    "distractors",
    "itemText",
    "scales"
})
public class PoolItem {

    protected int itemId;
    @XmlElement(required = true)
    protected String itemName;
    protected int position;
    protected int minResponses;
    protected int maxResponses;
    @XmlElement(required = true)
    protected List<Distractor> distractors;
    @XmlElement(required = true)
    protected List<ItemText> itemText;
    @XmlElement(required = true)
    protected List<Scale> scales;

    /**
     * Gets the value of the itemId property.
     * 
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(int value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
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
     * Gets the value of the minResponses property.
     * 
     */
    public int getMinResponses() {
        return minResponses;
    }

    /**
     * Sets the value of the minResponses property.
     * 
     */
    public void setMinResponses(int value) {
        this.minResponses = value;
    }

    /**
     * Gets the value of the maxResponses property.
     * 
     */
    public int getMaxResponses() {
        return maxResponses;
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     */
    public void setMaxResponses(int value) {
        this.maxResponses = value;
    }

    /**
     * Gets the value of the distractors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distractors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistractors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Distractor }
     * 
     * 
     */
    public List<Distractor> getDistractors() {
        if (distractors == null) {
            distractors = new ArrayList<Distractor>();
        }
        return this.distractors;
    }

    /**
     * Gets the value of the itemText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemText }
     * 
     * 
     */
    public List<ItemText> getItemText() {
        if (itemText == null) {
            itemText = new ArrayList<ItemText>();
        }
        return this.itemText;
    }

    /**
     * Gets the value of the scales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scale }
     * 
     * 
     */
    public List<Scale> getScales() {
        if (scales == null) {
            scales = new ArrayList<Scale>();
        }
        return this.scales;
    }

}
