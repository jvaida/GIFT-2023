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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The LOM complexType is the container for the metadata instance.
 *             
 * 
 * <p>Java class for LOM.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOM.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="general" type="{http://ltsc.ieee.org/xsd/LOM}General.Type" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycle" type="{http://ltsc.ieee.org/xsd/LOM}LifeCycle.Type" minOccurs="0"/&gt;
 *         &lt;element name="metaMetadata" type="{http://ltsc.ieee.org/xsd/LOM}MetaMetadata.Type" minOccurs="0"/&gt;
 *         &lt;element name="technical" type="{http://ltsc.ieee.org/xsd/LOM}Technical.Type" minOccurs="0"/&gt;
 *         &lt;element name="educational" type="{http://ltsc.ieee.org/xsd/LOM}Educational.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rights" type="{http://ltsc.ieee.org/xsd/LOM}Rights.Type" minOccurs="0"/&gt;
 *         &lt;element name="relation" type="{http://ltsc.ieee.org/xsd/LOM}Relation.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="annotation" type="{http://ltsc.ieee.org/xsd/LOM}Annotation.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="classification" type="{http://ltsc.ieee.org/xsd/LOM}Classification.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOM.Type", propOrder = {
    "generalOrLifeCycleOrMetaMetadata"
})
public class LOMType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElements({
        @XmlElement(name = "general", type = GeneralType.class),
        @XmlElement(name = "lifeCycle", type = LifeCycleType.class),
        @XmlElement(name = "metaMetadata", type = MetaMetadataType.class),
        @XmlElement(name = "technical", type = TechnicalType.class),
        @XmlElement(name = "educational", type = EducationalType.class),
        @XmlElement(name = "rights", type = RightsType.class),
        @XmlElement(name = "relation", type = RelationType.class),
        @XmlElement(name = "annotation", type = AnnotationType.class),
        @XmlElement(name = "classification", type = ClassificationType.class)
    })
    protected List<Serializable> generalOrLifeCycleOrMetaMetadata;

    /**
     * Gets the value of the generalOrLifeCycleOrMetaMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalOrLifeCycleOrMetaMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralOrLifeCycleOrMetaMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralType }
     * {@link LifeCycleType }
     * {@link MetaMetadataType }
     * {@link TechnicalType }
     * {@link EducationalType }
     * {@link RightsType }
     * {@link RelationType }
     * {@link AnnotationType }
     * {@link ClassificationType }
     * 
     * 
     */
    public List<Serializable> getGeneralOrLifeCycleOrMetaMetadata() {
        if (generalOrLifeCycleOrMetaMetadata == null) {
            generalOrLifeCycleOrMetaMetadata = new ArrayList<Serializable>();
        }
        return this.generalOrLifeCycleOrMetaMetadata;
    }

}
