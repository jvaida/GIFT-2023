//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:35 PM MST 
//


package generated.dkf;

import java.io.Serializable;
import java.math.BigDecimal;
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
 *         &lt;element name="repeatable" type="{http://GIFT.com/common}booleanEnum"/&gt;
 *         &lt;element name="interval"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minExclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}teamMemberRefs" minOccurs="0"/&gt;
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
    "repeatable",
    "interval",
    "teamMemberRefs"
})
@XmlRootElement(name = "TimerConditionInput")
public class TimerConditionInput implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true, defaultValue = "false")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum repeatable;
    @XmlElement(required = true)
    protected BigDecimal interval;
    protected TeamMemberRefs teamMemberRefs;

    /**
     * Gets the value of the repeatable property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getRepeatable() {
        return repeatable;
    }

    /**
     * Sets the value of the repeatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setRepeatable(BooleanEnum value) {
        this.repeatable = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterval(BigDecimal value) {
        this.interval = value;
    }

    /**
     * Gets the value of the teamMemberRefs property.
     * 
     * @return
     *     possible object is
     *     {@link TeamMemberRefs }
     *     
     */
    public TeamMemberRefs getTeamMemberRefs() {
        return teamMemberRefs;
    }

    /**
     * Sets the value of the teamMemberRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamMemberRefs }
     *     
     */
    public void setTeamMemberRefs(TeamMemberRefs value) {
        this.teamMemberRefs = value;
    }

}