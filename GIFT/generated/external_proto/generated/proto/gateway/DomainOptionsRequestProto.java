// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DomainOptionsRequest.proto

package generated.proto.gateway;

public final class DomainOptionsRequestProto {
  private DomainOptionsRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DomainOptionsRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DomainOptionsRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** used to collect courses/real-time assessments that are available to this user 
     * </pre>
     *
     * <code>string LMS_UserName = 1;</code>
     */
    java.lang.String getLMSUserName();
    /**
     * <pre>
     ** used to collect courses/real-time assessments that are available to this user 
     * </pre>
     *
     * <code>string LMS_UserName = 1;</code>
     */
    com.google.protobuf.ByteString
        getLMSUserNameBytes();
  }
  /**
   * <pre>
   * 
   *	This message is used to query for courses/real-time assessments that have
   *  been authored and are available to load into the ITS by the provided user.
   *  A DomainOptionsReply is returned by the ITS as a response.
   * </pre>
   *
   * Protobuf type {@code DomainOptionsRequest}
   */
  public  static final class DomainOptionsRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DomainOptionsRequest)
      DomainOptionsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DomainOptionsRequest.newBuilder() to construct.
    private DomainOptionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DomainOptionsRequest() {
      lMSUserName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DomainOptionsRequest(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              lMSUserName_ = s;
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
      return generated.proto.gateway.DomainOptionsRequestProto.internal_static_DomainOptionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.gateway.DomainOptionsRequestProto.internal_static_DomainOptionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest.class, generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest.Builder.class);
    }

    public static final int LMS_USERNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object lMSUserName_;
    /**
     * <pre>
     ** used to collect courses/real-time assessments that are available to this user 
     * </pre>
     *
     * <code>string LMS_UserName = 1;</code>
     */
    public java.lang.String getLMSUserName() {
      java.lang.Object ref = lMSUserName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lMSUserName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     ** used to collect courses/real-time assessments that are available to this user 
     * </pre>
     *
     * <code>string LMS_UserName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLMSUserNameBytes() {
      java.lang.Object ref = lMSUserName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lMSUserName_ = b;
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
      if (!getLMSUserNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lMSUserName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getLMSUserNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lMSUserName_);
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
      if (!(obj instanceof generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest)) {
        return super.equals(obj);
      }
      generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest other = (generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest) obj;

      if (!getLMSUserName()
          .equals(other.getLMSUserName())) return false;
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
      hash = (37 * hash) + LMS_USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getLMSUserName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parseFrom(
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
    public static Builder newBuilder(generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest prototype) {
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
     *	This message is used to query for courses/real-time assessments that have
     *  been authored and are available to load into the ITS by the provided user.
     *  A DomainOptionsReply is returned by the ITS as a response.
     * </pre>
     *
     * Protobuf type {@code DomainOptionsRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DomainOptionsRequest)
        generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.gateway.DomainOptionsRequestProto.internal_static_DomainOptionsRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.gateway.DomainOptionsRequestProto.internal_static_DomainOptionsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest.class, generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest.Builder.class);
      }

      // Construct using generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest.newBuilder()
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
        lMSUserName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.gateway.DomainOptionsRequestProto.internal_static_DomainOptionsRequest_descriptor;
      }

      @java.lang.Override
      public generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest getDefaultInstanceForType() {
        return generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest build() {
        generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest buildPartial() {
        generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest result = new generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest(this);
        result.lMSUserName_ = lMSUserName_;
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
        if (other instanceof generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest) {
          return mergeFrom((generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest other) {
        if (other == generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest.getDefaultInstance()) return this;
        if (!other.getLMSUserName().isEmpty()) {
          lMSUserName_ = other.lMSUserName_;
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
        generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object lMSUserName_ = "";
      /**
       * <pre>
       ** used to collect courses/real-time assessments that are available to this user 
       * </pre>
       *
       * <code>string LMS_UserName = 1;</code>
       */
      public java.lang.String getLMSUserName() {
        java.lang.Object ref = lMSUserName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lMSUserName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       ** used to collect courses/real-time assessments that are available to this user 
       * </pre>
       *
       * <code>string LMS_UserName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getLMSUserNameBytes() {
        java.lang.Object ref = lMSUserName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lMSUserName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       ** used to collect courses/real-time assessments that are available to this user 
       * </pre>
       *
       * <code>string LMS_UserName = 1;</code>
       */
      public Builder setLMSUserName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lMSUserName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** used to collect courses/real-time assessments that are available to this user 
       * </pre>
       *
       * <code>string LMS_UserName = 1;</code>
       */
      public Builder clearLMSUserName() {
        
        lMSUserName_ = getDefaultInstance().getLMSUserName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** used to collect courses/real-time assessments that are available to this user 
       * </pre>
       *
       * <code>string LMS_UserName = 1;</code>
       */
      public Builder setLMSUserNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lMSUserName_ = value;
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


      // @@protoc_insertion_point(builder_scope:DomainOptionsRequest)
    }

    // @@protoc_insertion_point(class_scope:DomainOptionsRequest)
    private static final generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest();
    }

    public static generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DomainOptionsRequest>
        PARSER = new com.google.protobuf.AbstractParser<DomainOptionsRequest>() {
      @java.lang.Override
      public DomainOptionsRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DomainOptionsRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DomainOptionsRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DomainOptionsRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.gateway.DomainOptionsRequestProto.DomainOptionsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DomainOptionsRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DomainOptionsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032DomainOptionsRequest.proto\",\n\024DomainOp" +
      "tionsRequest\022\024\n\014LMS_UserName\030\001 \001(\tB4\n\027ge" +
      "nerated.proto.gatewayB\031DomainOptionsRequ" +
      "estProtob\006proto3"
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
    internal_static_DomainOptionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DomainOptionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DomainOptionsRequest_descriptor,
        new java.lang.String[] { "LMSUserName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
