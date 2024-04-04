//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:38 PM MST 
//


package generated.course;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PresentSurvey"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="ConceptSurvey"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="GIFTSurveyKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element ref="{}ConceptQuestions" maxOccurs="unbounded"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="fullScreen" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *                   &lt;element name="showInAAR" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AllowedAttempts" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
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
    "presentSurvey",
    "allowedAttempts"
})
@XmlRootElement(name = "Recall")
public class Recall implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PresentSurvey", required = true)
    protected Recall.PresentSurvey presentSurvey;
    @XmlElement(name = "AllowedAttempts", defaultValue = "3")
    protected BigInteger allowedAttempts;

    /**
     * Gets the value of the presentSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Recall.PresentSurvey }
     *     
     */
    public Recall.PresentSurvey getPresentSurvey() {
        return presentSurvey;
    }

    /**
     * Sets the value of the presentSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recall.PresentSurvey }
     *     
     */
    public void setPresentSurvey(Recall.PresentSurvey value) {
        this.presentSurvey = value;
    }

    /**
     * Gets the value of the allowedAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllowedAttempts() {
        return allowedAttempts;
    }

    /**
     * Sets the value of the allowedAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllowedAttempts(BigInteger value) {
        this.allowedAttempts = value;
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
     *         &lt;choice&gt;
     *           &lt;element name="ConceptSurvey"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="GIFTSurveyKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                     &lt;element ref="{}ConceptQuestions" maxOccurs="unbounded"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="fullScreen" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
     *         &lt;element name="showInAAR" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
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
        "surveyChoice",
        "fullScreen",
        "showInAAR"
    })
    public static class PresentSurvey
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(name = "ConceptSurvey")
        protected Recall.PresentSurvey.ConceptSurvey surveyChoice;
        @XmlElement(defaultValue = "true")
        @XmlSchemaType(name = "normalizedString")
        protected BooleanEnum fullScreen;
        @XmlElement(defaultValue = "true")
        @XmlSchemaType(name = "normalizedString")
        protected BooleanEnum showInAAR;

        /**
         * Gets the value of the surveyChoice property.
         * 
         * @return
         *     possible object is
         *     {@link Recall.PresentSurvey.ConceptSurvey }
         *     
         */
        public Recall.PresentSurvey.ConceptSurvey getSurveyChoice() {
            return surveyChoice;
        }

        /**
         * Sets the value of the surveyChoice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Recall.PresentSurvey.ConceptSurvey }
         *     
         */
        public void setSurveyChoice(Recall.PresentSurvey.ConceptSurvey value) {
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
            "conceptQuestions"
        })
        public static class ConceptSurvey
            implements Serializable
        {

            private final static long serialVersionUID = 12343L;
            @XmlElement(name = "GIFTSurveyKey", required = true)
            protected String giftSurveyKey;
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

}
