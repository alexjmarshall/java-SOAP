//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.03 at 04:34:03 PM MST 
//


package hello.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for score complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="score">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scoreId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scaleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score", propOrder = {
    "scoreId",
    "scaleName",
    "score"
})
public class Score {

    protected int scoreId;
    @XmlElement(required = true)
    protected String scaleName;
    protected float score;

    /**
     * Gets the value of the scoreId property.
     * 
     */
    public int getScoreId() {
        return scoreId;
    }

    /**
     * Sets the value of the scoreId property.
     * 
     */
    public void setScoreId(int value) {
        this.scoreId = value;
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

    /**
     * Gets the value of the score property.
     * 
     */
    public float getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(float value) {
        this.score = value;
    }

}