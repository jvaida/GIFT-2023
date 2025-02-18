//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:38 PM MST 
//


package generated.course;

import java.io.Serializable;
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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://GIFT.com/common}LocalSKO"/&gt;
 *           &lt;element ref="{http://GIFT.com/common}ATRemoteSKO"/&gt;
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
    "script"
})
@XmlRootElement(name = "AutoTutorSKO")
public class AutoTutorSKO implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElements({
        @XmlElement(name = "LocalSKO", namespace = "http://GIFT.com/common", type = LocalSKO.class),
        @XmlElement(name = "ATRemoteSKO", namespace = "http://GIFT.com/common", type = ATRemoteSKO.class)
    })
    protected Serializable script;

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link LocalSKO }
     *     {@link ATRemoteSKO }
     *     
     */
    public Serializable getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalSKO }
     *     {@link ATRemoteSKO }
     *     
     */
    public void setScript(Serializable value) {
        this.script = value;
    }

}
