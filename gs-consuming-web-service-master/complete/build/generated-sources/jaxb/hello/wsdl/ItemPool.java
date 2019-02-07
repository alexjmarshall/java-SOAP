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
 * <p>Java class for itemPool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemPool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poolId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="poolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poolItems" type="{http://psychometrics.com/webservices}poolItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemPool", propOrder = {
    "poolId",
    "poolName",
    "poolItems"
})
public class ItemPool {

    protected int poolId;
    @XmlElement(required = true)
    protected String poolName;
    @XmlElement(required = true)
    protected List<PoolItem> poolItems;

    /**
     * Gets the value of the poolId property.
     * 
     */
    public int getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     */
    public void setPoolId(int value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the poolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * Sets the value of the poolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolName(String value) {
        this.poolName = value;
    }

    /**
     * Gets the value of the poolItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poolItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoolItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoolItem }
     * 
     * 
     */
    public List<PoolItem> getPoolItems() {
        if (poolItems == null) {
            poolItems = new ArrayList<PoolItem>();
        }
        return this.poolItems;
    }

}
