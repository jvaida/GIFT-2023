// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ArticulationParameters.proto

package generated.proto.common;

public final class ArticulationParametersProto {
  private ArticulationParametersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ArticulationParametersOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ArticulationParameters)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    java.util.List<generated.proto.common.ArticulationParameterProto.ArticulationParameter> 
        getArticulationParametersList();
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    generated.proto.common.ArticulationParameterProto.ArticulationParameter getArticulationParameters(int index);
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    int getArticulationParametersCount();
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    java.util.List<? extends generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder> 
        getArticulationParametersOrBuilderList();
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder getArticulationParametersOrBuilder(
        int index);
  }
  /**
   * <pre>
   * This message represents a list of articulation parameters. 
   * </pre>
   *
   * Protobuf type {@code ArticulationParameters}
   */
  public  static final class ArticulationParameters extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ArticulationParameters)
      ArticulationParametersOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ArticulationParameters.newBuilder() to construct.
    private ArticulationParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ArticulationParameters() {
      articulationParameters_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ArticulationParameters(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                articulationParameters_ = new java.util.ArrayList<generated.proto.common.ArticulationParameterProto.ArticulationParameter>();
                mutable_bitField0_ |= 0x00000001;
              }
              articulationParameters_.add(
                  input.readMessage(generated.proto.common.ArticulationParameterProto.ArticulationParameter.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          articulationParameters_ = java.util.Collections.unmodifiableList(articulationParameters_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.proto.common.ArticulationParametersProto.internal_static_ArticulationParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.ArticulationParametersProto.internal_static_ArticulationParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.ArticulationParametersProto.ArticulationParameters.class, generated.proto.common.ArticulationParametersProto.ArticulationParameters.Builder.class);
    }

    public static final int ARTICULATION_PARAMETERS_FIELD_NUMBER = 1;
    private java.util.List<generated.proto.common.ArticulationParameterProto.ArticulationParameter> articulationParameters_;
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    public java.util.List<generated.proto.common.ArticulationParameterProto.ArticulationParameter> getArticulationParametersList() {
      return articulationParameters_;
    }
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    public java.util.List<? extends generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder> 
        getArticulationParametersOrBuilderList() {
      return articulationParameters_;
    }
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    public int getArticulationParametersCount() {
      return articulationParameters_.size();
    }
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    public generated.proto.common.ArticulationParameterProto.ArticulationParameter getArticulationParameters(int index) {
      return articulationParameters_.get(index);
    }
    /**
     * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
     */
    public generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder getArticulationParametersOrBuilder(
        int index) {
      return articulationParameters_.get(index);
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
      for (int i = 0; i < articulationParameters_.size(); i++) {
        output.writeMessage(1, articulationParameters_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < articulationParameters_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, articulationParameters_.get(i));
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
      if (!(obj instanceof generated.proto.common.ArticulationParametersProto.ArticulationParameters)) {
        return super.equals(obj);
      }
      generated.proto.common.ArticulationParametersProto.ArticulationParameters other = (generated.proto.common.ArticulationParametersProto.ArticulationParameters) obj;

      if (!getArticulationParametersList()
          .equals(other.getArticulationParametersList())) return false;
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
      if (getArticulationParametersCount() > 0) {
        hash = (37 * hash) + ARTICULATION_PARAMETERS_FIELD_NUMBER;
        hash = (53 * hash) + getArticulationParametersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters parseFrom(
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
    public static Builder newBuilder(generated.proto.common.ArticulationParametersProto.ArticulationParameters prototype) {
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
     * This message represents a list of articulation parameters. 
     * </pre>
     *
     * Protobuf type {@code ArticulationParameters}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ArticulationParameters)
        generated.proto.common.ArticulationParametersProto.ArticulationParametersOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.ArticulationParametersProto.internal_static_ArticulationParameters_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.ArticulationParametersProto.internal_static_ArticulationParameters_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.ArticulationParametersProto.ArticulationParameters.class, generated.proto.common.ArticulationParametersProto.ArticulationParameters.Builder.class);
      }

      // Construct using generated.proto.common.ArticulationParametersProto.ArticulationParameters.newBuilder()
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
          getArticulationParametersFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (articulationParametersBuilder_ == null) {
          articulationParameters_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          articulationParametersBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.ArticulationParametersProto.internal_static_ArticulationParameters_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.ArticulationParametersProto.ArticulationParameters getDefaultInstanceForType() {
        return generated.proto.common.ArticulationParametersProto.ArticulationParameters.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.ArticulationParametersProto.ArticulationParameters build() {
        generated.proto.common.ArticulationParametersProto.ArticulationParameters result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.ArticulationParametersProto.ArticulationParameters buildPartial() {
        generated.proto.common.ArticulationParametersProto.ArticulationParameters result = new generated.proto.common.ArticulationParametersProto.ArticulationParameters(this);
        int from_bitField0_ = bitField0_;
        if (articulationParametersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            articulationParameters_ = java.util.Collections.unmodifiableList(articulationParameters_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.articulationParameters_ = articulationParameters_;
        } else {
          result.articulationParameters_ = articulationParametersBuilder_.build();
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
        if (other instanceof generated.proto.common.ArticulationParametersProto.ArticulationParameters) {
          return mergeFrom((generated.proto.common.ArticulationParametersProto.ArticulationParameters)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.ArticulationParametersProto.ArticulationParameters other) {
        if (other == generated.proto.common.ArticulationParametersProto.ArticulationParameters.getDefaultInstance()) return this;
        if (articulationParametersBuilder_ == null) {
          if (!other.articulationParameters_.isEmpty()) {
            if (articulationParameters_.isEmpty()) {
              articulationParameters_ = other.articulationParameters_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureArticulationParametersIsMutable();
              articulationParameters_.addAll(other.articulationParameters_);
            }
            onChanged();
          }
        } else {
          if (!other.articulationParameters_.isEmpty()) {
            if (articulationParametersBuilder_.isEmpty()) {
              articulationParametersBuilder_.dispose();
              articulationParametersBuilder_ = null;
              articulationParameters_ = other.articulationParameters_;
              bitField0_ = (bitField0_ & ~0x00000001);
              articulationParametersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getArticulationParametersFieldBuilder() : null;
            } else {
              articulationParametersBuilder_.addAllMessages(other.articulationParameters_);
            }
          }
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
        generated.proto.common.ArticulationParametersProto.ArticulationParameters parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.ArticulationParametersProto.ArticulationParameters) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<generated.proto.common.ArticulationParameterProto.ArticulationParameter> articulationParameters_ =
        java.util.Collections.emptyList();
      private void ensureArticulationParametersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          articulationParameters_ = new java.util.ArrayList<generated.proto.common.ArticulationParameterProto.ArticulationParameter>(articulationParameters_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          generated.proto.common.ArticulationParameterProto.ArticulationParameter, generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder, generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder> articulationParametersBuilder_;

      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public java.util.List<generated.proto.common.ArticulationParameterProto.ArticulationParameter> getArticulationParametersList() {
        if (articulationParametersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(articulationParameters_);
        } else {
          return articulationParametersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public int getArticulationParametersCount() {
        if (articulationParametersBuilder_ == null) {
          return articulationParameters_.size();
        } else {
          return articulationParametersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public generated.proto.common.ArticulationParameterProto.ArticulationParameter getArticulationParameters(int index) {
        if (articulationParametersBuilder_ == null) {
          return articulationParameters_.get(index);
        } else {
          return articulationParametersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder setArticulationParameters(
          int index, generated.proto.common.ArticulationParameterProto.ArticulationParameter value) {
        if (articulationParametersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArticulationParametersIsMutable();
          articulationParameters_.set(index, value);
          onChanged();
        } else {
          articulationParametersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder setArticulationParameters(
          int index, generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder builderForValue) {
        if (articulationParametersBuilder_ == null) {
          ensureArticulationParametersIsMutable();
          articulationParameters_.set(index, builderForValue.build());
          onChanged();
        } else {
          articulationParametersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder addArticulationParameters(generated.proto.common.ArticulationParameterProto.ArticulationParameter value) {
        if (articulationParametersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArticulationParametersIsMutable();
          articulationParameters_.add(value);
          onChanged();
        } else {
          articulationParametersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder addArticulationParameters(
          int index, generated.proto.common.ArticulationParameterProto.ArticulationParameter value) {
        if (articulationParametersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArticulationParametersIsMutable();
          articulationParameters_.add(index, value);
          onChanged();
        } else {
          articulationParametersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder addArticulationParameters(
          generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder builderForValue) {
        if (articulationParametersBuilder_ == null) {
          ensureArticulationParametersIsMutable();
          articulationParameters_.add(builderForValue.build());
          onChanged();
        } else {
          articulationParametersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder addArticulationParameters(
          int index, generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder builderForValue) {
        if (articulationParametersBuilder_ == null) {
          ensureArticulationParametersIsMutable();
          articulationParameters_.add(index, builderForValue.build());
          onChanged();
        } else {
          articulationParametersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder addAllArticulationParameters(
          java.lang.Iterable<? extends generated.proto.common.ArticulationParameterProto.ArticulationParameter> values) {
        if (articulationParametersBuilder_ == null) {
          ensureArticulationParametersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, articulationParameters_);
          onChanged();
        } else {
          articulationParametersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder clearArticulationParameters() {
        if (articulationParametersBuilder_ == null) {
          articulationParameters_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          articulationParametersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public Builder removeArticulationParameters(int index) {
        if (articulationParametersBuilder_ == null) {
          ensureArticulationParametersIsMutable();
          articulationParameters_.remove(index);
          onChanged();
        } else {
          articulationParametersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder getArticulationParametersBuilder(
          int index) {
        return getArticulationParametersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder getArticulationParametersOrBuilder(
          int index) {
        if (articulationParametersBuilder_ == null) {
          return articulationParameters_.get(index);  } else {
          return articulationParametersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public java.util.List<? extends generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder> 
           getArticulationParametersOrBuilderList() {
        if (articulationParametersBuilder_ != null) {
          return articulationParametersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(articulationParameters_);
        }
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder addArticulationParametersBuilder() {
        return getArticulationParametersFieldBuilder().addBuilder(
            generated.proto.common.ArticulationParameterProto.ArticulationParameter.getDefaultInstance());
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder addArticulationParametersBuilder(
          int index) {
        return getArticulationParametersFieldBuilder().addBuilder(
            index, generated.proto.common.ArticulationParameterProto.ArticulationParameter.getDefaultInstance());
      }
      /**
       * <code>repeated .ArticulationParameter articulation_parameters = 1;</code>
       */
      public java.util.List<generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder> 
           getArticulationParametersBuilderList() {
        return getArticulationParametersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          generated.proto.common.ArticulationParameterProto.ArticulationParameter, generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder, generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder> 
          getArticulationParametersFieldBuilder() {
        if (articulationParametersBuilder_ == null) {
          articulationParametersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              generated.proto.common.ArticulationParameterProto.ArticulationParameter, generated.proto.common.ArticulationParameterProto.ArticulationParameter.Builder, generated.proto.common.ArticulationParameterProto.ArticulationParameterOrBuilder>(
                  articulationParameters_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          articulationParameters_ = null;
        }
        return articulationParametersBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ArticulationParameters)
    }

    // @@protoc_insertion_point(class_scope:ArticulationParameters)
    private static final generated.proto.common.ArticulationParametersProto.ArticulationParameters DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.ArticulationParametersProto.ArticulationParameters();
    }

    public static generated.proto.common.ArticulationParametersProto.ArticulationParameters getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ArticulationParameters>
        PARSER = new com.google.protobuf.AbstractParser<ArticulationParameters>() {
      @java.lang.Override
      public ArticulationParameters parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ArticulationParameters(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ArticulationParameters> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ArticulationParameters> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.ArticulationParametersProto.ArticulationParameters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ArticulationParameters_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ArticulationParameters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ArticulationParameters.proto\032\033Articula" +
      "tionParameter.proto\"Q\n\026ArticulationParam" +
      "eters\0227\n\027articulation_parameters\030\001 \003(\0132\026" +
      ".ArticulationParameterB5\n\026generated.prot" +
      "o.commonB\033ArticulationParametersProtob\006p" +
      "roto3"
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
          generated.proto.common.ArticulationParameterProto.getDescriptor(),
        }, assigner);
    internal_static_ArticulationParameters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ArticulationParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ArticulationParameters_descriptor,
        new java.lang.String[] { "ArticulationParameters", });
    generated.proto.common.ArticulationParameterProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
