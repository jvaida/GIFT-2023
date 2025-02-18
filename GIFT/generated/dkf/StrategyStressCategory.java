//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:35 PM MST 
//


package generated.dkf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyStressCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StrategyStressCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Environmental"/&gt;
 *     &lt;enumeration value="Cognitive"/&gt;
 *     &lt;enumeration value="Physiological"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StrategyStressCategory", namespace = "http://GIFT.com/pedagogicalStrategy")
@XmlEnum
public enum StrategyStressCategory {

    @XmlEnumValue("Environmental")
    ENVIRONMENTAL("Environmental"),
    @XmlEnumValue("Cognitive")
    COGNITIVE("Cognitive"),
    @XmlEnumValue("Physiological")
    PHYSIOLOGICAL("Physiological");
    private final String value;

    StrategyStressCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StrategyStressCategory fromValue(String v) {
        for (StrategyStressCategory c: StrategyStressCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
