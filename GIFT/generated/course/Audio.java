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
 *         &lt;element ref="{http://GIFT.com/pedagogicalStrategy}ToObserverController" minOccurs="0"/&gt;
 *         &lt;element name="OGGFile" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MP3File"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="5"/&gt;
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
    "toObserverController",
    "oggFile",
    "mp3File"
})
@XmlRootElement(name = "audio", namespace = "http://GIFT.com/pedagogicalStrategy")
public class Audio implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ToObserverController", namespace = "http://GIFT.com/pedagogicalStrategy")
    protected ToObserverController toObserverController;
    @XmlElement(name = "OGGFile", namespace = "http://GIFT.com/pedagogicalStrategy")
    protected String oggFile;
    @XmlElement(name = "MP3File", namespace = "http://GIFT.com/pedagogicalStrategy", required = true)
    protected String mp3File;

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
     * Gets the value of the oggFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGGFile() {
        return oggFile;
    }

    /**
     * Sets the value of the oggFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGGFile(String value) {
        this.oggFile = value;
    }

    /**
     * Gets the value of the mp3File property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMP3File() {
        return mp3File;
    }

    /**
     * Sets the value of the mp3File property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMP3File(String value) {
        this.mp3File = value;
    }

}
