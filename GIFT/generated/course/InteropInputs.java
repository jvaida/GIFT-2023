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
 *         &lt;choice&gt;
 *           &lt;element ref="{}CustomInteropInputs"/&gt;
 *           &lt;element ref="{}DISInteropInputs"/&gt;
 *           &lt;element ref="{}EmptyInteropInputs"/&gt;
 *           &lt;element ref="{}GenericLoadInteropInputs"/&gt;
 *           &lt;element ref="{}PowerPointInteropInputs"/&gt;
 *           &lt;element ref="{}SCATTInteropInputs"/&gt;
 *           &lt;element ref="{}SimpleExampleTAInteropInputs"/&gt;
 *           &lt;element ref="{}TC3InteropInputs"/&gt;
 *           &lt;element ref="{}DETestbedInteropInputs"/&gt;
 *           &lt;element ref="{}MyPluginInputs"/&gt;
 *           &lt;element ref="{}VBSInteropInputs"/&gt;
 *           &lt;element ref="{}VREngageInteropInputs"/&gt;
 *           &lt;element ref="{}UnityInteropInputs"/&gt;
 *           &lt;element ref="{}HAVENInteropInputs"/&gt;
 *           &lt;element ref="{}RIDEInteropInputs"/&gt;
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
    "interopInput"
})
@XmlRootElement(name = "InteropInputs")
public class InteropInputs
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElements({
        @XmlElement(name = "CustomInteropInputs", type = CustomInteropInputs.class),
        @XmlElement(name = "DISInteropInputs", type = DISInteropInputs.class),
        @XmlElement(name = "EmptyInteropInputs", type = EmptyInteropInputs.class),
        @XmlElement(name = "GenericLoadInteropInputs", type = GenericLoadInteropInputs.class),
        @XmlElement(name = "PowerPointInteropInputs", type = PowerPointInteropInputs.class),
        @XmlElement(name = "SCATTInteropInputs", type = SCATTInteropInputs.class),
        @XmlElement(name = "SimpleExampleTAInteropInputs", type = SimpleExampleTAInteropInputs.class),
        @XmlElement(name = "TC3InteropInputs", type = TC3InteropInputs.class),
        @XmlElement(name = "DETestbedInteropInputs", type = DETestbedInteropInputs.class),
        @XmlElement(name = "MyPluginInputs", type = MyPluginInputs.class),
        @XmlElement(name = "VBSInteropInputs", type = VBSInteropInputs.class),
        @XmlElement(name = "VREngageInteropInputs", type = VREngageInteropInputs.class),
        @XmlElement(name = "UnityInteropInputs", type = UnityInteropInputs.class),
        @XmlElement(name = "HAVENInteropInputs", type = HAVENInteropInputs.class),
        @XmlElement(name = "RIDEInteropInputs", type = RIDEInteropInputs.class)
    })
    protected Serializable interopInput;

    /**
     * Gets the value of the interopInput property.
     * 
     * @return
     *     possible object is
     *     {@link CustomInteropInputs }
     *     {@link DISInteropInputs }
     *     {@link EmptyInteropInputs }
     *     {@link GenericLoadInteropInputs }
     *     {@link PowerPointInteropInputs }
     *     {@link SCATTInteropInputs }
     *     {@link SimpleExampleTAInteropInputs }
     *     {@link TC3InteropInputs }
     *     {@link DETestbedInteropInputs }
     *     {@link MyPluginInputs }
     *     {@link VBSInteropInputs }
     *     {@link VREngageInteropInputs }
     *     {@link UnityInteropInputs }
     *     {@link HAVENInteropInputs }
     *     {@link RIDEInteropInputs }
     *     
     */
    public Serializable getInteropInput() {
        return interopInput;
    }

    /**
     * Sets the value of the interopInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomInteropInputs }
     *     {@link DISInteropInputs }
     *     {@link EmptyInteropInputs }
     *     {@link GenericLoadInteropInputs }
     *     {@link PowerPointInteropInputs }
     *     {@link SCATTInteropInputs }
     *     {@link SimpleExampleTAInteropInputs }
     *     {@link TC3InteropInputs }
     *     {@link DETestbedInteropInputs }
     *     {@link MyPluginInputs }
     *     {@link VBSInteropInputs }
     *     {@link VREngageInteropInputs }
     *     {@link UnityInteropInputs }
     *     {@link HAVENInteropInputs }
     *     {@link RIDEInteropInputs }
     *     
     */
    public void setInteropInput(Serializable value) {
        this.interopInput = value;
    }

}
