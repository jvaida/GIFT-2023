//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:47 PM MST 
//


package generated.dkf;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ltiIdentifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}customParameters" minOccurs="0"/&gt;
 *         &lt;element name="allowScore" type="{http://GIFT.com/common}booleanEnum"/&gt;
 *         &lt;element name="sliderMinValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sliderMaxValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}ltiConcepts" minOccurs="0"/&gt;
 *         &lt;element name="isKnowledge" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *         &lt;element name="displayMode" type="{http://GIFT.com/common}DisplayModeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ltiIdentifier",
    "customParameters",
    "allowScore",
    "sliderMinValue",
    "sliderMaxValue",
    "ltiConcepts",
    "isKnowledge",
    "displayMode"
})
@XmlRootElement(name = "LtiProperties")
public class LtiProperties implements Serializable
{

    private final static long serialVersionUID = 123435L;
    @XmlElement(required = true)
    protected String ltiIdentifier;
    protected CustomParameters customParameters;
    @XmlElement(required = true, defaultValue = "true")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum allowScore;
    @XmlElement(defaultValue = "25")
    protected BigInteger sliderMinValue;
    @XmlElement(defaultValue = "75")
    protected BigInteger sliderMaxValue;
    protected LtiConcepts ltiConcepts;
    @XmlElement(defaultValue = "true")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum isKnowledge;
    @XmlElement(required = true, defaultValue = "Inline")
    @XmlSchemaType(name = "normalizedString")
    protected DisplayModeEnum displayMode;

    /**
     * Gets the value of the ltiIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtiIdentifier() {
        return ltiIdentifier;
    }

    /**
     * Sets the value of the ltiIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtiIdentifier(String value) {
        this.ltiIdentifier = value;
    }

    /**
     * Gets the value of the customParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getCustomParameters() {
        return customParameters;
    }

    /**
     * Sets the value of the customParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setCustomParameters(CustomParameters value) {
        this.customParameters = value;
    }

    /**
     * Gets the value of the allowScore property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getAllowScore() {
        return allowScore;
    }

    /**
     * Sets the value of the allowScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setAllowScore(BooleanEnum value) {
        this.allowScore = value;
    }

    /**
     * Gets the value of the sliderMinValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSliderMinValue() {
        return sliderMinValue;
    }

    /**
     * Sets the value of the sliderMinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSliderMinValue(BigInteger value) {
        this.sliderMinValue = value;
    }

    /**
     * Gets the value of the sliderMaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSliderMaxValue() {
        return sliderMaxValue;
    }

    /**
     * Sets the value of the sliderMaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSliderMaxValue(BigInteger value) {
        this.sliderMaxValue = value;
    }

    /**
     * Gets the value of the ltiConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link LtiConcepts }
     *     
     */
    public LtiConcepts getLtiConcepts() {
        return ltiConcepts;
    }

    /**
     * Sets the value of the ltiConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtiConcepts }
     *     
     */
    public void setLtiConcepts(LtiConcepts value) {
        this.ltiConcepts = value;
    }

    /**
     * Gets the value of the isKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getIsKnowledge() {
        return isKnowledge;
    }

    /**
     * Sets the value of the isKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setIsKnowledge(BooleanEnum value) {
        this.isKnowledge = value;
    }

    /**
     * Gets the value of the displayMode property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayModeEnum }
     *     
     */
    public DisplayModeEnum getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayModeEnum }
     *     
     */
    public void setDisplayMode(DisplayModeEnum value) {
        this.displayMode = value;
    }

}
