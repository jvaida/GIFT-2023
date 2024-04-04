// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DisplayMediaCollectionRequest.proto

package generated.proto.common;

public final class DisplayMediaCollectionRequestProto {
  private DisplayMediaCollectionRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DisplayMediaCollectionRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DisplayMediaCollectionRequest)
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

    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 2;</code>
     */
    boolean hasContentRef();
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 2;</code>
     */
    com.google.protobuf.StringValue getContentRef();
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 2;</code>
     */
    com.google.protobuf.StringValueOrBuilder getContentRefOrBuilder();
  }
  /**
   * <pre>
   * This message represents the information about media that needs to be displayed by the Tutor. 
   * </pre>
   *
   * Protobuf type {@code DisplayMediaCollectionRequest}
   */
  public  static final class DisplayMediaCollectionRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DisplayMediaCollectionRequest)
      DisplayMediaCollectionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DisplayMediaCollectionRequest.newBuilder() to construct.
    private DisplayMediaCollectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DisplayMediaCollectionRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DisplayMediaCollectionRequest(
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
            case 18: {
              com.google.protobuf.StringValue.Builder subBuilder = null;
              if (contentRef_ != null) {
                subBuilder = contentRef_.toBuilder();
              }
              contentRef_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(contentRef_);
                contentRef_ = subBuilder.buildPartial();
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
      return generated.proto.common.DisplayMediaCollectionRequestProto.internal_static_DisplayMediaCollectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.DisplayMediaCollectionRequestProto.internal_static_DisplayMediaCollectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest.class, generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest.Builder.class);
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

    public static final int CONTENT_REF_FIELD_NUMBER = 2;
    private com.google.protobuf.StringValue contentRef_;
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 2;</code>
     */
    public boolean hasContentRef() {
      return contentRef_ != null;
    }
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 2;</code>
     */
    public com.google.protobuf.StringValue getContentRef() {
      return contentRef_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : contentRef_;
    }
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getContentRefOrBuilder() {
      return getContentRef();
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
      if (contentRef_ != null) {
        output.writeMessage(2, getContentRef());
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
      if (contentRef_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getContentRef());
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
      if (!(obj instanceof generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest)) {
        return super.equals(obj);
      }
      generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest other = (generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest) obj;

      if (hasLessonMaterial() != other.hasLessonMaterial()) return false;
      if (hasLessonMaterial()) {
        if (!getLessonMaterial()
            .equals(other.getLessonMaterial())) return false;
      }
      if (hasContentRef() != other.hasContentRef()) return false;
      if (hasContentRef()) {
        if (!getContentRef()
            .equals(other.getContentRef())) return false;
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
      if (hasContentRef()) {
        hash = (37 * hash) + CONTENT_REF_FIELD_NUMBER;
        hash = (53 * hash) + getContentRef().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parseFrom(
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
    public static Builder newBuilder(generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest prototype) {
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
     * This message represents the information about media that needs to be displayed by the Tutor. 
     * </pre>
     *
     * Protobuf type {@code DisplayMediaCollectionRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DisplayMediaCollectionRequest)
        generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.DisplayMediaCollectionRequestProto.internal_static_DisplayMediaCollectionRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.DisplayMediaCollectionRequestProto.internal_static_DisplayMediaCollectionRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest.class, generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest.Builder.class);
      }

      // Construct using generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest.newBuilder()
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
        if (contentRefBuilder_ == null) {
          contentRef_ = null;
        } else {
          contentRef_ = null;
          contentRefBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.DisplayMediaCollectionRequestProto.internal_static_DisplayMediaCollectionRequest_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest getDefaultInstanceForType() {
        return generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest build() {
        generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest buildPartial() {
        generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest result = new generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest(this);
        if (lessonMaterialBuilder_ == null) {
          result.lessonMaterial_ = lessonMaterial_;
        } else {
          result.lessonMaterial_ = lessonMaterialBuilder_.build();
        }
        if (contentRefBuilder_ == null) {
          result.contentRef_ = contentRef_;
        } else {
          result.contentRef_ = contentRefBuilder_.build();
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
        if (other instanceof generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest) {
          return mergeFrom((generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest other) {
        if (other == generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest.getDefaultInstance()) return this;
        if (other.hasLessonMaterial()) {
          mergeLessonMaterial(other.getLessonMaterial());
        }
        if (other.hasContentRef()) {
          mergeContentRef(other.getContentRef());
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
        generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest) e.getUnfinishedMessage();
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

      private com.google.protobuf.StringValue contentRef_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> contentRefBuilder_;
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public boolean hasContentRef() {
        return contentRefBuilder_ != null || contentRef_ != null;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public com.google.protobuf.StringValue getContentRef() {
        if (contentRefBuilder_ == null) {
          return contentRef_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : contentRef_;
        } else {
          return contentRefBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public Builder setContentRef(com.google.protobuf.StringValue value) {
        if (contentRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          contentRef_ = value;
          onChanged();
        } else {
          contentRefBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public Builder setContentRef(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (contentRefBuilder_ == null) {
          contentRef_ = builderForValue.build();
          onChanged();
        } else {
          contentRefBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public Builder mergeContentRef(com.google.protobuf.StringValue value) {
        if (contentRefBuilder_ == null) {
          if (contentRef_ != null) {
            contentRef_ =
              com.google.protobuf.StringValue.newBuilder(contentRef_).mergeFrom(value).buildPartial();
          } else {
            contentRef_ = value;
          }
          onChanged();
        } else {
          contentRefBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public Builder clearContentRef() {
        if (contentRefBuilder_ == null) {
          contentRef_ = null;
          onChanged();
        } else {
          contentRef_ = null;
          contentRefBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public com.google.protobuf.StringValue.Builder getContentRefBuilder() {
        
        onChanged();
        return getContentRefFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getContentRefOrBuilder() {
        if (contentRefBuilder_ != null) {
          return contentRefBuilder_.getMessageOrBuilder();
        } else {
          return contentRef_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : contentRef_;
        }
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getContentRefFieldBuilder() {
        if (contentRefBuilder_ == null) {
          contentRefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getContentRef(),
                  getParentForChildren(),
                  isClean());
          contentRef_ = null;
        }
        return contentRefBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DisplayMediaCollectionRequest)
    }

    // @@protoc_insertion_point(class_scope:DisplayMediaCollectionRequest)
    private static final generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest();
    }

    public static generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DisplayMediaCollectionRequest>
        PARSER = new com.google.protobuf.AbstractParser<DisplayMediaCollectionRequest>() {
      @java.lang.Override
      public DisplayMediaCollectionRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DisplayMediaCollectionRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DisplayMediaCollectionRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DisplayMediaCollectionRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.DisplayMediaCollectionRequestProto.DisplayMediaCollectionRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DisplayMediaCollectionRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DisplayMediaCollectionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#DisplayMediaCollectionRequest.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\"\211\001\n\035Displa" +
      "yMediaCollectionRequest\0225\n\017lesson_materi" +
      "al\030\001 \001(\0132\034.google.protobuf.StringValue\0221" +
      "\n\013content_ref\030\002 \001(\0132\034.google.protobuf.St" +
      "ringValueB<\n\026generated.proto.commonB\"Dis" +
      "playMediaCollectionRequestProtob\006proto3"
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
    internal_static_DisplayMediaCollectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DisplayMediaCollectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DisplayMediaCollectionRequest_descriptor,
        new java.lang.String[] { "LessonMaterial", "ContentRef", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}