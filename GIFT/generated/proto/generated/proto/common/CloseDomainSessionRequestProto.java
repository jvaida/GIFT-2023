// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CloseDomainSessionRequest.proto

package generated.proto.common;

public final class CloseDomainSessionRequestProto {
  private CloseDomainSessionRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CloseDomainSessionRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CloseDomainSessionRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Reason for the request. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue reason = 1;</code>
     */
    boolean hasReason();
    /**
     * <pre>
     * Reason for the request. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue reason = 1;</code>
     */
    com.google.protobuf.StringValue getReason();
    /**
     * <pre>
     * Reason for the request. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue reason = 1;</code>
     */
    com.google.protobuf.StringValueOrBuilder getReasonOrBuilder();
  }
  /**
   * <pre>
   * This message represents a close domain session request. 
   * </pre>
   *
   * Protobuf type {@code CloseDomainSessionRequest}
   */
  public  static final class CloseDomainSessionRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CloseDomainSessionRequest)
      CloseDomainSessionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CloseDomainSessionRequest.newBuilder() to construct.
    private CloseDomainSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CloseDomainSessionRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CloseDomainSessionRequest(
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
              com.google.protobuf.StringValue.Builder subBuilder = null;
              if (reason_ != null) {
                subBuilder = reason_.toBuilder();
              }
              reason_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reason_);
                reason_ = subBuilder.buildPartial();
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
      return generated.proto.common.CloseDomainSessionRequestProto.internal_static_CloseDomainSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.CloseDomainSessionRequestProto.internal_static_CloseDomainSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest.class, generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 1;
    private com.google.protobuf.StringValue reason_;
    /**
     * <pre>
     * Reason for the request. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue reason = 1;</code>
     */
    public boolean hasReason() {
      return reason_ != null;
    }
    /**
     * <pre>
     * Reason for the request. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue reason = 1;</code>
     */
    public com.google.protobuf.StringValue getReason() {
      return reason_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : reason_;
    }
    /**
     * <pre>
     * Reason for the request. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue reason = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getReasonOrBuilder() {
      return getReason();
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
      if (reason_ != null) {
        output.writeMessage(1, getReason());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getReason());
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
      if (!(obj instanceof generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest)) {
        return super.equals(obj);
      }
      generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest other = (generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest) obj;

      if (hasReason() != other.hasReason()) return false;
      if (hasReason()) {
        if (!getReason()
            .equals(other.getReason())) return false;
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
      if (hasReason()) {
        hash = (37 * hash) + REASON_FIELD_NUMBER;
        hash = (53 * hash) + getReason().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parseFrom(
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
    public static Builder newBuilder(generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest prototype) {
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
     * This message represents a close domain session request. 
     * </pre>
     *
     * Protobuf type {@code CloseDomainSessionRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CloseDomainSessionRequest)
        generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.CloseDomainSessionRequestProto.internal_static_CloseDomainSessionRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.CloseDomainSessionRequestProto.internal_static_CloseDomainSessionRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest.class, generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest.Builder.class);
      }

      // Construct using generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest.newBuilder()
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
        if (reasonBuilder_ == null) {
          reason_ = null;
        } else {
          reason_ = null;
          reasonBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.CloseDomainSessionRequestProto.internal_static_CloseDomainSessionRequest_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest getDefaultInstanceForType() {
        return generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest build() {
        generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest buildPartial() {
        generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest result = new generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest(this);
        if (reasonBuilder_ == null) {
          result.reason_ = reason_;
        } else {
          result.reason_ = reasonBuilder_.build();
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
        if (other instanceof generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest) {
          return mergeFrom((generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest other) {
        if (other == generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest.getDefaultInstance()) return this;
        if (other.hasReason()) {
          mergeReason(other.getReason());
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
        generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.StringValue reason_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> reasonBuilder_;
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public boolean hasReason() {
        return reasonBuilder_ != null || reason_ != null;
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public com.google.protobuf.StringValue getReason() {
        if (reasonBuilder_ == null) {
          return reason_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : reason_;
        } else {
          return reasonBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public Builder setReason(com.google.protobuf.StringValue value) {
        if (reasonBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reason_ = value;
          onChanged();
        } else {
          reasonBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public Builder setReason(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (reasonBuilder_ == null) {
          reason_ = builderForValue.build();
          onChanged();
        } else {
          reasonBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public Builder mergeReason(com.google.protobuf.StringValue value) {
        if (reasonBuilder_ == null) {
          if (reason_ != null) {
            reason_ =
              com.google.protobuf.StringValue.newBuilder(reason_).mergeFrom(value).buildPartial();
          } else {
            reason_ = value;
          }
          onChanged();
        } else {
          reasonBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public Builder clearReason() {
        if (reasonBuilder_ == null) {
          reason_ = null;
          onChanged();
        } else {
          reason_ = null;
          reasonBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public com.google.protobuf.StringValue.Builder getReasonBuilder() {
        
        onChanged();
        return getReasonFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getReasonOrBuilder() {
        if (reasonBuilder_ != null) {
          return reasonBuilder_.getMessageOrBuilder();
        } else {
          return reason_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : reason_;
        }
      }
      /**
       * <pre>
       * Reason for the request. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue reason = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getReasonFieldBuilder() {
        if (reasonBuilder_ == null) {
          reasonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getReason(),
                  getParentForChildren(),
                  isClean());
          reason_ = null;
        }
        return reasonBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CloseDomainSessionRequest)
    }

    // @@protoc_insertion_point(class_scope:CloseDomainSessionRequest)
    private static final generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest();
    }

    public static generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CloseDomainSessionRequest>
        PARSER = new com.google.protobuf.AbstractParser<CloseDomainSessionRequest>() {
      @java.lang.Override
      public CloseDomainSessionRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CloseDomainSessionRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CloseDomainSessionRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CloseDomainSessionRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.CloseDomainSessionRequestProto.CloseDomainSessionRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CloseDomainSessionRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CloseDomainSessionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CloseDomainSessionRequest.proto\032\036googl" +
      "e/protobuf/wrappers.proto\"I\n\031CloseDomain" +
      "SessionRequest\022,\n\006reason\030\001 \001(\0132\034.google." +
      "protobuf.StringValueB8\n\026generated.proto." +
      "commonB\036CloseDomainSessionRequestProtob\006" +
      "proto3"
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
    internal_static_CloseDomainSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CloseDomainSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CloseDomainSessionRequest_descriptor,
        new java.lang.String[] { "Reason", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
