//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:38 PM MST 
//


package generated.course;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *           &lt;element name="domainSessionLog"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                   &lt;attribute name="assessmentName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                   &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="capturedAudioFile" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
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
    "domainSessionLog",
    "capturedAudioFile"
})
@XmlRootElement(name = "logFile")
public class LogFile
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected LogFile.DomainSessionLog domainSessionLog;
    protected String capturedAudioFile;

    /**
     * Gets the value of the domainSessionLog property.
     * 
     * @return
     *     possible object is
     *     {@link LogFile.DomainSessionLog }
     *     
     */
    public LogFile.DomainSessionLog getDomainSessionLog() {
        return domainSessionLog;
    }

    /**
     * Sets the value of the domainSessionLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogFile.DomainSessionLog }
     *     
     */
    public void setDomainSessionLog(LogFile.DomainSessionLog value) {
        this.domainSessionLog = value;
    }

    /**
     * Gets the value of the capturedAudioFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapturedAudioFile() {
        return capturedAudioFile;
    }

    /**
     * Sets the value of the capturedAudioFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapturedAudioFile(String value) {
        this.capturedAudioFile = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="assessmentName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DomainSessionLog
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlValue
        protected String value;
        @XmlAttribute(name = "assessmentName", required = true)
        protected String assessmentName;
        @XmlAttribute(name = "start", required = true)
        protected BigInteger start;
        @XmlAttribute(name = "end", required = true)
        protected BigInteger end;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the assessmentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentName() {
            return assessmentName;
        }

        /**
         * Sets the value of the assessmentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentName(String value) {
            this.assessmentName = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStart(BigInteger value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEnd(BigInteger value) {
            this.end = value;
        }

    }

}
