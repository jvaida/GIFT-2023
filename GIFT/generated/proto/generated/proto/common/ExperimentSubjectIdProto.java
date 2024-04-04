// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExperimentSubjectId.proto

package generated.proto.common;

public final class ExperimentSubjectIdProto {
  private ExperimentSubjectIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExperimentSubjectIdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExperimentSubjectId)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The subject's id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value subject_id = 1;</code>
     */
    boolean hasSubjectId();
    /**
     * <pre>
     * The subject's id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value subject_id = 1;</code>
     */
    com.google.protobuf.Int32Value getSubjectId();
    /**
     * <pre>
     * The subject's id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value subject_id = 1;</code>
     */
    com.google.protobuf.Int32ValueOrBuilder getSubjectIdOrBuilder();

    /**
     * <pre>
     * The experiment's id. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue experiment_id = 2;</code>
     */
    boolean hasExperimentId();
    /**
     * <pre>
     * The experiment's id. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue experiment_id = 2;</code>
     */
    com.google.protobuf.StringValue getExperimentId();
    /**
     * <pre>
     * The experiment's id. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue experiment_id = 2;</code>
     */
    com.google.protobuf.StringValueOrBuilder getExperimentIdOrBuilder();
  }
  /**
   * <pre>
   * This message represents a RPC-safe and client-safe representation of an experiment subject ID. 
   * </pre>
   *
   * Protobuf type {@code ExperimentSubjectId}
   */
  public  static final class ExperimentSubjectId extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExperimentSubjectId)
      ExperimentSubjectIdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExperimentSubjectId.newBuilder() to construct.
    private ExperimentSubjectId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExperimentSubjectId() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExperimentSubjectId(
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
              if (subjectId_ != null) {
                subBuilder = subjectId_.toBuilder();
              }
              subjectId_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(subjectId_);
                subjectId_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              com.google.protobuf.StringValue.Builder subBuilder = null;
              if (experimentId_ != null) {
                subBuilder = experimentId_.toBuilder();
              }
              experimentId_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(experimentId_);
                experimentId_ = subBuilder.buildPartial();
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
      return generated.proto.common.ExperimentSubjectIdProto.internal_static_ExperimentSubjectId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.ExperimentSubjectIdProto.internal_static_ExperimentSubjectId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId.class, generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId.Builder.class);
    }

    public static final int SUBJECT_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.Int32Value subjectId_;
    /**
     * <pre>
     * The subject's id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value subject_id = 1;</code>
     */
    public boolean hasSubjectId() {
      return subjectId_ != null;
    }
    /**
     * <pre>
     * The subject's id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value subject_id = 1;</code>
     */
    public com.google.protobuf.Int32Value getSubjectId() {
      return subjectId_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : subjectId_;
    }
    /**
     * <pre>
     * The subject's id. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value subject_id = 1;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getSubjectIdOrBuilder() {
      return getSubjectId();
    }

    public static final int EXPERIMENT_ID_FIELD_NUMBER = 2;
    private com.google.protobuf.StringValue experimentId_;
    /**
     * <pre>
     * The experiment's id. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue experiment_id = 2;</code>
     */
    public boolean hasExperimentId() {
      return experimentId_ != null;
    }
    /**
     * <pre>
     * The experiment's id. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue experiment_id = 2;</code>
     */
    public com.google.protobuf.StringValue getExperimentId() {
      return experimentId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : experimentId_;
    }
    /**
     * <pre>
     * The experiment's id. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue experiment_id = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getExperimentIdOrBuilder() {
      return getExperimentId();
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
      if (subjectId_ != null) {
        output.writeMessage(1, getSubjectId());
      }
      if (experimentId_ != null) {
        output.writeMessage(2, getExperimentId());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (subjectId_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSubjectId());
      }
      if (experimentId_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getExperimentId());
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
      if (!(obj instanceof generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId)) {
        return super.equals(obj);
      }
      generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId other = (generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId) obj;

      if (hasSubjectId() != other.hasSubjectId()) return false;
      if (hasSubjectId()) {
        if (!getSubjectId()
            .equals(other.getSubjectId())) return false;
      }
      if (hasExperimentId() != other.hasExperimentId()) return false;
      if (hasExperimentId()) {
        if (!getExperimentId()
            .equals(other.getExperimentId())) return false;
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
      if (hasSubjectId()) {
        hash = (37 * hash) + SUBJECT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getSubjectId().hashCode();
      }
      if (hasExperimentId()) {
        hash = (37 * hash) + EXPERIMENT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getExperimentId().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parseFrom(
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
    public static Builder newBuilder(generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId prototype) {
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
     * This message represents a RPC-safe and client-safe representation of an experiment subject ID. 
     * </pre>
     *
     * Protobuf type {@code ExperimentSubjectId}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExperimentSubjectId)
        generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectIdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.ExperimentSubjectIdProto.internal_static_ExperimentSubjectId_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.ExperimentSubjectIdProto.internal_static_ExperimentSubjectId_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId.class, generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId.Builder.class);
      }

      // Construct using generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId.newBuilder()
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
        if (subjectIdBuilder_ == null) {
          subjectId_ = null;
        } else {
          subjectId_ = null;
          subjectIdBuilder_ = null;
        }
        if (experimentIdBuilder_ == null) {
          experimentId_ = null;
        } else {
          experimentId_ = null;
          experimentIdBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.ExperimentSubjectIdProto.internal_static_ExperimentSubjectId_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId getDefaultInstanceForType() {
        return generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId build() {
        generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId buildPartial() {
        generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId result = new generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId(this);
        if (subjectIdBuilder_ == null) {
          result.subjectId_ = subjectId_;
        } else {
          result.subjectId_ = subjectIdBuilder_.build();
        }
        if (experimentIdBuilder_ == null) {
          result.experimentId_ = experimentId_;
        } else {
          result.experimentId_ = experimentIdBuilder_.build();
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
        if (other instanceof generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId) {
          return mergeFrom((generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId other) {
        if (other == generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId.getDefaultInstance()) return this;
        if (other.hasSubjectId()) {
          mergeSubjectId(other.getSubjectId());
        }
        if (other.hasExperimentId()) {
          mergeExperimentId(other.getExperimentId());
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
        generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Int32Value subjectId_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> subjectIdBuilder_;
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public boolean hasSubjectId() {
        return subjectIdBuilder_ != null || subjectId_ != null;
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public com.google.protobuf.Int32Value getSubjectId() {
        if (subjectIdBuilder_ == null) {
          return subjectId_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : subjectId_;
        } else {
          return subjectIdBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public Builder setSubjectId(com.google.protobuf.Int32Value value) {
        if (subjectIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          subjectId_ = value;
          onChanged();
        } else {
          subjectIdBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public Builder setSubjectId(
          com.google.protobuf.Int32Value.Builder builderForValue) {
        if (subjectIdBuilder_ == null) {
          subjectId_ = builderForValue.build();
          onChanged();
        } else {
          subjectIdBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public Builder mergeSubjectId(com.google.protobuf.Int32Value value) {
        if (subjectIdBuilder_ == null) {
          if (subjectId_ != null) {
            subjectId_ =
              com.google.protobuf.Int32Value.newBuilder(subjectId_).mergeFrom(value).buildPartial();
          } else {
            subjectId_ = value;
          }
          onChanged();
        } else {
          subjectIdBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public Builder clearSubjectId() {
        if (subjectIdBuilder_ == null) {
          subjectId_ = null;
          onChanged();
        } else {
          subjectId_ = null;
          subjectIdBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public com.google.protobuf.Int32Value.Builder getSubjectIdBuilder() {
        
        onChanged();
        return getSubjectIdFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      public com.google.protobuf.Int32ValueOrBuilder getSubjectIdOrBuilder() {
        if (subjectIdBuilder_ != null) {
          return subjectIdBuilder_.getMessageOrBuilder();
        } else {
          return subjectId_ == null ?
              com.google.protobuf.Int32Value.getDefaultInstance() : subjectId_;
        }
      }
      /**
       * <pre>
       * The subject's id. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value subject_id = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
          getSubjectIdFieldBuilder() {
        if (subjectIdBuilder_ == null) {
          subjectIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                  getSubjectId(),
                  getParentForChildren(),
                  isClean());
          subjectId_ = null;
        }
        return subjectIdBuilder_;
      }

      private com.google.protobuf.StringValue experimentId_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> experimentIdBuilder_;
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public boolean hasExperimentId() {
        return experimentIdBuilder_ != null || experimentId_ != null;
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public com.google.protobuf.StringValue getExperimentId() {
        if (experimentIdBuilder_ == null) {
          return experimentId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : experimentId_;
        } else {
          return experimentIdBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public Builder setExperimentId(com.google.protobuf.StringValue value) {
        if (experimentIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          experimentId_ = value;
          onChanged();
        } else {
          experimentIdBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public Builder setExperimentId(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (experimentIdBuilder_ == null) {
          experimentId_ = builderForValue.build();
          onChanged();
        } else {
          experimentIdBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public Builder mergeExperimentId(com.google.protobuf.StringValue value) {
        if (experimentIdBuilder_ == null) {
          if (experimentId_ != null) {
            experimentId_ =
              com.google.protobuf.StringValue.newBuilder(experimentId_).mergeFrom(value).buildPartial();
          } else {
            experimentId_ = value;
          }
          onChanged();
        } else {
          experimentIdBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public Builder clearExperimentId() {
        if (experimentIdBuilder_ == null) {
          experimentId_ = null;
          onChanged();
        } else {
          experimentId_ = null;
          experimentIdBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public com.google.protobuf.StringValue.Builder getExperimentIdBuilder() {
        
        onChanged();
        return getExperimentIdFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getExperimentIdOrBuilder() {
        if (experimentIdBuilder_ != null) {
          return experimentIdBuilder_.getMessageOrBuilder();
        } else {
          return experimentId_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : experimentId_;
        }
      }
      /**
       * <pre>
       * The experiment's id. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue experiment_id = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getExperimentIdFieldBuilder() {
        if (experimentIdBuilder_ == null) {
          experimentIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getExperimentId(),
                  getParentForChildren(),
                  isClean());
          experimentId_ = null;
        }
        return experimentIdBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ExperimentSubjectId)
    }

    // @@protoc_insertion_point(class_scope:ExperimentSubjectId)
    private static final generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId();
    }

    public static generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExperimentSubjectId>
        PARSER = new com.google.protobuf.AbstractParser<ExperimentSubjectId>() {
      @java.lang.Override
      public ExperimentSubjectId parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExperimentSubjectId(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExperimentSubjectId> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExperimentSubjectId> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.ExperimentSubjectIdProto.ExperimentSubjectId getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExperimentSubjectId_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExperimentSubjectId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ExperimentSubjectId.proto\032\036google/prot" +
      "obuf/wrappers.proto\"{\n\023ExperimentSubject" +
      "Id\022/\n\nsubject_id\030\001 \001(\0132\033.google.protobuf" +
      ".Int32Value\0223\n\rexperiment_id\030\002 \001(\0132\034.goo" +
      "gle.protobuf.StringValueB2\n\026generated.pr" +
      "oto.commonB\030ExperimentSubjectIdProtob\006pr" +
      "oto3"
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
    internal_static_ExperimentSubjectId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExperimentSubjectId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExperimentSubjectId_descriptor,
        new java.lang.String[] { "SubjectId", "ExperimentId", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
