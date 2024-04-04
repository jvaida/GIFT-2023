//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:35 PM MST 
//


package generated.dkf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}entrance" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}teamMemberRef" minOccurs="0"/&gt;
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
    "entrance",
    "teamMemberRef"
})
@XmlRootElement(name = "EnterAreaCondition")
public class EnterAreaCondition implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected List<Entrance> entrance;
    protected String teamMemberRef;

    /**
     * Gets the value of the entrance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entrance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntrance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entrance }
     * 
     * 
     */
    public List<Entrance> getEntrance() {
        if (entrance == null) {
            entrance = new ArrayList<Entrance>();
        }
        return this.entrance;
    }

    /**
     * Gets the value of the teamMemberRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberRef() {
        return teamMemberRef;
    }

    /**
     * Sets the value of the teamMemberRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberRef(String value) {
        this.teamMemberRef = value;
    }

}