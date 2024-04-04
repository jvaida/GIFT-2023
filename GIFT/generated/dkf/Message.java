//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:35 PM MST 
//


package generated.dkf;

import java.io.Serializable;
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
 *         &lt;element name="content"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisplaySessionProperties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="requestUsingSessionState" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Delivery" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://GIFT.com/pedagogicalStrategy}ToObserverController" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://GIFT.com/pedagogicalStrategy}InTutor" minOccurs="0"/&gt;
 *                   &lt;element name="InTrainingApplication" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="enabled" type="{http://GIFT.com/common}booleanEnum"/&gt;
 *                             &lt;element name="MobileOption" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Vibrate"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "content",
    "displaySessionProperties",
    "delivery"
})
@XmlRootElement(name = "message", namespace = "http://GIFT.com/pedagogicalStrategy")
public class Message implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(namespace = "http://GIFT.com/pedagogicalStrategy", required = true)
    protected String content;
    @XmlElement(name = "DisplaySessionProperties", namespace = "http://GIFT.com/pedagogicalStrategy")
    protected Message.DisplaySessionProperties displaySessionProperties;
    @XmlElement(name = "Delivery", namespace = "http://GIFT.com/pedagogicalStrategy")
    protected Message.Delivery delivery;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the displaySessionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Message.DisplaySessionProperties }
     *     
     */
    public Message.DisplaySessionProperties getDisplaySessionProperties() {
        return displaySessionProperties;
    }

    /**
     * Sets the value of the displaySessionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message.DisplaySessionProperties }
     *     
     */
    public void setDisplaySessionProperties(Message.DisplaySessionProperties value) {
        this.displaySessionProperties = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link Message.Delivery }
     *     
     */
    public Message.Delivery getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message.Delivery }
     *     
     */
    public void setDelivery(Message.Delivery value) {
        this.delivery = value;
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
     *         &lt;element ref="{http://GIFT.com/pedagogicalStrategy}ToObserverController" minOccurs="0"/&gt;
     *         &lt;element ref="{http://GIFT.com/pedagogicalStrategy}InTutor" minOccurs="0"/&gt;
     *         &lt;element name="InTrainingApplication" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="enabled" type="{http://GIFT.com/common}booleanEnum"/&gt;
     *                   &lt;element name="MobileOption" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Vibrate"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
        "toObserverController",
        "inTutor",
        "inTrainingApplication"
    })
    public static class Delivery
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(name = "ToObserverController", namespace = "http://GIFT.com/pedagogicalStrategy")
        protected ToObserverController toObserverController;
        @XmlElement(name = "InTutor", namespace = "http://GIFT.com/pedagogicalStrategy")
        protected InTutor inTutor;
        @XmlElement(name = "InTrainingApplication", namespace = "http://GIFT.com/pedagogicalStrategy")
        protected Message.Delivery.InTrainingApplication inTrainingApplication;

        /**
         * Gets the value of the toObserverController property.
         * 
         * @return
         *     possible object is
         *     {@link ToObserverController }
         *     
         */
        public ToObserverController getToObserverController() {
            return toObserverController;
        }

        /**
         * Sets the value of the toObserverController property.
         * 
         * @param value
         *     allowed object is
         *     {@link ToObserverController }
         *     
         */
        public void setToObserverController(ToObserverController value) {
            this.toObserverController = value;
        }

        /**
         * Gets the value of the inTutor property.
         * 
         * @return
         *     possible object is
         *     {@link InTutor }
         *     
         */
        public InTutor getInTutor() {
            return inTutor;
        }

        /**
         * Sets the value of the inTutor property.
         * 
         * @param value
         *     allowed object is
         *     {@link InTutor }
         *     
         */
        public void setInTutor(InTutor value) {
            this.inTutor = value;
        }

        /**
         * Gets the value of the inTrainingApplication property.
         * 
         * @return
         *     possible object is
         *     {@link Message.Delivery.InTrainingApplication }
         *     
         */
        public Message.Delivery.InTrainingApplication getInTrainingApplication() {
            return inTrainingApplication;
        }

        /**
         * Sets the value of the inTrainingApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link Message.Delivery.InTrainingApplication }
         *     
         */
        public void setInTrainingApplication(Message.Delivery.InTrainingApplication value) {
            this.inTrainingApplication = value;
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
         *         &lt;element name="enabled" type="{http://GIFT.com/common}booleanEnum"/&gt;
         *         &lt;element name="MobileOption" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Vibrate"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
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
            "enabled",
            "mobileOption"
        })
        public static class InTrainingApplication
            implements Serializable
        {

            private final static long serialVersionUID = 12343L;
            @XmlElement(namespace = "http://GIFT.com/pedagogicalStrategy", required = true, defaultValue = "true")
            @XmlSchemaType(name = "normalizedString")
            protected BooleanEnum enabled;
            @XmlElement(name = "MobileOption", namespace = "http://GIFT.com/pedagogicalStrategy")
            protected Message.Delivery.InTrainingApplication.MobileOption mobileOption;

            /**
             * Gets the value of the enabled property.
             * 
             * @return
             *     possible object is
             *     {@link BooleanEnum }
             *     
             */
            public BooleanEnum getEnabled() {
                return enabled;
            }

            /**
             * Sets the value of the enabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link BooleanEnum }
             *     
             */
            public void setEnabled(BooleanEnum value) {
                this.enabled = value;
            }

            /**
             * Gets the value of the mobileOption property.
             * 
             * @return
             *     possible object is
             *     {@link Message.Delivery.InTrainingApplication.MobileOption }
             *     
             */
            public Message.Delivery.InTrainingApplication.MobileOption getMobileOption() {
                return mobileOption;
            }

            /**
             * Sets the value of the mobileOption property.
             * 
             * @param value
             *     allowed object is
             *     {@link Message.Delivery.InTrainingApplication.MobileOption }
             *     
             */
            public void setMobileOption(Message.Delivery.InTrainingApplication.MobileOption value) {
                this.mobileOption = value;
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
             *         &lt;element name="Vibrate"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
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
                "vibrate"
            })
            public static class MobileOption
                implements Serializable
            {

                private final static long serialVersionUID = 12343L;
                @XmlElement(name = "Vibrate", namespace = "http://GIFT.com/pedagogicalStrategy")
                protected boolean vibrate;

                /**
                 * Gets the value of the vibrate property.
                 * 
                 */
                public boolean isVibrate() {
                    return vibrate;
                }

                /**
                 * Sets the value of the vibrate property.
                 * 
                 */
                public void setVibrate(boolean value) {
                    this.vibrate = value;
                }

            }

        }

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
     *         &lt;element name="requestUsingSessionState" type="{http://GIFT.com/common}booleanEnum" minOccurs="0"/&gt;
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
        "requestUsingSessionState"
    })
    public static class DisplaySessionProperties
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(namespace = "http://GIFT.com/pedagogicalStrategy")
        @XmlSchemaType(name = "normalizedString")
        protected BooleanEnum requestUsingSessionState;

        /**
         * Gets the value of the requestUsingSessionState property.
         * 
         * @return
         *     possible object is
         *     {@link BooleanEnum }
         *     
         */
        public BooleanEnum getRequestUsingSessionState() {
            return requestUsingSessionState;
        }

        /**
         * Sets the value of the requestUsingSessionState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BooleanEnum }
         *     
         */
        public void setRequestUsingSessionState(BooleanEnum value) {
            this.requestUsingSessionState = value;
        }

    }

}