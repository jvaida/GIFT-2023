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
 *         &lt;element name="loadArgs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ScenarioName" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
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
    "loadArgs"
})
@XmlRootElement(name = "VBSInteropInputs")
public class VBSInteropInputs implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected VBSInteropInputs.LoadArgs loadArgs;

    /**
     * Gets the value of the loadArgs property.
     * 
     * @return
     *     possible object is
     *     {@link VBSInteropInputs.LoadArgs }
     *     
     */
    public VBSInteropInputs.LoadArgs getLoadArgs() {
        return loadArgs;
    }

    /**
     * Sets the value of the loadArgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VBSInteropInputs.LoadArgs }
     *     
     */
    public void setLoadArgs(VBSInteropInputs.LoadArgs value) {
        this.loadArgs = value;
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
     *         &lt;element name="ScenarioName" minOccurs="0"&gt;
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
        "scenarioName"
    })
    public static class LoadArgs
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(name = "ScenarioName")
        protected String scenarioName;

        /**
         * Gets the value of the scenarioName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScenarioName() {
            return scenarioName;
        }

        /**
         * Sets the value of the scenarioName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScenarioName(String value) {
            this.scenarioName = value;
        }

    }

}
