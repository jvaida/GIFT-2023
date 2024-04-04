// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DomainSessionStartTimeRequest.proto

package generated.proto.common;

public final class DomainSessionStartTimeRequestProto {
  private DomainSessionStartTimeRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DomainSessionStartTimeRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DomainSessionStartTimeRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The domain session id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
     */
    boolean hasDomainSessionId();
    /**
     * <pre>
     * The domain session id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
     */
    com.google.protobuf.Int32Value getDomainSessionId();
    /**
     * <pre>
     * The domain session id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
     */
    com.google.protobuf.Int32ValueOrBuilder getDomainSessionIdOrBuilder();
  }
  /**
   * <pre>
   * This message represents the request for the domain session. 
   * </pre>
   *
   * Protobuf type {@code DomainSessionStartTimeRequest}
   */
  public  static final class DomainSessionStartTimeRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DomainSessionStartTimeRequest)
      DomainSessionStartTimeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DomainSessionStartTimeRequest.newBuilder() to construct.
    private DomainSessionStartTimeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DomainSessionStartTimeRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DomainSessionStartTimeRequest(
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
              com.google.protobuf.Int32Value.Builder subBuilder = null;
              if (domainSessionId_ != null) {
                subBuilder = domainSessionId_.toBuilder();
              }
              domainSessionId_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(domainSessionId_);
                domainSessionId_ = subBuilder.buildPartial();
              }

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
      return generated.proto.common.DomainSessionStartTimeRequestProto.internal_static_DomainSessionStartTimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.DomainSessionStartTimeRequestProto.internal_static_DomainSessionStartTimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest.class, generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest.Builder.class);
    }

    public static final int DOMAIN_SESSION_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.Int32Value domainSessionId_;
    /**
     * <pre>
     * The domain session id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
     */
    public boolean hasDomainSessionId() {
      return domainSessionId_ != null;
    }
    /**
     * <pre>
     * The domain session id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
     */
    public com.google.protobuf.Int32Value getDomainSessionId() {
      return domainSessionId_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : domainSessionId_;
    }
    /**
     * <pre>
     * The domain session id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getDomainSessionIdOrBuilder() {
      return getDomainSessionId();
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
      if (domainSessionId_ != null) {
        output.writeMessage(1, getDomainSessionId());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (domainSessionId_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getDomainSessionId());
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
      if (!(obj instanceof generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest)) {
        return super.equals(obj);
      }
      generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest other = (generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest) obj;

      if (hasDomainSessionId() != other.hasDomainSessionId()) return false;
      if (hasDomainSessionId()) {
        if (!getDomainSessionId()
            .equals(other.getDomainSessionId())) return false;
      }
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
      if (hasDomainSessionId()) {
        hash = (37 * hash) + DOMAIN_SESSION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getDomainSessionId().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parseFrom(
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
    public static Builder newBuilder(generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest prototype) {
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
     * This message represents the request for the domain session. 
     * </pre>
     *
     * Protobuf type {@code DomainSessionStartTimeRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DomainSessionStartTimeRequest)
        generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.DomainSessionStartTimeRequestProto.internal_static_DomainSessionStartTimeRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.DomainSessionStartTimeRequestProto.internal_static_DomainSessionStartTimeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest.class, generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest.Builder.class);
      }

      // Construct using generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest.newBuilder()
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
        if (domainSessionIdBuilder_ == null) {
          domainSessionId_ = null;
        } else {
          domainSessionId_ = null;
          domainSessionIdBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.DomainSessionStartTimeRequestProto.internal_static_DomainSessionStartTimeRequest_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest getDefaultInstanceForType() {
        return generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest build() {
        generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest buildPartial() {
        generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest result = new generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest(this);
        if (domainSessionIdBuilder_ == null) {
          result.domainSessionId_ = domainSessionId_;
        } else {
          result.domainSessionId_ = domainSessionIdBuilder_.build();
        }
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
        if (other instanceof generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest) {
          return mergeFrom((generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest other) {
        if (other == generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest.getDefaultInstance()) return this;
        if (other.hasDomainSessionId()) {
          mergeDomainSessionId(other.getDomainSessionId());
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
        generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Int32Value domainSessionId_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> domainSessionIdBuilder_;
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public boolean hasDomainSessionId() {
        return domainSessionIdBuilder_ != null || domainSessionId_ != null;
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public com.google.protobuf.Int32Value getDomainSessionId() {
        if (domainSessionIdBuilder_ == null) {
          return domainSessionId_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : domainSessionId_;
        } else {
          return domainSessionIdBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public Builder setDomainSessionId(com.google.protobuf.Int32Value value) {
        if (domainSessionIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          domainSessionId_ = value;
          onChanged();
        } else {
          domainSessionIdBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public Builder setDomainSessionId(
          com.google.protobuf.Int32Value.Builder builderForValue) {
        if (domainSessionIdBuilder_ == null) {
          domainSessionId_ = builderForValue.build();
          onChanged();
        } else {
          domainSessionIdBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public Builder mergeDomainSessionId(com.google.protobuf.Int32Value value) {
        if (domainSessionIdBuilder_ == null) {
          if (domainSessionId_ != null) {
            domainSessionId_ =
              com.google.protobuf.Int32Value.newBuilder(domainSessionId_).mergeFrom(value).buildPartial();
          } else {
            domainSessionId_ = value;
          }
          onChanged();
        } else {
          domainSessionIdBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public Builder clearDomainSessionId() {
        if (domainSessionIdBuilder_ == null) {
          domainSessionId_ = null;
          onChanged();
        } else {
          domainSessionId_ = null;
          domainSessionIdBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public com.google.protobuf.Int32Value.Builder getDomainSessionIdBuilder() {
        
        onChanged();
        return getDomainSessionIdFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      public com.google.protobuf.Int32ValueOrBuilder getDomainSessionIdOrBuilder() {
        if (domainSessionIdBuilder_ != null) {
          return domainSessionIdBuilder_.getMessageOrBuilder();
        } else {
          return domainSessionId_ == null ?
              com.google.protobuf.Int32Value.getDefaultInstance() : domainSessionId_;
        }
      }
      /**
       * <pre>
       * The domain session id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value domain_session_id = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
          getDomainSessionIdFieldBuilder() {
        if (domainSessionIdBuilder_ == null) {
          domainSessionIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                  getDomainSessionId(),
                  getParentForChildren(),
                  isClean());
          domainSessionId_ = null;
        }
        return domainSessionIdBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DomainSessionStartTimeRequest)
    }

    // @@protoc_insertion_point(class_scope:DomainSessionStartTimeRequest)
    private static final generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest();
    }

    public static generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DomainSessionStartTimeRequest>
        PARSER = new com.google.protobuf.AbstractParser<DomainSessionStartTimeRequest>() {
      @java.lang.Override
      public DomainSessionStartTimeRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DomainSessionStartTimeRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DomainSessionStartTimeRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DomainSessionStartTimeRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.DomainSessionStartTimeRequestProto.DomainSessionStartTimeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DomainSessionStartTimeRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DomainSessionStartTimeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#DomainSessionStartTimeRequest.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\"W\n\035DomainS" +
      "essionStartTimeRequest\0226\n\021domain_session" +
      "_id\030\001 \001(\0132\033.google.protobuf.Int32ValueB<" +
      "\n\026generated.proto.commonB\"DomainSessionS" +
      "tartTimeRequestProtob\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_DomainSessionStartTimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DomainSessionStartTimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DomainSessionStartTimeRequest_descriptor,
        new java.lang.String[] { "DomainSessionId", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
