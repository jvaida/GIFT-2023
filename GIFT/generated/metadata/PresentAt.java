//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:43 PM MST 
//


package generated.metadata;

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
 *         &lt;element name="remediationOnly" type="{http://GIFT.com/common}booleanEnum"/&gt;
 *         &lt;element ref="{}MerrillQuadrant" minOccurs="0"/&gt;
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
    "remediationOnly",
    "merrillQuadrant"
})
@XmlRootElement(name = "PresentAt", namespace = "")
public class PresentAt
    implements Serializable
{

    private final static long serialVersionUID = 123435L;
    @XmlElement(required = true, defaultValue = "false")
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum remediationOnly;
    @XmlElement(name = "MerrillQuadrant", defaultValue = "Example")
    protected String merrillQuadrant;

    /**
     * Gets the value of the remediationOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getRemediationOnly() {
        return remediationOnly;
    }

    /**
     * Sets the value of the remediationOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setRemediationOnly(BooleanEnum value) {
        this.remediationOnly = value;
    }

    /**
     * Gets the value of the merrillQuadrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerrillQuadrant() {
        return merrillQuadrant;
    }

    /**
     * Sets the value of the merrillQuadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerrillQuadrant(String value) {
        this.merrillQuadrant = value;
    }

}
