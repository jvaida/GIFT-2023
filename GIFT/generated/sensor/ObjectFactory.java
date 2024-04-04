//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:52 PM MST 
//


package generated.sensor;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.sensor package. 
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

    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Interval_QNAME = new QName("", "interval");
    private final static QName _SensorImpl_QNAME = new QName("", "sensorImpl");
    private final static QName _DistributeExternally_QNAME = new QName("", "distributeExternally");
    private final static QName _RateChangeAmount_QNAME = new QName("", "rateChangeAmount");
    private final static QName _UseAffective_QNAME = new QName("", "UseAffective");
    private final static QName _TemperatureRateChangeAmount_QNAME = new QName("", "temperatureRateChangeAmount");
    private final static QName _HumidityRateChangeAmount_QNAME = new QName("", "humidityRateChangeAmount");
    private final static QName _Amplitude_QNAME = new QName("", "amplitude");
    private final static QName _Period_QNAME = new QName("", "period");
    private final static QName _VhtActiveMqUrl_QNAME = new QName("", "vhtActiveMqUrl");
    private final static QName _VhtActiveMqTopic_QNAME = new QName("", "vhtActiveMqTopic");
    private final static QName _DatalessWarningDelay_QNAME = new QName("", "datalessWarningDelay");
    private final static QName _SkeletonAndFaceTrackingSampleInterval_QNAME = new QName("", "skeletonAndFaceTrackingSampleInterval");
    private final static QName _ColorSampleInterval_QNAME = new QName("", "colorSampleInterval");
    private final static QName _DepthSampleInterval_QNAME = new QName("", "depthSampleInterval");
    private final static QName _NearMode_QNAME = new QName("", "nearMode");
    private final static QName _ColorFrameFormat_QNAME = new QName("", "colorFrameFormat");
    private final static QName _DepthFrameFormat_QNAME = new QName("", "depthFrameFormat");
    private final static QName _NetworkPort_QNAME = new QName("", "networkPort");
    private final static QName _FilterInstance_QNAME = new QName("", "filterInstance");
    private final static QName _WriterInstance_QNAME = new QName("", "writerInstance");
    private final static QName _FilterImpl_QNAME = new QName("", "filterImpl");
    private final static QName _WriterImpl_QNAME = new QName("", "writerImpl");
    private final static QName _DirectoryToWrite_QNAME = new QName("", "directoryToWrite");
    private final static QName _FilePrefix_QNAME = new QName("", "filePrefix");
    private final static QName _DatumDelimReplacementChar_QNAME = new QName("", "datumDelimReplacementChar");
    private final static QName _ColorCompression_QNAME = new QName("", "ColorCompression");
    private final static QName _DepthCompression_QNAME = new QName("", "DepthCompression");
    private final static QName _EMPTY_QNAME = new QName("", "EMPTY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.sensor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SensorsConfiguration }
     * 
     */
    public SensorsConfiguration createSensorsConfiguration() {
        return new SensorsConfiguration();
    }

    /**
     * Create an instance of {@link Sensors }
     * 
     */
    public Sensors createSensors() {
        return new Sensors();
    }

    /**
     * Create an instance of {@link Sensor }
     * 
     */
    public Sensor createSensor() {
        return new Sensor();
    }

    /**
     * Create an instance of {@link SensorInput }
     * 
     */
    public SensorInput createSensorInput() {
        return new SensorInput();
    }

    /**
     * Create an instance of {@link SelfAssessmentSensor }
     * 
     */
    public SelfAssessmentSensor createSelfAssessmentSensor() {
        return new SelfAssessmentSensor();
    }

    /**
     * Create an instance of {@link EmoComposerSensor }
     * 
     */
    public EmoComposerSensor createEmoComposerSensor() {
        return new EmoComposerSensor();
    }

    /**
     * Create an instance of {@link EmotivSensor }
     * 
     */
    public EmotivSensor createEmotivSensor() {
        return new EmotivSensor();
    }

    /**
     * Create an instance of {@link MouseTempHumiditySensor }
     * 
     */
    public MouseTempHumiditySensor createMouseTempHumiditySensor() {
        return new MouseTempHumiditySensor();
    }

    /**
     * Create an instance of {@link MouseTempHumiditySurrogateSensor }
     * 
     */
    public MouseTempHumiditySurrogateSensor createMouseTempHumiditySurrogateSensor() {
        return new MouseTempHumiditySurrogateSensor();
    }

    /**
     * Create an instance of {@link QSensor }
     * 
     */
    public QSensor createQSensor() {
        return new QSensor();
    }

    /**
     * Create an instance of {@link SineWaveSensor }
     * 
     */
    public SineWaveSensor createSineWaveSensor() {
        return new SineWaveSensor();
    }

    /**
     * Create an instance of {@link VhtMultisenseSensor }
     * 
     */
    public VhtMultisenseSensor createVhtMultisenseSensor() {
        return new VhtMultisenseSensor();
    }

    /**
     * Create an instance of {@link OS3DSensor }
     * 
     */
    public OS3DSensor createOS3DSensor() {
        return new OS3DSensor();
    }

    /**
     * Create an instance of {@link BioHarnessSensor }
     * 
     */
    public BioHarnessSensor createBioHarnessSensor() {
        return new BioHarnessSensor();
    }

    /**
     * Create an instance of {@link KinectSensor }
     * 
     */
    public KinectSensor createKinectSensor() {
        return new KinectSensor();
    }

    /**
     * Create an instance of {@link MicrosoftBandSensor }
     * 
     */
    public MicrosoftBandSensor createMicrosoftBandSensor() {
        return new MicrosoftBandSensor();
    }

    /**
     * Create an instance of {@link Filters }
     * 
     */
    public Filters createFilters() {
        return new Filters();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link FilterInput }
     * 
     */
    public FilterInput createFilterInput() {
        return new FilterInput();
    }

    /**
     * Create an instance of {@link GSRDetectionFilterInput }
     * 
     */
    public GSRDetectionFilterInput createGSRDetectionFilterInput() {
        return new GSRDetectionFilterInput();
    }

    /**
     * Create an instance of {@link ECGDetectionFilterInput }
     * 
     */
    public ECGDetectionFilterInput createECGDetectionFilterInput() {
        return new ECGDetectionFilterInput();
    }

    /**
     * Create an instance of {@link Writers }
     * 
     */
    public Writers createWriters() {
        return new Writers();
    }

    /**
     * Create an instance of {@link Writer }
     * 
     */
    public Writer createWriter() {
        return new Writer();
    }

    /**
     * Create an instance of {@link WriterInput }
     * 
     */
    public WriterInput createWriterInput() {
        return new WriterInput();
    }

    /**
     * Create an instance of {@link GenericSensorDelimitedWriter }
     * 
     */
    public GenericSensorDelimitedWriter createGenericSensorDelimitedWriter() {
        return new GenericSensorDelimitedWriter();
    }

    /**
     * Create an instance of {@link KinectSensorWriter }
     * 
     */
    public KinectSensorWriter createKinectSensorWriter() {
        return new KinectSensorWriter();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "interval")
    public JAXBElement<BigDecimal> createInterval(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Interval_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sensorImpl")
    public JAXBElement<String> createSensorImpl(String value) {
        return new JAXBElement<String>(_SensorImpl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "distributeExternally")
    public JAXBElement<BooleanEnum> createDistributeExternally(BooleanEnum value) {
        return new JAXBElement<BooleanEnum>(_DistributeExternally_QNAME, BooleanEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rateChangeAmount")
    public JAXBElement<BigDecimal> createRateChangeAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RateChangeAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UseAffective")
    public JAXBElement<BooleanEnum> createUseAffective(BooleanEnum value) {
        return new JAXBElement<BooleanEnum>(_UseAffective_QNAME, BooleanEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "temperatureRateChangeAmount")
    public JAXBElement<BigDecimal> createTemperatureRateChangeAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TemperatureRateChangeAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "humidityRateChangeAmount")
    public JAXBElement<BigDecimal> createHumidityRateChangeAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HumidityRateChangeAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "amplitude")
    public JAXBElement<BigDecimal> createAmplitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amplitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "period")
    public JAXBElement<BigDecimal> createPeriod(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Period_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "vhtActiveMqUrl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVhtActiveMqUrl(String value) {
        return new JAXBElement<String>(_VhtActiveMqUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "vhtActiveMqTopic")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVhtActiveMqTopic(String value) {
        return new JAXBElement<String>(_VhtActiveMqTopic_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "datalessWarningDelay")
    public JAXBElement<Long> createDatalessWarningDelay(Long value) {
        return new JAXBElement<Long>(_DatalessWarningDelay_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "skeletonAndFaceTrackingSampleInterval")
    public JAXBElement<BigDecimal> createSkeletonAndFaceTrackingSampleInterval(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SkeletonAndFaceTrackingSampleInterval_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "colorSampleInterval")
    public JAXBElement<BigDecimal> createColorSampleInterval(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ColorSampleInterval_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "depthSampleInterval")
    public JAXBElement<BigDecimal> createDepthSampleInterval(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DepthSampleInterval_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nearMode")
    public JAXBElement<BooleanEnum> createNearMode(BooleanEnum value) {
        return new JAXBElement<BooleanEnum>(_NearMode_QNAME, BooleanEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KinectColorResolutionEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KinectColorResolutionEnum }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "colorFrameFormat")
    public JAXBElement<KinectColorResolutionEnum> createColorFrameFormat(KinectColorResolutionEnum value) {
        return new JAXBElement<KinectColorResolutionEnum>(_ColorFrameFormat_QNAME, KinectColorResolutionEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KinectDepthResolutionEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KinectDepthResolutionEnum }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "depthFrameFormat")
    public JAXBElement<KinectDepthResolutionEnum> createDepthFrameFormat(KinectDepthResolutionEnum value) {
        return new JAXBElement<KinectDepthResolutionEnum>(_DepthFrameFormat_QNAME, KinectDepthResolutionEnum.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "filterInstance")
    public JAXBElement<BigInteger> createFilterInstance(BigInteger value) {
        return new JAXBElement<BigInteger>(_FilterInstance_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "writerInstance")
    public JAXBElement<BigInteger> createWriterInstance(BigInteger value) {
        return new JAXBElement<BigInteger>(_WriterInstance_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "filterImpl")
    public JAXBElement<String> createFilterImpl(String value) {
        return new JAXBElement<String>(_FilterImpl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "writerImpl")
    public JAXBElement<String> createWriterImpl(String value) {
        return new JAXBElement<String>(_WriterImpl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "directoryToWrite", defaultValue = "output/domainSessions")
    public JAXBElement<String> createDirectoryToWrite(String value) {
        return new JAXBElement<String>(_DirectoryToWrite_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "filePrefix")
    public JAXBElement<String> createFilePrefix(String value) {
        return new JAXBElement<String>(_FilePrefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "datumDelimReplacementChar")
    public JAXBElement<String> createDatumDelimReplacementChar(String value) {
        return new JAXBElement<String>(_DatumDelimReplacementChar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageCompressionFormat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageCompressionFormat }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ColorCompression")
    public JAXBElement<ImageCompressionFormat> createColorCompression(ImageCompressionFormat value) {
        return new JAXBElement<ImageCompressionFormat>(_ColorCompression_QNAME, ImageCompressionFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageCompressionFormat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageCompressionFormat }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DepthCompression")
    public JAXBElement<ImageCompressionFormat> createDepthCompression(ImageCompressionFormat value) {
        return new JAXBElement<ImageCompressionFormat>(_DepthCompression_QNAME, ImageCompressionFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "EMPTY")
    public JAXBElement<String> createEMPTY(String value) {
        return new JAXBElement<String>(_EMPTY_QNAME, String.class, null, value);
    }

}
