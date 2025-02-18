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
 *                 The Contribute complexType is the container for the entities (i.e. people, organizations) that have
 * contributed to the state of the learning object.
 *             
 * 
 * <p>Java class for ContributeLifeCycle.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContributeLifeCycle.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="role" type="{http://ltsc.ieee.org/xsd/LOM}RoleLifeCycle.Type" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{http://ltsc.ieee.org/xsd/LOM}CharacterString.Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://ltsc.ieee.org/xsd/LOM}DateTime.Type" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContributeLifeCycle.Type", propOrder = {
    "roleOrEntityOrDate"
})
public class ContributeLifeCycleType implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElements({
        @XmlElement(name = "role", type = RoleLifeCycleType.class),
        @XmlElement(name = "entity", type = String.class),
        @XmlElement(name = "date", type = DateTimeType.class)
    })
    protected List<Serializable> roleOrEntityOrDate;

    /**
     * Gets the value of the roleOrEntityOrDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleOrEntityOrDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleOrEntityOrDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleLifeCycleType }
     * {@link String }
     * {@link DateTimeType }
     * 
     * 
     */
    public List<Serializable> getRoleOrEntityOrDate() {
        if (roleOrEntityOrDate == null) {
            roleOrEntityOrDate = new ArrayList<Serializable>();
        }
        return this.roleOrEntityOrDate;
    }

}
