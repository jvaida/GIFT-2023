//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:38 PM MST 
//


package generated.course;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}transitionName"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://GIFT.com/common}GIFTSurveyKey"/&gt;
 *           &lt;element ref="{}Conversation"/&gt;
 *           &lt;element ref="{}SurveyExport"/&gt;
 *           &lt;element name="ConceptSurvey"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="GIFTSurveyKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="SkipConceptsByExamination" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *                     &lt;element name="fullScreen" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *                     &lt;element ref="{}ConceptQuestions" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="fullScreen" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *         &lt;element name="showInAAR" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *         &lt;element name="disabled" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *         &lt;element name="sharedSurvey" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *         &lt;element ref="{}mandatoryOption" minOccurs="0"/&gt;
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
    "transitionName",
    "surveyChoice",
    "fullScreen",
    "showInAAR",
    "disabled",
    "sharedSurvey",
    "mandatoryOption"
})
@XmlRootElement(name = "PresentSurvey")
public class PresentSurvey implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String transitionName;
    @XmlElements({
        @XmlElement(name = "GIFTSurveyKey", namespace = "http://GIFT.com/common", type = String.class),
        @XmlElement(name = "Conversation", type = Conversation.class),
        @XmlElement(name = "SurveyExport", type = SurveyExport.class),
        @XmlElement(name = "ConceptSurvey", type = PresentSurvey.ConceptSurvey.class)
    })
    protected Serializable surveyChoice;
    @XmlElement(defaultValue = "true")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum fullScreen;
    @XmlElement(defaultValue = "true")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum showInAAR;
    @XmlElement(defaultValue = "false")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum disabled;
    @XmlElement(defaultValue = "false")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum sharedSurvey;
    protected MandatoryOption mandatoryOption;

    /**
     * Gets the value of the transitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionName() {
        return transitionName;
    }

    /**
     * Sets the value of the transitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionName(String value) {
        this.transitionName = value;
    }

    /**
     * Gets the value of the surveyChoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     {@link Conversation }
     *     {@link SurveyExport }
     *     {@link PresentSurvey.ConceptSurvey }
     *     
     */
    public Serializable getSurveyChoice() {
        return surveyChoice;
    }

    /**
     * Sets the value of the surveyChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     {@link Conversation }
     *     {@link SurveyExport }
     *     {@link PresentSurvey.ConceptSurvey }
     *     
     */
    public void setSurveyChoice(Serializable value) {
        this.surveyChoice = value;
    }

    /**
     * Gets the value of the fullScreen property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getFullScreen() {
        return fullScreen;
    }

    /**
     * Sets the value of the fullScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setFullScreen(BooleanEnum value) {
        this.fullScreen = value;
    }

    /**
     * Gets the value of the showInAAR property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getShowInAAR() {
        return showInAAR;
    }

    /**
     * Sets the value of the showInAAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setShowInAAR(BooleanEnum value) {
        this.showInAAR = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setDisabled(BooleanEnum value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the sharedSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getSharedSurvey() {
        return sharedSurvey;
    }

    /**
     * Sets the value of the sharedSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setSharedSurvey(BooleanEnum value) {
        this.sharedSurvey = value;
    }

    /**
     * Gets the value of the mandatoryOption property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOption }
     *     
     */
    public MandatoryOption getMandatoryOption() {
        return mandatoryOption;
    }

    /**
     * Sets the value of the mandatoryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOption }
     *     
     */
    public void setMandatoryOption(MandatoryOption value) {
        this.mandatoryOption = value;
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
     *         &lt;element name="GIFTSurveyKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SkipConceptsByExamination" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
     *         &lt;element name="fullScreen" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
     *         &lt;element ref="{}ConceptQuestions" maxOccurs="unbounded"/&gt;
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
        "giftSurveyKey",
        "skipConceptsByExamination",
        "fullScreen",
        "conceptQuestions"
    })
    public static class ConceptSurvey implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(name = "GIFTSurveyKey", required = true)
        protected String giftSurveyKey;
        @XmlElement(name = "SkipConceptsByExamination", defaultValue = "true")
        @XmlSchemaType(name = "normalizedString")
        protected BooleanEnum skipConceptsByExamination;
        @XmlElement(defaultValue = "true")
        @XmlSchemaType(name = "normalizedString")
        protected BooleanEnum fullScreen;
        @XmlElement(name = "ConceptQuestions", required = true)
        protected List<ConceptQuestions> conceptQuestions;

        /**
         * Gets the value of the giftSurveyKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGIFTSurveyKey() {
            return giftSurveyKey;
        }

        /**
         * Sets the value of the giftSurveyKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGIFTSurveyKey(String value) {
            this.giftSurveyKey = value;
        }

        /**
         * Gets the value of the skipConceptsByExamination property.
         * 
         * @return
         *     possible object is
         *     {@link BooleanEnum }
         *     
         */
        public BooleanEnum getSkipConceptsByExamination() {
            return skipConceptsByExamination;
        }

        /**
         * Sets the value of the skipConceptsByExamination property.
         * 
         * @param value
         *     allowed object is
         *     {@link BooleanEnum }
         *     
         */
        public void setSkipConceptsByExamination(BooleanEnum value) {
            this.skipConceptsByExamination = value;
        }

        /**
         * Gets the value of the fullScreen property.
         * 
         * @return
         *     possible object is
         *     {@link BooleanEnum }
         *     
         */
        public BooleanEnum getFullScreen() {
            return fullScreen;
        }

        /**
         * Sets the value of the fullScreen property.
         * 
         * @param value
         *     allowed object is
         *     {@link BooleanEnum }
         *     
         */
        public void setFullScreen(BooleanEnum value) {
            this.fullScreen = value;
        }

        /**
         * Gets the value of the conceptQuestions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptQuestions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConceptQuestions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConceptQuestions }
         * 
         * 
         */
        public List<ConceptQuestions> getConceptQuestions() {
            if (conceptQuestions == null) {
                conceptQuestions = new ArrayList<ConceptQuestions>();
            }
            return this.conceptQuestions;
        }

    }

}
