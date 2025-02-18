//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:41 PM MST 
//


package generated.video;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for General.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="General.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="identifier" type="{http://ltsc.ieee.org/xsd/LOM}Identifier.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://ltsc.ieee.org/xsd/LOM}LangString.Type" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://ltsc.ieee.org/xsd/LOM}CharacterString.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://ltsc.ieee.org/xsd/LOM}LangString.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="keyword" type="{http://ltsc.ieee.org/xsd/LOM}LangString.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="coverage" type="{http://ltsc.ieee.org/xsd/LOM}LangString.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="structure" type="{http://ltsc.ieee.org/xsd/LOM}Structure.Type" minOccurs="0"/&gt;
 *         &lt;element name="aggregationLevel" type="{http://ltsc.ieee.org/xsd/LOM}AggregationLevel.Type" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "General.Type", propOrder = {
    "identifierOrTitleOrLanguage"
})
public class GeneralType implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElementRefs({
        @XmlElementRef(name = "identifier", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "language", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keyword", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "coverage", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "structure", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aggregationLevel", namespace = "http://ltsc.ieee.org/xsd/LOM", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> identifierOrTitleOrLanguage;

    /**
     * Gets the value of the identifierOrTitleOrLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifierOrTitleOrLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifierOrTitleOrLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link StructureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AggregationLevelType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getIdentifierOrTitleOrLanguage() {
        if (identifierOrTitleOrLanguage == null) {
            identifierOrTitleOrLanguage = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.identifierOrTitleOrLanguage;
    }

}
