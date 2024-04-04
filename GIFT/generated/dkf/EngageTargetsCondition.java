//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:35 PM MST 
//


package generated.dkf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}teamMemberRefs"/&gt;
 *         &lt;element name="targetsToEngage"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice maxOccurs="unbounded"&gt;
 *                     &lt;element ref="{}teamMemberRef"/&gt;
 *                     &lt;element ref="{}pointRef"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="weaponConeAngle"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="360"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="weaponConeMaxDistance" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AtExpectationUpperBound"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AboveExpectationUpperBound"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "teamMemberRefs",
    "targetsToEngage",
    "weaponConeAngle",
    "weaponConeMaxDistance",
    "atExpectationUpperBound",
    "aboveExpectationUpperBound"
})
@XmlRootElement(name = "EngageTargetsCondition")
public class EngageTargetsCondition implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected TeamMemberRefs teamMemberRefs;
    @XmlElement(required = true)
    protected EngageTargetsCondition.TargetsToEngage targetsToEngage;
    @XmlElement(defaultValue = "30")
    protected int weaponConeAngle;
    @XmlElement(defaultValue = "300")
    protected BigInteger weaponConeMaxDistance;
    @XmlElement(name = "AtExpectationUpperBound", required = true, defaultValue = "5.0")
    protected BigDecimal atExpectationUpperBound;
    @XmlElement(name = "AboveExpectationUpperBound", required = true, defaultValue = "2.5")
    protected BigDecimal aboveExpectationUpperBound;

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
     * Gets the value of the targetsToEngage property.
     * 
     * @return
     *     possible object is
     *     {@link EngageTargetsCondition.TargetsToEngage }
     *     
     */
    public EngageTargetsCondition.TargetsToEngage getTargetsToEngage() {
        return targetsToEngage;
    }

    /**
     * Sets the value of the targetsToEngage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngageTargetsCondition.TargetsToEngage }
     *     
     */
    public void setTargetsToEngage(EngageTargetsCondition.TargetsToEngage value) {
        this.targetsToEngage = value;
    }

    /**
     * Gets the value of the weaponConeAngle property.
     * 
     */
    public int getWeaponConeAngle() {
        return weaponConeAngle;
    }

    /**
     * Sets the value of the weaponConeAngle property.
     * 
     */
    public void setWeaponConeAngle(int value) {
        this.weaponConeAngle = value;
    }

    /**
     * Gets the value of the weaponConeMaxDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeaponConeMaxDistance() {
        return weaponConeMaxDistance;
    }

    /**
     * Sets the value of the weaponConeMaxDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeaponConeMaxDistance(BigInteger value) {
        this.weaponConeMaxDistance = value;
    }

    /**
     * Gets the value of the atExpectationUpperBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAtExpectationUpperBound() {
        return atExpectationUpperBound;
    }

    /**
     * Sets the value of the atExpectationUpperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAtExpectationUpperBound(BigDecimal value) {
        this.atExpectationUpperBound = value;
    }

    /**
     * Gets the value of the aboveExpectationUpperBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAboveExpectationUpperBound() {
        return aboveExpectationUpperBound;
    }

    /**
     * Sets the value of the aboveExpectationUpperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAboveExpectationUpperBound(BigDecimal value) {
        this.aboveExpectationUpperBound = value;
    }


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
     *         &lt;choice maxOccurs="unbounded"&gt;
     *           &lt;element ref="{}teamMemberRef"/&gt;
     *           &lt;element ref="{}pointRef"/&gt;
     *         &lt;/choice&gt;
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
        "teamMemberRefOrPointRef"
    })
    public static class TargetsToEngage
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElements({
            @XmlElement(name = "teamMemberRef", type = String.class),
            @XmlElement(name = "pointRef", type = PointRef.class)
        })
        protected List<Serializable> teamMemberRefOrPointRef;

        /**
         * Gets the value of the teamMemberRefOrPointRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the teamMemberRefOrPointRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTeamMemberRefOrPointRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link PointRef }
         * 
         * 
         */
        public List<Serializable> getTeamMemberRefOrPointRef() {
            if (teamMemberRefOrPointRef == null) {
                teamMemberRefOrPointRef = new ArrayList<Serializable>();
            }
            return this.teamMemberRefOrPointRef;
        }

    }

}
