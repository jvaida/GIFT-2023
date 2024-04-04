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
 *         &lt;element name="maxDistance" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxAngle"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *               &lt;maxExclusive value="180"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}teamMemberRefs"/&gt;
 *         &lt;element name="useWeaponSafety" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}RealTimeAssessmentRules" minOccurs="0"/&gt;
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
    "maxDistance",
    "maxAngle",
    "teamMemberRefs",
    "useWeaponSafety",
    "realTimeAssessmentRules"
})
@XmlRootElement(name = "MuzzleFlaggingCondition")
public class MuzzleFlaggingCondition implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected BigDecimal maxDistance;
    @XmlElement(required = true)
    protected BigDecimal maxAngle;
    @XmlElement(required = true)
    protected TeamMemberRefs teamMemberRefs;
    @XmlElement(defaultValue = "true")
    protected Boolean useWeaponSafety;
    @XmlElement(name = "RealTimeAssessmentRules")
    protected RealTimeAssessmentRules realTimeAssessmentRules;

    /**
     * Gets the value of the maxDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxDistance() {
        return maxDistance;
    }

    /**
     * Sets the value of the maxDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxDistance(BigDecimal value) {
        this.maxDistance = value;
    }

    /**
     * Gets the value of the maxAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAngle() {
        return maxAngle;
    }

    /**
     * Sets the value of the maxAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAngle(BigDecimal value) {
        this.maxAngle = value;
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

    /**
     * Gets the value of the useWeaponSafety property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseWeaponSafety() {
        return useWeaponSafety;
    }

    /**
     * Sets the value of the useWeaponSafety property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseWeaponSafety(Boolean value) {
        this.useWeaponSafety = value;
    }

    /**
     * Gets the value of the realTimeAssessmentRules property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeAssessmentRules }
     *     
     */
    public RealTimeAssessmentRules getRealTimeAssessmentRules() {
        return realTimeAssessmentRules;
    }

    /**
     * Sets the value of the realTimeAssessmentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeAssessmentRules }
     *     
     */
    public void setRealTimeAssessmentRules(RealTimeAssessmentRules value) {
        this.realTimeAssessmentRules = value;
    }

}
