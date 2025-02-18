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
 *         &lt;element ref="{}directoryToWrite" minOccurs="0"/&gt;
 *         &lt;element ref="{}filePrefix"/&gt;
 *         &lt;element ref="{}datumDelimReplacementChar" minOccurs="0"/&gt;
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
    "directoryToWrite",
    "filePrefix",
    "datumDelimReplacementChar"
})
@XmlRootElement(name = "GenericSensorDelimitedWriter")
public class GenericSensorDelimitedWriter implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(defaultValue = "output/domainSessions")
    protected String directoryToWrite;
    @XmlElement(required = true)
    protected String filePrefix;
    protected String datumDelimReplacementChar;

    /**
     * Gets the value of the directoryToWrite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryToWrite() {
        return directoryToWrite;
    }

    /**
     * Sets the value of the directoryToWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryToWrite(String value) {
        this.directoryToWrite = value;
    }

    /**
     * Gets the value of the filePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePrefix() {
        return filePrefix;
    }

    /**
     * Sets the value of the filePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePrefix(String value) {
        this.filePrefix = value;
    }

    /**
     * Gets the value of the datumDelimReplacementChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumDelimReplacementChar() {
        return datumDelimReplacementChar;
    }

    /**
     * Sets the value of the datumDelimReplacementChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumDelimReplacementChar(String value) {
        this.datumDelimReplacementChar = value;
    }

}
