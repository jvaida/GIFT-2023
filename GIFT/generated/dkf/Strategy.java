//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:35 PM MST 
//


package generated.dkf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://GIFT.com/pedagogicalStrategy}instructionalIntervention"/&gt;
 *           &lt;element ref="{}midLessonMedia"/&gt;
 *           &lt;element ref="{}performanceAssessment"/&gt;
 *           &lt;element ref="{http://GIFT.com/pedagogicalStrategy}scenarioAdaptation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Stress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-1"/&gt;
 *               &lt;maxInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Difficulty" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-1"/&gt;
 *               &lt;maxInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shouldResetScenario" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strategyActivities",
    "stress",
    "difficulty",
    "shouldResetScenario"
})
@XmlRootElement(name = "strategy")
public class Strategy
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElements({
        @XmlElement(name = "instructionalIntervention", namespace = "http://GIFT.com/pedagogicalStrategy", type = InstructionalIntervention.class),
        @XmlElement(name = "midLessonMedia", type = MidLessonMedia.class),
        @XmlElement(name = "performanceAssessment", type = PerformanceAssessment.class),
        @XmlElement(name = "scenarioAdaptation", namespace = "http://GIFT.com/pedagogicalStrategy", type = ScenarioAdaptation.class)
    })
    protected List<Serializable> strategyActivities;
    @XmlElement(name = "Stress")
    protected BigDecimal stress;
    @XmlElement(name = "Difficulty")
    protected BigDecimal difficulty;
    @XmlElement(defaultValue = "false")
    protected Boolean shouldResetScenario;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the strategyActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionalIntervention }
     * {@link MidLessonMedia }
     * {@link PerformanceAssessment }
     * {@link ScenarioAdaptation }
     * 
     * 
     */
    public List<Serializable> getStrategyActivities() {
        if (strategyActivities == null) {
            strategyActivities = new ArrayList<Serializable>();
        }
        return this.strategyActivities;
    }

    /**
     * Gets the value of the stress property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStress() {
        return stress;
    }

    /**
     * Sets the value of the stress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStress(BigDecimal value) {
        this.stress = value;
    }

    /**
     * Gets the value of the difficulty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the value of the difficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDifficulty(BigDecimal value) {
        this.difficulty = value;
    }

    /**
     * Gets the value of the shouldResetScenario property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldResetScenario() {
        return shouldResetScenario;
    }

    /**
     * Sets the value of the shouldResetScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldResetScenario(Boolean value) {
        this.shouldResetScenario = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
