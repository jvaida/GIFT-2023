//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:50 PM MST 
//


package generated.gateway;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.gateway package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Impl_QNAME = new QName("", "impl");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _NetworkPort_QNAME = new QName("", "networkPort");
    private final static QName _NetworkAddress_QNAME = new QName("", "networkAddress");
    private final static QName _ExerciseID_QNAME = new QName("", "exerciseID");
    private final static QName _SiteID_QNAME = new QName("", "siteID");
    private final static QName _ApplicationID_QNAME = new QName("", "applicationID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.gateway
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InteropConfig }
     * 
     */
    public InteropConfig createInteropConfig() {
        return new InteropConfig();
    }

    /**
     * Create an instance of {@link InterfaceConfigurations }
     * 
     */
    public InterfaceConfigurations createInterfaceConfigurations() {
        return new InterfaceConfigurations();
    }

    /**
     * Create an instance of {@link InteropInterfaceConfig }
     * 
     */
    public InteropInterfaceConfig createInteropInterfaceConfig() {
        return new InteropInterfaceConfig();
    }

    /**
     * Create an instance of {@link AdaptiveLearningServiceBus }
     * 
     */
    public AdaptiveLearningServiceBus createAdaptiveLearningServiceBus() {
        return new AdaptiveLearningServiceBus();
    }

    /**
     * Create an instance of {@link DIS }
     * 
     */
    public DIS createDIS() {
        return new DIS();
    }

    /**
     * Create an instance of {@link VBS }
     * 
     */
    public VBS createVBS() {
        return new VBS();
    }

    /**
     * Create an instance of {@link PPT }
     * 
     */
    public PPT createPPT() {
        return new PPT();
    }

    /**
     * Create an instance of {@link TC3 }
     * 
     */
    public TC3 createTC3() {
        return new TC3();
    }

    /**
     * Create an instance of {@link SCATT }
     * 
     */
    public SCATT createSCATT() {
        return new SCATT();
    }

    /**
     * Create an instance of {@link XMLRPC }
     * 
     */
    public XMLRPC createXMLRPC() {
        return new XMLRPC();
    }

    /**
     * Create an instance of {@link REST }
     * 
     */
    public REST createREST() {
        return new REST();
    }

    /**
     * Create an instance of {@link ARES }
     * 
     */
    public ARES createARES() {
        return new ARES();
    }

    /**
     * Create an instance of {@link AMQP }
     * 
     */
    public AMQP createAMQP() {
        return new AMQP();
    }

    /**
     * Create an instance of {@link VREngage }
     * 
     */
    public VREngage createVREngage() {
        return new VREngage();
    }

    /**
     * Create an instance of {@link Unity }
     * 
     */
    public Unity createUnity() {
        return new Unity();
    }

    /**
     * Create an instance of {@link SESandbox }
     * 
     */
    public SESandbox createSESandbox() {
        return new SESandbox();
    }

    /**
     * Create an instance of {@link RIDE }
     * 
     */
    public RIDE createRIDE() {
        return new RIDE();
    }

    /**
     * Create an instance of {@link MyPluginXMLRPC }
     * 
     */
    public MyPluginXMLRPC createMyPluginXMLRPC() {
        return new MyPluginXMLRPC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "impl")
    public JAXBElement<String> createImpl(String value) {
        return new JAXBElement<String>(_Impl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "networkPort")
    public JAXBElement<Integer> createNetworkPort(Integer value) {
        return new JAXBElement<Integer>(_NetworkPort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "networkAddress")
    public JAXBElement<String> createNetworkAddress(String value) {
        return new JAXBElement<String>(_NetworkAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "exerciseID")
    public JAXBElement<Integer> createExerciseID(Integer value) {
        return new JAXBElement<Integer>(_ExerciseID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "siteID")
    public JAXBElement<BigInteger> createSiteID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SiteID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "applicationID")
    public JAXBElement<BigInteger> createApplicationID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ApplicationID_QNAME, BigInteger.class, null, value);
    }

}
