// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PedRequestMidLessonMedia.proto

package generated.proto.gateway;

public final class PedRequestMidLessonMediaProto {
  private PedRequestMidLessonMediaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PedRequestMidLessonMediaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PedRequestMidLessonMedia)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float wait_time = 1;</code>
     */
    float getWaitTime();

    /**
     * <code>string strategy_name = 2;</code>
     */
    java.lang.String getStrategyName();
    /**
     * <code>string strategy_name = 2;</code>
     */
    com.google.protobuf.ByteString
        getStrategyNameBytes();

    /**
     * <code>string reason_for_request = 3;</code>
     */
    java.lang.String getReasonForRequest();
    /**
     * <code>string reason_for_request = 3;</code>
     */
    com.google.protobuf.ByteString
        getReasonForRequestBytes();
  }
  /**
   * <pre>
   * 
   *	This message represents a request for mid-lesson media from the
   *	pedagogical module.
   * </pre>
   *
   * Protobuf type {@code PedRequestMidLessonMedia}
   */
  public  static final class PedRequestMidLessonMedia extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PedRequestMidLessonMedia)
      PedRequestMidLessonMediaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PedRequestMidLessonMedia.newBuilder() to construct.
    private PedRequestMidLessonMedia(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PedRequestMidLessonMedia() {
      strategyName_ = "";
      reasonForRequest_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PedRequestMidLessonMedia(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13: {

              waitTime_ = input.readFloat();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              strategyName_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              reasonForRequest_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.proto.gateway.PedRequestMidLessonMediaProto.internal_static_PedRequestMidLessonMedia_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.gateway.PedRequestMidLessonMediaProto.internal_static_PedRequestMidLessonMedia_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia.class, generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia.Builder.class);
    }

    public static final int WAIT_TIME_FIELD_NUMBER = 1;
    private float waitTime_;
    /**
     * <code>float wait_time = 1;</code>
     */
    public float getWaitTime() {
      return waitTime_;
    }

    public static final int STRATEGY_NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object strategyName_;
    /**
     * <code>string strategy_name = 2;</code>
     */
    public java.lang.String getStrategyName() {
      java.lang.Object ref = strategyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strategyName_ = s;
        return s;
      }
    }
    /**
     * <code>string strategy_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStrategyNameBytes() {
      java.lang.Object ref = strategyName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strategyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REASON_FOR_REQUEST_FIELD_NUMBER = 3;
    private volatile java.lang.Object reasonForRequest_;
    /**
     * <code>string reason_for_request = 3;</code>
     */
    public java.lang.String getReasonForRequest() {
      java.lang.Object ref = reasonForRequest_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reasonForRequest_ = s;
        return s;
      }
    }
    /**
     * <code>string reason_for_request = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReasonForRequestBytes() {
      java.lang.Object ref = reasonForRequest_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reasonForRequest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (waitTime_ != 0F) {
        output.writeFloat(1, waitTime_);
      }
      if (!getStrategyNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, strategyName_);
      }
      if (!getReasonForRequestBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, reasonForRequest_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (waitTime_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, waitTime_);
      }
      if (!getStrategyNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, strategyName_);
      }
      if (!getReasonForRequestBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, reasonForRequest_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia)) {
        return super.equals(obj);
      }
      generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia other = (generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia) obj;

      if (java.lang.Float.floatToIntBits(getWaitTime())
          != java.lang.Float.floatToIntBits(
              other.getWaitTime())) return false;
      if (!getStrategyName()
          .equals(other.getStrategyName())) return false;
      if (!getReasonForRequest()
          .equals(other.getReasonForRequest())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + WAIT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getWaitTime());
      hash = (37 * hash) + STRATEGY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getStrategyName().hashCode();
      hash = (37 * hash) + REASON_FOR_REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getReasonForRequest().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 
     *	This message represents a request for mid-lesson media from the
     *	pedagogical module.
     * </pre>
     *
     * Protobuf type {@code PedRequestMidLessonMedia}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PedRequestMidLessonMedia)
        generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMediaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.gateway.PedRequestMidLessonMediaProto.internal_static_PedRequestMidLessonMedia_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.gateway.PedRequestMidLessonMediaProto.internal_static_PedRequestMidLessonMedia_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia.class, generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia.Builder.class);
      }

      // Construct using generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        waitTime_ = 0F;

        strategyName_ = "";

        reasonForRequest_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.gateway.PedRequestMidLessonMediaProto.internal_static_PedRequestMidLessonMedia_descriptor;
      }

      @java.lang.Override
      public generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia getDefaultInstanceForType() {
        return generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia build() {
        generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia buildPartial() {
        generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia result = new generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia(this);
        result.waitTime_ = waitTime_;
        result.strategyName_ = strategyName_;
        result.reasonForRequest_ = reasonForRequest_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia) {
          return mergeFrom((generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia other) {
        if (other == generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia.getDefaultInstance()) return this;
        if (other.getWaitTime() != 0F) {
          setWaitTime(other.getWaitTime());
        }
        if (!other.getStrategyName().isEmpty()) {
          strategyName_ = other.strategyName_;
          onChanged();
        }
        if (!other.getReasonForRequest().isEmpty()) {
          reasonForRequest_ = other.reasonForRequest_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float waitTime_ ;
      /**
       * <code>float wait_time = 1;</code>
       */
      public float getWaitTime() {
        return waitTime_;
      }
      /**
       * <code>float wait_time = 1;</code>
       */
      public Builder setWaitTime(float value) {
        
        waitTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float wait_time = 1;</code>
       */
      public Builder clearWaitTime() {
        
        waitTime_ = 0F;
        onChanged();
        return this;
      }

      private java.lang.Object strategyName_ = "";
      /**
       * <code>string strategy_name = 2;</code>
       */
      public java.lang.String getStrategyName() {
        java.lang.Object ref = strategyName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          strategyName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string strategy_name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStrategyNameBytes() {
        java.lang.Object ref = strategyName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          strategyName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string strategy_name = 2;</code>
       */
      public Builder setStrategyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        strategyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string strategy_name = 2;</code>
       */
      public Builder clearStrategyName() {
        
        strategyName_ = getDefaultInstance().getStrategyName();
        onChanged();
        return this;
      }
      /**
       * <code>string strategy_name = 2;</code>
       */
      public Builder setStrategyNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        strategyName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object reasonForRequest_ = "";
      /**
       * <code>string reason_for_request = 3;</code>
       */
      public java.lang.String getReasonForRequest() {
        java.lang.Object ref = reasonForRequest_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reasonForRequest_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string reason_for_request = 3;</code>
       */
      public com.google.protobuf.ByteString
          getReasonForRequestBytes() {
        java.lang.Object ref = reasonForRequest_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reasonForRequest_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string reason_for_request = 3;</code>
       */
      public Builder setReasonForRequest(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reasonForRequest_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string reason_for_request = 3;</code>
       */
      public Builder clearReasonForRequest() {
        
        reasonForRequest_ = getDefaultInstance().getReasonForRequest();
        onChanged();
        return this;
      }
      /**
       * <code>string reason_for_request = 3;</code>
       */
      public Builder setReasonForRequestBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reasonForRequest_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PedRequestMidLessonMedia)
    }

    // @@protoc_insertion_point(class_scope:PedRequestMidLessonMedia)
    private static final generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia();
    }

    public static generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PedRequestMidLessonMedia>
        PARSER = new com.google.protobuf.AbstractParser<PedRequestMidLessonMedia>() {
      @java.lang.Override
      public PedRequestMidLessonMedia parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PedRequestMidLessonMedia(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PedRequestMidLessonMedia> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PedRequestMidLessonMedia> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.gateway.PedRequestMidLessonMediaProto.PedRequestMidLessonMedia getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PedRequestMidLessonMedia_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PedRequestMidLessonMedia_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PedRequestMidLessonMedia.proto\"`\n\030PedR" +
      "equestMidLessonMedia\022\021\n\twait_time\030\001 \001(\002\022" +
      "\025\n\rstrategy_name\030\002 \001(\t\022\032\n\022reason_for_req" +
      "uest\030\003 \001(\tB8\n\027generated.proto.gatewayB\035P" +
      "edRequestMidLessonMediaProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_PedRequestMidLessonMedia_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PedRequestMidLessonMedia_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PedRequestMidLessonMedia_descriptor,
        new java.lang.String[] { "WaitTime", "StrategyName", "ReasonForRequest", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
