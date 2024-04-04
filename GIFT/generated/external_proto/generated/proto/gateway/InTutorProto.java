// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InTutor.proto

package generated.proto.gateway;

public final class InTutorProto {
  private InTutorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InTutorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InTutor)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string text_enhancement = 1;</code>
     */
    java.lang.String getTextEnhancement();
    /**
     * <code>string text_enhancement = 1;</code>
     */
    com.google.protobuf.ByteString
        getTextEnhancementBytes();

    /**
     * <code>string message_presentation = 2;</code>
     */
    java.lang.String getMessagePresentation();
    /**
     * <code>string message_presentation = 2;</code>
     */
    com.google.protobuf.ByteString
        getMessagePresentationBytes();
  }
  /**
   * Protobuf type {@code InTutor}
   */
  public  static final class InTutor extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InTutor)
      InTutorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InTutor.newBuilder() to construct.
    private InTutor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InTutor() {
      textEnhancement_ = "";
      messagePresentation_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InTutor(
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

              textEnhancement_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              messagePresentation_ = s;
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
      return generated.proto.gateway.InTutorProto.internal_static_InTutor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.gateway.InTutorProto.internal_static_InTutor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.gateway.InTutorProto.InTutor.class, generated.proto.gateway.InTutorProto.InTutor.Builder.class);
    }

    public static final int TEXT_ENHANCEMENT_FIELD_NUMBER = 1;
    private volatile java.lang.Object textEnhancement_;
    /**
     * <code>string text_enhancement = 1;</code>
     */
    public java.lang.String getTextEnhancement() {
      java.lang.Object ref = textEnhancement_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        textEnhancement_ = s;
        return s;
      }
    }
    /**
     * <code>string text_enhancement = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTextEnhancementBytes() {
      java.lang.Object ref = textEnhancement_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textEnhancement_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_PRESENTATION_FIELD_NUMBER = 2;
    private volatile java.lang.Object messagePresentation_;
    /**
     * <code>string message_presentation = 2;</code>
     */
    public java.lang.String getMessagePresentation() {
      java.lang.Object ref = messagePresentation_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messagePresentation_ = s;
        return s;
      }
    }
    /**
     * <code>string message_presentation = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessagePresentationBytes() {
      java.lang.Object ref = messagePresentation_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messagePresentation_ = b;
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
      if (!getTextEnhancementBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, textEnhancement_);
      }
      if (!getMessagePresentationBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, messagePresentation_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTextEnhancementBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, textEnhancement_);
      }
      if (!getMessagePresentationBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, messagePresentation_);
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
      if (!(obj instanceof generated.proto.gateway.InTutorProto.InTutor)) {
        return super.equals(obj);
      }
      generated.proto.gateway.InTutorProto.InTutor other = (generated.proto.gateway.InTutorProto.InTutor) obj;

      if (!getTextEnhancement()
          .equals(other.getTextEnhancement())) return false;
      if (!getMessagePresentation()
          .equals(other.getMessagePresentation())) return false;
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
      hash = (37 * hash) + TEXT_ENHANCEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getTextEnhancement().hashCode();
      hash = (37 * hash) + MESSAGE_PRESENTATION_FIELD_NUMBER;
      hash = (53 * hash) + getMessagePresentation().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.InTutorProto.InTutor parseFrom(
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
    public static Builder newBuilder(generated.proto.gateway.InTutorProto.InTutor prototype) {
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
     * Protobuf type {@code InTutor}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InTutor)
        generated.proto.gateway.InTutorProto.InTutorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.gateway.InTutorProto.internal_static_InTutor_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.gateway.InTutorProto.internal_static_InTutor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.gateway.InTutorProto.InTutor.class, generated.proto.gateway.InTutorProto.InTutor.Builder.class);
      }

      // Construct using generated.proto.gateway.InTutorProto.InTutor.newBuilder()
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
        textEnhancement_ = "";

        messagePresentation_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.gateway.InTutorProto.internal_static_InTutor_descriptor;
      }

      @java.lang.Override
      public generated.proto.gateway.InTutorProto.InTutor getDefaultInstanceForType() {
        return generated.proto.gateway.InTutorProto.InTutor.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.gateway.InTutorProto.InTutor build() {
        generated.proto.gateway.InTutorProto.InTutor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.gateway.InTutorProto.InTutor buildPartial() {
        generated.proto.gateway.InTutorProto.InTutor result = new generated.proto.gateway.InTutorProto.InTutor(this);
        result.textEnhancement_ = textEnhancement_;
        result.messagePresentation_ = messagePresentation_;
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
        if (other instanceof generated.proto.gateway.InTutorProto.InTutor) {
          return mergeFrom((generated.proto.gateway.InTutorProto.InTutor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.gateway.InTutorProto.InTutor other) {
        if (other == generated.proto.gateway.InTutorProto.InTutor.getDefaultInstance()) return this;
        if (!other.getTextEnhancement().isEmpty()) {
          textEnhancement_ = other.textEnhancement_;
          onChanged();
        }
        if (!other.getMessagePresentation().isEmpty()) {
          messagePresentation_ = other.messagePresentation_;
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
        generated.proto.gateway.InTutorProto.InTutor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.gateway.InTutorProto.InTutor) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object textEnhancement_ = "";
      /**
       * <code>string text_enhancement = 1;</code>
       */
      public java.lang.String getTextEnhancement() {
        java.lang.Object ref = textEnhancement_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          textEnhancement_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string text_enhancement = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTextEnhancementBytes() {
        java.lang.Object ref = textEnhancement_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          textEnhancement_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string text_enhancement = 1;</code>
       */
      public Builder setTextEnhancement(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        textEnhancement_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string text_enhancement = 1;</code>
       */
      public Builder clearTextEnhancement() {
        
        textEnhancement_ = getDefaultInstance().getTextEnhancement();
        onChanged();
        return this;
      }
      /**
       * <code>string text_enhancement = 1;</code>
       */
      public Builder setTextEnhancementBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        textEnhancement_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object messagePresentation_ = "";
      /**
       * <code>string message_presentation = 2;</code>
       */
      public java.lang.String getMessagePresentation() {
        java.lang.Object ref = messagePresentation_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          messagePresentation_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message_presentation = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMessagePresentationBytes() {
        java.lang.Object ref = messagePresentation_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          messagePresentation_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message_presentation = 2;</code>
       */
      public Builder setMessagePresentation(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        messagePresentation_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message_presentation = 2;</code>
       */
      public Builder clearMessagePresentation() {
        
        messagePresentation_ = getDefaultInstance().getMessagePresentation();
        onChanged();
        return this;
      }
      /**
       * <code>string message_presentation = 2;</code>
       */
      public Builder setMessagePresentationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        messagePresentation_ = value;
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


      // @@protoc_insertion_point(builder_scope:InTutor)
    }

    // @@protoc_insertion_point(class_scope:InTutor)
    private static final generated.proto.gateway.InTutorProto.InTutor DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.gateway.InTutorProto.InTutor();
    }

    public static generated.proto.gateway.InTutorProto.InTutor getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InTutor>
        PARSER = new com.google.protobuf.AbstractParser<InTutor>() {
      @java.lang.Override
      public InTutor parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InTutor(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InTutor> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InTutor> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.gateway.InTutorProto.InTutor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InTutor_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InTutor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rInTutor.proto\"A\n\007InTutor\022\030\n\020text_enhan" +
      "cement\030\001 \001(\t\022\034\n\024message_presentation\030\002 \001" +
      "(\tB\'\n\027generated.proto.gatewayB\014InTutorPr" +
      "otob\006proto3"
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
    internal_static_InTutor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InTutor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InTutor_descriptor,
        new java.lang.String[] { "TextEnhancement", "MessagePresentation", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
