//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:52 PM MST 
//


package generated.sensor;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}Sensors"/&gt;
 *         &lt;element ref="{}Filters"/&gt;
 *         &lt;element ref="{}Writers"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version"&gt;
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
    "sensors",
    "filters",
    "writers"
})
@XmlRootElement(name = "SensorsConfiguration")
public class SensorsConfiguration
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Sensors", required = true)
    protected Sensors sensors;
    @XmlElement(name = "Filters", required = true)
    protected Filters filters;
    @XmlElement(name = "Writers", required = true)
    protected Writers writers;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the sensors property.
     * 
     * @return
     *     possible object is
     *     {@link Sensors }
     *     
     */
    public Sensors getSensors() {
        return sensors;
    }

    /**
     * Sets the value of the sensors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sensors }
     *     
     */
    public void setSensors(Sensors value) {
        this.sensors = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link Filters }
     *     
     */
    public Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filters }
     *     
     */
    public void setFilters(Filters value) {
        this.filters = value;
    }

    /**
     * Gets the value of the writers property.
     * 
     * @return
     *     possible object is
     *     {@link Writers }
     *     
     */
    public Writers getWriters() {
        return writers;
    }

    /**
     * Sets the value of the writers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Writers }
     *     
     */
    public void setWriters(Writers value) {
        this.writers = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
