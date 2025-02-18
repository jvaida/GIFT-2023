//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:56 PM MST 
//


package generated.ped;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActorTypeCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActorTypeCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Vehicle"/&gt;
 *     &lt;enumeration value="Person"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActorTypeCategoryEnum", namespace = "http://GIFT.com/common")
@XmlEnum
public enum ActorTypeCategoryEnum {

    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ActorTypeCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActorTypeCategoryEnum fromValue(String v) {
        for (ActorTypeCategoryEnum c: ActorTypeCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
