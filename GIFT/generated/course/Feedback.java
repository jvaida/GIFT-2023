//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:38 PM MST 
//


package generated.course;

import java.io.Serializable;
import java.math.BigDecimal;
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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://GIFT.com/pedagogicalStrategy}message"/&gt;
 *           &lt;element ref="{http://GIFT.com/pedagogicalStrategy}audio"/&gt;
 *           &lt;element ref="{http://GIFT.com/pedagogicalStrategy}mediaSemantics"/&gt;
 *           &lt;element name="file"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="HTML"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                           &lt;minLength value="6"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AffectiveFeedbackType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeedbackSpecificityType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeedbackDuration" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0.01"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://GIFT.com/pedagogicalStrategy}teamRef" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "messageOrAudioOrMediaSemantics",
    "affectiveFeedbackType",
    "feedbackSpecificityType",
    "feedbackDuration",
    "teamRef"
})
@XmlRootElement(name = "feedback", namespace = "http://GIFT.com/pedagogicalStrategy")
public class Feedback
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElements({
        @XmlElement(name = "message", namespace = "http://GIFT.com/pedagogicalStrategy", type = Message.class),
        @XmlElement(name = "audio", namespace = "http://GIFT.com/pedagogicalStrategy", type = Audio.class),
        @XmlElement(name = "mediaSemantics", namespace = "http://GIFT.com/pedagogicalStrategy", type = MediaSemantics.class),
        @XmlElement(name = "file", namespace = "http://GIFT.com/pedagogicalStrategy", type = Feedback.File.class)
    })
    protected Serializable messageOrAudioOrMediaSemantics;
    @XmlElement(name = "AffectiveFeedbackType", namespace = "http://GIFT.com/pedagogicalStrategy")
    protected String affectiveFeedbackType;
    @XmlElement(name = "FeedbackSpecificityType", namespace = "http://GIFT.com/pedagogicalStrategy")
    protected String feedbackSpecificityType;
    @XmlElement(name = "FeedbackDuration", namespace = "http://GIFT.com/pedagogicalStrategy")
    protected BigDecimal feedbackDuration;
    @XmlElement(namespace = "http://GIFT.com/pedagogicalStrategy")
    protected List<TeamRef> teamRef;

    /**
     * Gets the value of the messageOrAudioOrMediaSemantics property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     {@link Audio }
     *     {@link MediaSemantics }
     *     {@link Feedback.File }
     *     
     */
    public Serializable getMessageOrAudioOrMediaSemantics() {
        return messageOrAudioOrMediaSemantics;
    }

    /**
     * Sets the value of the messageOrAudioOrMediaSemantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     {@link Audio }
     *     {@link MediaSemantics }
     *     {@link Feedback.File }
     *     
     */
    public void setMessageOrAudioOrMediaSemantics(Serializable value) {
        this.messageOrAudioOrMediaSemantics = value;
    }

    /**
     * Gets the value of the affectiveFeedbackType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectiveFeedbackType() {
        return affectiveFeedbackType;
    }

    /**
     * Sets the value of the affectiveFeedbackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectiveFeedbackType(String value) {
        this.affectiveFeedbackType = value;
    }

    /**
     * Gets the value of the feedbackSpecificityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackSpecificityType() {
        return feedbackSpecificityType;
    }

    /**
     * Sets the value of the feedbackSpecificityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackSpecificityType(String value) {
        this.feedbackSpecificityType = value;
    }

    /**
     * Gets the value of the feedbackDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeedbackDuration() {
        return feedbackDuration;
    }

    /**
     * Sets the value of the feedbackDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeedbackDuration(BigDecimal value) {
        this.feedbackDuration = value;
    }

    /**
     * Gets the value of the teamRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamRef }
     * 
     * 
     */
    public List<TeamRef> getTeamRef() {
        if (teamRef == null) {
            teamRef = new ArrayList<TeamRef>();
        }
        return this.teamRef;
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
     *         &lt;element name="HTML"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="6"/&gt;
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
        "html"
    })
    public static class File implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(name = "HTML", namespace = "http://GIFT.com/pedagogicalStrategy", required = true)
        protected String html;

        /**
         * Gets the value of the html property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHTML() {
            return html;
        }

        /**
         * Sets the value of the html property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHTML(String value) {
            this.html = value;
        }

    }

}
