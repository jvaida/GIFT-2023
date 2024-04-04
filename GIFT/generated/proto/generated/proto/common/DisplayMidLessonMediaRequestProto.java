// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DisplayMidLessonMediaRequest.proto

package generated.proto.common;

public final class DisplayMidLessonMediaRequestProto {
  private DisplayMidLessonMediaRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DisplayMidLessonMediaRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DisplayMidLessonMediaRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The lesson material to display. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue lesson_material = 1;</code>
     */
    boolean hasLessonMaterial();
    /**
     * <pre>
     * The lesson material to display. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue lesson_material = 1;</code>
     */
    com.google.protobuf.StringValue getLessonMaterial();
    /**
     * <pre>
     * The lesson material to display. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue lesson_material = 1;</code>
     */
    com.google.protobuf.StringValueOrBuilder getLessonMaterialOrBuilder();
  }
  /**
   * <pre>
   * This message represents the information about media that needs to be displayed by the Tutor
   *during a training application scenario. 
   * </pre>
   *
   * Protobuf type {@code DisplayMidLessonMediaRequest}
   */
  public  static final class DisplayMidLessonMediaRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DisplayMidLessonMediaRequest)
      DisplayMidLessonMediaRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DisplayMidLessonMediaRequest.newBuilder() to construct.
    private DisplayMidLessonMediaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DisplayMidLessonMediaRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DisplayMidLessonMediaRequest(
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
              if (lessonMaterial_ != null) {
                subBuilder = lessonMaterial_.toBuilder();
              }
              lessonMaterial_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lessonMaterial_);
                lessonMaterial_ = subBuilder.buildPartial();
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
      return generated.proto.common.DisplayMidLessonMediaRequestProto.internal_static_DisplayMidLessonMediaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.DisplayMidLessonMediaRequestProto.internal_static_DisplayMidLessonMediaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest.class, generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest.Builder.class);
    }

    public static final int LESSON_MATERIAL_FIELD_NUMBER = 1;
    private com.google.protobuf.StringValue lessonMaterial_;
    /**
     * <pre>
     * The lesson material to display. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue lesson_material = 1;</code>
     */
    public boolean hasLessonMaterial() {
      return lessonMaterial_ != null;
    }
    /**
     * <pre>
     * The lesson material to display. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue lesson_material = 1;</code>
     */
    public com.google.protobuf.StringValue getLessonMaterial() {
      return lessonMaterial_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : lessonMaterial_;
    }
    /**
     * <pre>
     * The lesson material to display. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue lesson_material = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getLessonMaterialOrBuilder() {
      return getLessonMaterial();
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
      if (lessonMaterial_ != null) {
        output.writeMessage(1, getLessonMaterial());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lessonMaterial_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getLessonMaterial());
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
      if (!(obj instanceof generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest)) {
        return super.equals(obj);
      }
      generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest other = (generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest) obj;

      if (hasLessonMaterial() != other.hasLessonMaterial()) return false;
      if (hasLessonMaterial()) {
        if (!getLessonMaterial()
            .equals(other.getLessonMaterial())) return false;
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
      if (hasLessonMaterial()) {
        hash = (37 * hash) + LESSON_MATERIAL_FIELD_NUMBER;
        hash = (53 * hash) + getLessonMaterial().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parseFrom(
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
    public static Builder newBuilder(generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest prototype) {
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
     * This message represents the information about media that needs to be displayed by the Tutor
     *during a training application scenario. 
     * </pre>
     *
     * Protobuf type {@code DisplayMidLessonMediaRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DisplayMidLessonMediaRequest)
        generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.DisplayMidLessonMediaRequestProto.internal_static_DisplayMidLessonMediaRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.DisplayMidLessonMediaRequestProto.internal_static_DisplayMidLessonMediaRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest.class, generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest.Builder.class);
      }

      // Construct using generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest.newBuilder()
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
        if (lessonMaterialBuilder_ == null) {
          lessonMaterial_ = null;
        } else {
          lessonMaterial_ = null;
          lessonMaterialBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.DisplayMidLessonMediaRequestProto.internal_static_DisplayMidLessonMediaRequest_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest getDefaultInstanceForType() {
        return generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest build() {
        generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest buildPartial() {
        generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest result = new generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest(this);
        if (lessonMaterialBuilder_ == null) {
          result.lessonMaterial_ = lessonMaterial_;
        } else {
          result.lessonMaterial_ = lessonMaterialBuilder_.build();
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
        if (other instanceof generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest) {
          return mergeFrom((generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest other) {
        if (other == generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest.getDefaultInstance()) return this;
        if (other.hasLessonMaterial()) {
          mergeLessonMaterial(other.getLessonMaterial());
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
        generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.StringValue lessonMaterial_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> lessonMaterialBuilder_;
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public boolean hasLessonMaterial() {
        return lessonMaterialBuilder_ != null || lessonMaterial_ != null;
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public com.google.protobuf.StringValue getLessonMaterial() {
        if (lessonMaterialBuilder_ == null) {
          return lessonMaterial_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : lessonMaterial_;
        } else {
          return lessonMaterialBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public Builder setLessonMaterial(com.google.protobuf.StringValue value) {
        if (lessonMaterialBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lessonMaterial_ = value;
          onChanged();
        } else {
          lessonMaterialBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public Builder setLessonMaterial(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (lessonMaterialBuilder_ == null) {
          lessonMaterial_ = builderForValue.build();
          onChanged();
        } else {
          lessonMaterialBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public Builder mergeLessonMaterial(com.google.protobuf.StringValue value) {
        if (lessonMaterialBuilder_ == null) {
          if (lessonMaterial_ != null) {
            lessonMaterial_ =
              com.google.protobuf.StringValue.newBuilder(lessonMaterial_).mergeFrom(value).buildPartial();
          } else {
            lessonMaterial_ = value;
          }
          onChanged();
        } else {
          lessonMaterialBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public Builder clearLessonMaterial() {
        if (lessonMaterialBuilder_ == null) {
          lessonMaterial_ = null;
          onChanged();
        } else {
          lessonMaterial_ = null;
          lessonMaterialBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public com.google.protobuf.StringValue.Builder getLessonMaterialBuilder() {
        
        onChanged();
        return getLessonMaterialFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getLessonMaterialOrBuilder() {
        if (lessonMaterialBuilder_ != null) {
          return lessonMaterialBuilder_.getMessageOrBuilder();
        } else {
          return lessonMaterial_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : lessonMaterial_;
        }
      }
      /**
       * <pre>
       * The lesson material to display. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue lesson_material = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getLessonMaterialFieldBuilder() {
        if (lessonMaterialBuilder_ == null) {
          lessonMaterialBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getLessonMaterial(),
                  getParentForChildren(),
                  isClean());
          lessonMaterial_ = null;
        }
        return lessonMaterialBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DisplayMidLessonMediaRequest)
    }

    // @@protoc_insertion_point(class_scope:DisplayMidLessonMediaRequest)
    private static final generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest();
    }

    public static generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DisplayMidLessonMediaRequest>
        PARSER = new com.google.protobuf.AbstractParser<DisplayMidLessonMediaRequest>() {
      @java.lang.Override
      public DisplayMidLessonMediaRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DisplayMidLessonMediaRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DisplayMidLessonMediaRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DisplayMidLessonMediaRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.DisplayMidLessonMediaRequestProto.DisplayMidLessonMediaRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DisplayMidLessonMediaRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DisplayMidLessonMediaRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"DisplayMidLessonMediaRequest.proto\032\036go" +
      "ogle/protobuf/wrappers.proto\"U\n\034DisplayM" +
      "idLessonMediaRequest\0225\n\017lesson_material\030" +
      "\001 \001(\0132\034.google.protobuf.StringValueB;\n\026g" +
      "enerated.proto.commonB!DisplayMidLessonM" +
      "ediaRequestProtob\006proto3"
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
    internal_static_DisplayMidLessonMediaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DisplayMidLessonMediaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DisplayMidLessonMediaRequest_descriptor,
        new java.lang.String[] { "LessonMaterial", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
