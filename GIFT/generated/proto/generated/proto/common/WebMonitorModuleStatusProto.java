// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WebMonitorModuleStatus.proto

package generated.proto.common;

public final class WebMonitorModuleStatusProto {
  private WebMonitorModuleStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WebMonitorModuleStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WebMonitorModuleStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
     * empty. 
     * </pre>
     *
     * <code>repeated int32 attached_domain_session = 1;</code>
     */
    java.util.List<java.lang.Integer> getAttachedDomainSessionList();
    /**
     * <pre>
     * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
     * empty. 
     * </pre>
     *
     * <code>repeated int32 attached_domain_session = 1;</code>
     */
    int getAttachedDomainSessionCount();
    /**
     * <pre>
     * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
     * empty. 
     * </pre>
     *
     * <code>repeated int32 attached_domain_session = 1;</code>
     */
    int getAttachedDomainSession(int index);

    /**
     * <pre>
     * The ModuleStatus from which to construct the
     * WebMonitorModuleStatus. Can't be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 2;</code>
     */
    boolean hasModuleStatus();
    /**
     * <pre>
     * The ModuleStatus from which to construct the
     * WebMonitorModuleStatus. Can't be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 2;</code>
     */
    generated.proto.common.ModuleStatusProto.ModuleStatus getModuleStatus();
    /**
     * <pre>
     * The ModuleStatus from which to construct the
     * WebMonitorModuleStatus. Can't be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 2;</code>
     */
    generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder getModuleStatusOrBuilder();
  }
  /**
   * <pre>
   * Represents a Web monitor's module's status. 
   * </pre>
   *
   * Protobuf type {@code WebMonitorModuleStatus}
   */
  public  static final class WebMonitorModuleStatus extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WebMonitorModuleStatus)
      WebMonitorModuleStatusOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WebMonitorModuleStatus.newBuilder() to construct.
    private WebMonitorModuleStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WebMonitorModuleStatus() {
      attachedDomainSession_ = emptyIntList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WebMonitorModuleStatus(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                attachedDomainSession_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              attachedDomainSession_.addInt(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                attachedDomainSession_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                attachedDomainSession_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 18: {
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
          attachedDomainSession_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.proto.common.WebMonitorModuleStatusProto.internal_static_WebMonitorModuleStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.WebMonitorModuleStatusProto.internal_static_WebMonitorModuleStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus.class, generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus.Builder.class);
    }

    private int bitField0_;
    public static final int ATTACHED_DOMAIN_SESSION_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList attachedDomainSession_;
    /**
     * <pre>
     * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
     * empty. 
     * </pre>
     *
     * <code>repeated int32 attached_domain_session = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getAttachedDomainSessionList() {
      return attachedDomainSession_;
    }
    /**
     * <pre>
     * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
     * empty. 
     * </pre>
     *
     * <code>repeated int32 attached_domain_session = 1;</code>
     */
    public int getAttachedDomainSessionCount() {
      return attachedDomainSession_.size();
    }
    /**
     * <pre>
     * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
     * empty. 
     * </pre>
     *
     * <code>repeated int32 attached_domain_session = 1;</code>
     */
    public int getAttachedDomainSession(int index) {
      return attachedDomainSession_.getInt(index);
    }
    private int attachedDomainSessionMemoizedSerializedSize = -1;

    public static final int MODULE_STATUS_FIELD_NUMBER = 2;
    private generated.proto.common.ModuleStatusProto.ModuleStatus moduleStatus_;
    /**
     * <pre>
     * The ModuleStatus from which to construct the
     * WebMonitorModuleStatus. Can't be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 2;</code>
     */
    public boolean hasModuleStatus() {
      return moduleStatus_ != null;
    }
    /**
     * <pre>
     * The ModuleStatus from which to construct the
     * WebMonitorModuleStatus. Can't be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 2;</code>
     */
    public generated.proto.common.ModuleStatusProto.ModuleStatus getModuleStatus() {
      return moduleStatus_ == null ? generated.proto.common.ModuleStatusProto.ModuleStatus.getDefaultInstance() : moduleStatus_;
    }
    /**
     * <pre>
     * The ModuleStatus from which to construct the
     * WebMonitorModuleStatus. Can't be null. 
     * </pre>
     *
     * <code>.ModuleStatus module_status = 2;</code>
     */
    public generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder getModuleStatusOrBuilder() {
      return getModuleStatus();
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
      getSerializedSize();
      if (getAttachedDomainSessionList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(attachedDomainSessionMemoizedSerializedSize);
      }
      for (int i = 0; i < attachedDomainSession_.size(); i++) {
        output.writeInt32NoTag(attachedDomainSession_.getInt(i));
      }
      if (moduleStatus_ != null) {
        output.writeMessage(2, getModuleStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < attachedDomainSession_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(attachedDomainSession_.getInt(i));
        }
        size += dataSize;
        if (!getAttachedDomainSessionList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        attachedDomainSessionMemoizedSerializedSize = dataSize;
      }
      if (moduleStatus_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getModuleStatus());
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
      if (!(obj instanceof generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus)) {
        return super.equals(obj);
      }
      generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus other = (generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus) obj;

      if (!getAttachedDomainSessionList()
          .equals(other.getAttachedDomainSessionList())) return false;
      if (hasModuleStatus() != other.hasModuleStatus()) return false;
      if (hasModuleStatus()) {
        if (!getModuleStatus()
            .equals(other.getModuleStatus())) return false;
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
      if (getAttachedDomainSessionCount() > 0) {
        hash = (37 * hash) + ATTACHED_DOMAIN_SESSION_FIELD_NUMBER;
        hash = (53 * hash) + getAttachedDomainSessionList().hashCode();
      }
      if (hasModuleStatus()) {
        hash = (37 * hash) + MODULE_STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getModuleStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parseFrom(
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
    public static Builder newBuilder(generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus prototype) {
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
     * Represents a Web monitor's module's status. 
     * </pre>
     *
     * Protobuf type {@code WebMonitorModuleStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WebMonitorModuleStatus)
        generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.WebMonitorModuleStatusProto.internal_static_WebMonitorModuleStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.WebMonitorModuleStatusProto.internal_static_WebMonitorModuleStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus.class, generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus.Builder.class);
      }

      // Construct using generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus.newBuilder()
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
        attachedDomainSession_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (moduleStatusBuilder_ == null) {
          moduleStatus_ = null;
        } else {
          moduleStatus_ = null;
          moduleStatusBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.WebMonitorModuleStatusProto.internal_static_WebMonitorModuleStatus_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus getDefaultInstanceForType() {
        return generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus build() {
        generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus buildPartial() {
        generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus result = new generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          attachedDomainSession_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attachedDomainSession_ = attachedDomainSession_;
        if (moduleStatusBuilder_ == null) {
          result.moduleStatus_ = moduleStatus_;
        } else {
          result.moduleStatus_ = moduleStatusBuilder_.build();
        }
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
        if (other instanceof generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus) {
          return mergeFrom((generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus other) {
        if (other == generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus.getDefaultInstance()) return this;
        if (!other.attachedDomainSession_.isEmpty()) {
          if (attachedDomainSession_.isEmpty()) {
            attachedDomainSession_ = other.attachedDomainSession_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttachedDomainSessionIsMutable();
            attachedDomainSession_.addAll(other.attachedDomainSession_);
          }
          onChanged();
        }
        if (other.hasModuleStatus()) {
          mergeModuleStatus(other.getModuleStatus());
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
        generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList attachedDomainSession_ = emptyIntList();
      private void ensureAttachedDomainSessionIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          attachedDomainSession_ = mutableCopy(attachedDomainSession_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <pre>
       * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
       * empty. 
       * </pre>
       *
       * <code>repeated int32 attached_domain_session = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getAttachedDomainSessionList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(attachedDomainSession_) : attachedDomainSession_;
      }
      /**
       * <pre>
       * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
       * empty. 
       * </pre>
       *
       * <code>repeated int32 attached_domain_session = 1;</code>
       */
      public int getAttachedDomainSessionCount() {
        return attachedDomainSession_.size();
      }
      /**
       * <pre>
       * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
       * empty. 
       * </pre>
       *
       * <code>repeated int32 attached_domain_session = 1;</code>
       */
      public int getAttachedDomainSession(int index) {
        return attachedDomainSession_.getInt(index);
      }
      /**
       * <pre>
       * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
       * empty. 
       * </pre>
       *
       * <code>repeated int32 attached_domain_session = 1;</code>
       */
      public Builder setAttachedDomainSession(
          int index, int value) {
        ensureAttachedDomainSessionIsMutable();
        attachedDomainSession_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
       * empty. 
       * </pre>
       *
       * <code>repeated int32 attached_domain_session = 1;</code>
       */
      public Builder addAttachedDomainSession(int value) {
        ensureAttachedDomainSessionIsMutable();
        attachedDomainSession_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
       * empty. 
       * </pre>
       *
       * <code>repeated int32 attached_domain_session = 1;</code>
       */
      public Builder addAllAttachedDomainSession(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAttachedDomainSessionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attachedDomainSession_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The set of domain session ids to which the web monitor is attached. Can't be null. Can be
       * empty. 
       * </pre>
       *
       * <code>repeated int32 attached_domain_session = 1;</code>
       */
      public Builder clearAttachedDomainSession() {
        attachedDomainSession_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private generated.proto.common.ModuleStatusProto.ModuleStatus moduleStatus_;
      private com.google.protobuf.SingleFieldBuilderV3<
          generated.proto.common.ModuleStatusProto.ModuleStatus, generated.proto.common.ModuleStatusProto.ModuleStatus.Builder, generated.proto.common.ModuleStatusProto.ModuleStatusOrBuilder> moduleStatusBuilder_;
      /**
       * <pre>
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
       */
      public boolean hasModuleStatus() {
        return moduleStatusBuilder_ != null || moduleStatus_ != null;
      }
      /**
       * <pre>
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
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
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
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
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
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
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
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
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
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
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
       */
      public generated.proto.common.ModuleStatusProto.ModuleStatus.Builder getModuleStatusBuilder() {
        
        onChanged();
        return getModuleStatusFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
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
       * The ModuleStatus from which to construct the
       * WebMonitorModuleStatus. Can't be null. 
       * </pre>
       *
       * <code>.ModuleStatus module_status = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:WebMonitorModuleStatus)
    }

    // @@protoc_insertion_point(class_scope:WebMonitorModuleStatus)
    private static final generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus();
    }

    public static generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WebMonitorModuleStatus>
        PARSER = new com.google.protobuf.AbstractParser<WebMonitorModuleStatus>() {
      @java.lang.Override
      public WebMonitorModuleStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WebMonitorModuleStatus(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WebMonitorModuleStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WebMonitorModuleStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.WebMonitorModuleStatusProto.WebMonitorModuleStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WebMonitorModuleStatus_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WebMonitorModuleStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034WebMonitorModuleStatus.proto\032\022ModuleSt" +
      "atus.proto\"_\n\026WebMonitorModuleStatus\022\037\n\027" +
      "attached_domain_session\030\001 \003(\005\022$\n\rmodule_" +
      "status\030\002 \001(\0132\r.ModuleStatusB5\n\026generated" +
      ".proto.commonB\033WebMonitorModuleStatusPro" +
      "tob\006proto3"
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
    internal_static_WebMonitorModuleStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WebMonitorModuleStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WebMonitorModuleStatus_descriptor,
        new java.lang.String[] { "AttachedDomainSession", "ModuleStatus", });
    generated.proto.common.ModuleStatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
