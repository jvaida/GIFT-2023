// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DomainModuleStatus.proto

package generated.proto.common;

public final class DomainModuleStatusProto {
  private DomainModuleStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DomainModuleStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DomainModuleStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The base status from which to create the Domain module status. Cannot be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 1;</code>
     */
    boolean hasModuleStatus();
    /**
     * <pre>
     * The base status from which to create the Domain module status. Cannot be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 1;</code>
     */
    generated.proto.common.ModuleStatusProto.ModuleStatus getModuleStatus();
    /**
     * <pre>
     * The base status from which to create the Domain module status. Cannot be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 1;</code>
     */
    generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder getModuleStatusOrBuilder();

    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    java.util.List<java.lang.String>
        getLogPlaybackTopicsList();
    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    int getLogPlaybackTopicsCount();
    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    java.lang.String getLogPlaybackTopics(int index);
    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    com.google.protobuf.ByteString
        getLogPlaybackTopicsBytes(int index);
  }
  /**
   * <pre>
   * Represents a domain module's status. 
   * </pre>
   *
   * Protobuf type {@code DomainModuleStatus}
   */
  public  static final class DomainModuleStatus extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DomainModuleStatus)
      DomainModuleStatusOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DomainModuleStatus.newBuilder() to construct.
    private DomainModuleStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DomainModuleStatus() {
      logPlaybackTopics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DomainModuleStatus(
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
              generated.proto.common.ModuleStatusProto.ModuleStatus.Builder subBuilder = null;
              if (moduleStatus_ != null) {
                subBuilder = moduleStatus_.toBuilder();
              }
              moduleStatus_ = input.readMessage(generated.proto.common.ModuleStatusProto.ModuleStatus.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(moduleStatus_);
                moduleStatus_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                logPlaybackTopics_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              logPlaybackTopics_.add(s);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          logPlaybackTopics_ = logPlaybackTopics_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.proto.common.DomainModuleStatusProto.internal_static_DomainModuleStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.DomainModuleStatusProto.internal_static_DomainModuleStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.DomainModuleStatusProto.DomainModuleStatus.class, generated.proto.common.DomainModuleStatusProto.DomainModuleStatus.Builder.class);
    }

    private int bitField0_;
    public static final int MODULE_STATUS_FIELD_NUMBER = 1;
    private generated.proto.common.ModuleStatusProto.ModuleStatus moduleStatus_;
    /**
     * <pre>
     * The base status from which to create the Domain module status. Cannot be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 1;</code>
     */
    public boolean hasModuleStatus() {
      return moduleStatus_ != null;
    }
    /**
     * <pre>
     * The base status from which to create the Domain module status. Cannot be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 1;</code>
     */
    public generated.proto.common.ModuleStatusProto.ModuleStatus getModuleStatus() {
      return moduleStatus_ == null ? generated.proto.common.ModuleStatusProto.ModuleStatus.getDefaultInstance() : moduleStatus_;
    }
    /**
     * <pre>
     * The base status from which to create the Domain module status. Cannot be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 1;</code>
     */
    public generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder getModuleStatusOrBuilder() {
      return getModuleStatus();
    }

    public static final int LOG_PLAYBACK_TOPICS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList logPlaybackTopics_;
    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getLogPlaybackTopicsList() {
      return logPlaybackTopics_;
    }
    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    public int getLogPlaybackTopicsCount() {
      return logPlaybackTopics_.size();
    }
    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    public java.lang.String getLogPlaybackTopics(int index) {
      return logPlaybackTopics_.get(index);
    }
    /**
     * <pre>
     * The topics that the Domain module is currently using for 
     * log playback. Can be null. 
     * </pre>
     *
     * <code>repeated string log_playback_topics = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLogPlaybackTopicsBytes(int index) {
      return logPlaybackTopics_.getByteString(index);
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
      if (moduleStatus_ != null) {
        output.writeMessage(1, getModuleStatus());
      }
      for (int i = 0; i < logPlaybackTopics_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, logPlaybackTopics_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moduleStatus_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getModuleStatus());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < logPlaybackTopics_.size(); i++) {
          dataSize += computeStringSizeNoTag(logPlaybackTopics_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getLogPlaybackTopicsList().size();
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
      if (!(obj instanceof generated.proto.common.DomainModuleStatusProto.DomainModuleStatus)) {
        return super.equals(obj);
      }
      generated.proto.common.DomainModuleStatusProto.DomainModuleStatus other = (generated.proto.common.DomainModuleStatusProto.DomainModuleStatus) obj;

      if (hasModuleStatus() != other.hasModuleStatus()) return false;
      if (hasModuleStatus()) {
        if (!getModuleStatus()
            .equals(other.getModuleStatus())) return false;
      }
      if (!getLogPlaybackTopicsList()
          .equals(other.getLogPlaybackTopicsList())) return false;
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
      if (hasModuleStatus()) {
        hash = (37 * hash) + MODULE_STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getModuleStatus().hashCode();
      }
      if (getLogPlaybackTopicsCount() > 0) {
        hash = (37 * hash) + LOG_PLAYBACK_TOPICS_FIELD_NUMBER;
        hash = (53 * hash) + getLogPlaybackTopicsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parseFrom(
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
    public static Builder newBuilder(generated.proto.common.DomainModuleStatusProto.DomainModuleStatus prototype) {
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
     * Represents a domain module's status. 
     * </pre>
     *
     * Protobuf type {@code DomainModuleStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DomainModuleStatus)
        generated.proto.common.DomainModuleStatusProto.DomainModuleStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.DomainModuleStatusProto.internal_static_DomainModuleStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.DomainModuleStatusProto.internal_static_DomainModuleStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.DomainModuleStatusProto.DomainModuleStatus.class, generated.proto.common.DomainModuleStatusProto.DomainModuleStatus.Builder.class);
      }

      // Construct using generated.proto.common.DomainModuleStatusProto.DomainModuleStatus.newBuilder()
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
        if (moduleStatusBuilder_ == null) {
          moduleStatus_ = null;
        } else {
          moduleStatus_ = null;
          moduleStatusBuilder_ = null;
        }
        logPlaybackTopics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.DomainModuleStatusProto.internal_static_DomainModuleStatus_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.DomainModuleStatusProto.DomainModuleStatus getDefaultInstanceForType() {
        return generated.proto.common.DomainModuleStatusProto.DomainModuleStatus.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.DomainModuleStatusProto.DomainModuleStatus build() {
        generated.proto.common.DomainModuleStatusProto.DomainModuleStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.DomainModuleStatusProto.DomainModuleStatus buildPartial() {
        generated.proto.common.DomainModuleStatusProto.DomainModuleStatus result = new generated.proto.common.DomainModuleStatusProto.DomainModuleStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (moduleStatusBuilder_ == null) {
          result.moduleStatus_ = moduleStatus_;
        } else {
          result.moduleStatus_ = moduleStatusBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          logPlaybackTopics_ = logPlaybackTopics_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.logPlaybackTopics_ = logPlaybackTopics_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof generated.proto.common.DomainModuleStatusProto.DomainModuleStatus) {
          return mergeFrom((generated.proto.common.DomainModuleStatusProto.DomainModuleStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.DomainModuleStatusProto.DomainModuleStatus other) {
        if (other == generated.proto.common.DomainModuleStatusProto.DomainModuleStatus.getDefaultInstance()) return this;
        if (other.hasModuleStatus()) {
          mergeModuleStatus(other.getModuleStatus());
        }
        if (!other.logPlaybackTopics_.isEmpty()) {
          if (logPlaybackTopics_.isEmpty()) {
            logPlaybackTopics_ = other.logPlaybackTopics_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLogPlaybackTopicsIsMutable();
            logPlaybackTopics_.addAll(other.logPlaybackTopics_);
          }
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
        generated.proto.common.DomainModuleStatusProto.DomainModuleStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.DomainModuleStatusProto.DomainModuleStatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private generated.proto.common.ModuleStatusProto.ModuleStatus moduleStatus_;
      private com.google.protobuf.SingleFieldBuilderV3<
          generated.proto.common.ModuleStatusProto.ModuleStatus, generated.proto.common.ModuleStatusProto.ModuleStatus.Builder, generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder> moduleStatusBuilder_;
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public boolean hasModuleStatus() {
        return moduleStatusBuilder_ != null || moduleStatus_ != null;
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public generated.proto.common.ModuleStatusProto.ModuleStatus getModuleStatus() {
        if (moduleStatusBuilder_ == null) {
          return moduleStatus_ == null ? generated.proto.common.ModuleStatusProto.ModuleStatus.getDefaultInstance() : moduleStatus_;
        } else {
          return moduleStatusBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public Builder setModuleStatus(generated.proto.common.ModuleStatusProto.ModuleStatus value) {
        if (moduleStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          moduleStatus_ = value;
          onChanged();
        } else {
          moduleStatusBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public Builder setModuleStatus(
          generated.proto.common.ModuleStatusProto.ModuleStatus.Builder builderForValue) {
        if (moduleStatusBuilder_ == null) {
          moduleStatus_ = builderForValue.build();
          onChanged();
        } else {
          moduleStatusBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public Builder mergeModuleStatus(generated.proto.common.ModuleStatusProto.ModuleStatus value) {
        if (moduleStatusBuilder_ == null) {
          if (moduleStatus_ != null) {
            moduleStatus_ =
              generated.proto.common.ModuleStatusProto.ModuleStatus.newBuilder(moduleStatus_).mergeFrom(value).buildPartial();
          } else {
            moduleStatus_ = value;
          }
          onChanged();
        } else {
          moduleStatusBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public Builder clearModuleStatus() {
        if (moduleStatusBuilder_ == null) {
          moduleStatus_ = null;
          onChanged();
        } else {
          moduleStatus_ = null;
          moduleStatusBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public generated.proto.common.ModuleStatusProto.ModuleStatus.Builder getModuleStatusBuilder() {
        
        onChanged();
        return getModuleStatusFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      public generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder getModuleStatusOrBuilder() {
        if (moduleStatusBuilder_ != null) {
          return moduleStatusBuilder_.getMessageOrBuilder();
        } else {
          return moduleStatus_ == null ?
              generated.proto.common.ModuleStatusProto.ModuleStatus.getDefaultInstance() : moduleStatus_;
        }
      }
      /**
       * <pre>
       * The base status from which to create the Domain module status. Cannot be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          generated.proto.common.ModuleStatusProto.ModuleStatus, generated.proto.common.ModuleStatusProto.ModuleStatus.Builder, generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder> 
          getModuleStatusFieldBuilder() {
        if (moduleStatusBuilder_ == null) {
          moduleStatusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              generated.proto.common.ModuleStatusProto.ModuleStatus, generated.proto.common.ModuleStatusProto.ModuleStatus.Builder, generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder>(
                  getModuleStatus(),
                  getParentForChildren(),
                  isClean());
          moduleStatus_ = null;
        }
        return moduleStatusBuilder_;
      }

      private com.google.protobuf.LazyStringList logPlaybackTopics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureLogPlaybackTopicsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          logPlaybackTopics_ = new com.google.protobuf.LazyStringArrayList(logPlaybackTopics_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getLogPlaybackTopicsList() {
        return logPlaybackTopics_.getUnmodifiableView();
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public int getLogPlaybackTopicsCount() {
        return logPlaybackTopics_.size();
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public java.lang.String getLogPlaybackTopics(int index) {
        return logPlaybackTopics_.get(index);
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLogPlaybackTopicsBytes(int index) {
        return logPlaybackTopics_.getByteString(index);
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public Builder setLogPlaybackTopics(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureLogPlaybackTopicsIsMutable();
        logPlaybackTopics_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public Builder addLogPlaybackTopics(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureLogPlaybackTopicsIsMutable();
        logPlaybackTopics_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public Builder addAllLogPlaybackTopics(
          java.lang.Iterable<java.lang.String> values) {
        ensureLogPlaybackTopicsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, logPlaybackTopics_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public Builder clearLogPlaybackTopics() {
        logPlaybackTopics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The topics that the Domain module is currently using for 
       * log playback. Can be null. 
       * </pre>
       *
       * <code>repeated string log_playback_topics = 2;</code>
       */
      public Builder addLogPlaybackTopicsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureLogPlaybackTopicsIsMutable();
        logPlaybackTopics_.add(value);
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


      // @@protoc_insertion_point(builder_scope:DomainModuleStatus)
    }

    // @@protoc_insertion_point(class_scope:DomainModuleStatus)
    private static final generated.proto.common.DomainModuleStatusProto.DomainModuleStatus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.DomainModuleStatusProto.DomainModuleStatus();
    }

    public static generated.proto.common.DomainModuleStatusProto.DomainModuleStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DomainModuleStatus>
        PARSER = new com.google.protobuf.AbstractParser<DomainModuleStatus>() {
      @java.lang.Override
      public DomainModuleStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DomainModuleStatus(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DomainModuleStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DomainModuleStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.DomainModuleStatusProto.DomainModuleStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DomainModuleStatus_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DomainModuleStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030DomainModuleStatus.proto\032\022ModuleStatus" +
      ".proto\"W\n\022DomainModuleStatus\022$\n\rmodule_s" +
      "tatus\030\001 \001(\0132\r.ModuleStatus\022\033\n\023log_playba" +
      "ck_topics\030\002 \003(\tB1\n\026generated.proto.commo" +
      "nB\027DomainModuleStatusProtob\006proto3"
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
          generated.proto.common.ModuleStatusProto.getDescriptor(),
        }, assigner);
    internal_static_DomainModuleStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DomainModuleStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DomainModuleStatus_descriptor,
        new java.lang.String[] { "ModuleStatus", "LogPlaybackTopics", });
    generated.proto.common.ModuleStatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
