// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatLog.proto

package generated.proto.common;

public final class ChatLogProto {
  private ChatLogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatLogOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatLog)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Unique id for the chat. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value chat_id = 1;</code>
     */
    boolean hasChatId();
    /**
     * <pre>
     * Unique id for the chat. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value chat_id = 1;</code>
     */
    com.google.protobuf.Int32Value getChatId();
    /**
     * <pre>
     * Unique id for the chat. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value chat_id = 1;</code>
     */
    com.google.protobuf.Int32ValueOrBuilder getChatIdOrBuilder();

    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    java.util.List<java.lang.String>
        getUserEntriesList();
    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    int getUserEntriesCount();
    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    java.lang.String getUserEntries(int index);
    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    com.google.protobuf.ByteString
        getUserEntriesBytes(int index);

    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    java.util.List<java.lang.String>
        getTutorEntriesList();
    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    int getTutorEntriesCount();
    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    java.lang.String getTutorEntries(int index);
    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    com.google.protobuf.ByteString
        getTutorEntriesBytes(int index);
  }
  /**
   * <pre>
   * This message contains a snapshot of a chat window log between the GIFT user and the GIFT tutor. 
   * </pre>
   *
   * Protobuf type {@code ChatLog}
   */
  public  static final class ChatLog extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChatLog)
      ChatLogOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatLog.newBuilder() to construct.
    private ChatLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatLog() {
      userEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      tutorEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatLog(
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
              if (chatId_ != null) {
                subBuilder = chatId_.toBuilder();
              }
              chatId_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(chatId_);
                chatId_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                userEntries_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              userEntries_.add(s);
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                tutorEntries_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              tutorEntries_.add(s);
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
          userEntries_ = userEntries_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          tutorEntries_ = tutorEntries_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.proto.common.ChatLogProto.internal_static_ChatLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.ChatLogProto.internal_static_ChatLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.ChatLogProto.ChatLog.class, generated.proto.common.ChatLogProto.ChatLog.Builder.class);
    }

    private int bitField0_;
    public static final int CHAT_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.Int32Value chatId_;
    /**
     * <pre>
     * Unique id for the chat. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value chat_id = 1;</code>
     */
    public boolean hasChatId() {
      return chatId_ != null;
    }
    /**
     * <pre>
     * Unique id for the chat. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value chat_id = 1;</code>
     */
    public com.google.protobuf.Int32Value getChatId() {
      return chatId_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : chatId_;
    }
    /**
     * <pre>
     * Unique id for the chat. 
     * </pre>
     *
     * <code>.google.protobuf.Int32Value chat_id = 1;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getChatIdOrBuilder() {
      return getChatId();
    }

    public static final int USER_ENTRIES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList userEntries_;
    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getUserEntriesList() {
      return userEntries_;
    }
    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    public int getUserEntriesCount() {
      return userEntries_.size();
    }
    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    public java.lang.String getUserEntries(int index) {
      return userEntries_.get(index);
    }
    /**
     * <pre>
     * User chat entries. 
     * </pre>
     *
     * <code>repeated string user_entries = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserEntriesBytes(int index) {
      return userEntries_.getByteString(index);
    }

    public static final int TUTOR_ENTRIES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList tutorEntries_;
    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTutorEntriesList() {
      return tutorEntries_;
    }
    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    public int getTutorEntriesCount() {
      return tutorEntries_.size();
    }
    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    public java.lang.String getTutorEntries(int index) {
      return tutorEntries_.get(index);
    }
    /**
     * <pre>
     * Tutor chat entries. 
     * </pre>
     *
     * <code>repeated string tutor_entries = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTutorEntriesBytes(int index) {
      return tutorEntries_.getByteString(index);
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
      if (chatId_ != null) {
        output.writeMessage(1, getChatId());
      }
      for (int i = 0; i < userEntries_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userEntries_.getRaw(i));
      }
      for (int i = 0; i < tutorEntries_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tutorEntries_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chatId_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getChatId());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < userEntries_.size(); i++) {
          dataSize += computeStringSizeNoTag(userEntries_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getUserEntriesList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tutorEntries_.size(); i++) {
          dataSize += computeStringSizeNoTag(tutorEntries_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getTutorEntriesList().size();
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
      if (!(obj instanceof generated.proto.common.ChatLogProto.ChatLog)) {
        return super.equals(obj);
      }
      generated.proto.common.ChatLogProto.ChatLog other = (generated.proto.common.ChatLogProto.ChatLog) obj;

      if (hasChatId() != other.hasChatId()) return false;
      if (hasChatId()) {
        if (!getChatId()
            .equals(other.getChatId())) return false;
      }
      if (!getUserEntriesList()
          .equals(other.getUserEntriesList())) return false;
      if (!getTutorEntriesList()
          .equals(other.getTutorEntriesList())) return false;
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
      if (hasChatId()) {
        hash = (37 * hash) + CHAT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getChatId().hashCode();
      }
      if (getUserEntriesCount() > 0) {
        hash = (37 * hash) + USER_ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getUserEntriesList().hashCode();
      }
      if (getTutorEntriesCount() > 0) {
        hash = (37 * hash) + TUTOR_ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getTutorEntriesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ChatLogProto.ChatLog parseFrom(
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
    public static Builder newBuilder(generated.proto.common.ChatLogProto.ChatLog prototype) {
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
     * This message contains a snapshot of a chat window log between the GIFT user and the GIFT tutor. 
     * </pre>
     *
     * Protobuf type {@code ChatLog}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatLog)
        generated.proto.common.ChatLogProto.ChatLogOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.ChatLogProto.internal_static_ChatLog_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.ChatLogProto.internal_static_ChatLog_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.ChatLogProto.ChatLog.class, generated.proto.common.ChatLogProto.ChatLog.Builder.class);
      }

      // Construct using generated.proto.common.ChatLogProto.ChatLog.newBuilder()
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
        if (chatIdBuilder_ == null) {
          chatId_ = null;
        } else {
          chatId_ = null;
          chatIdBuilder_ = null;
        }
        userEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        tutorEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.ChatLogProto.internal_static_ChatLog_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.ChatLogProto.ChatLog getDefaultInstanceForType() {
        return generated.proto.common.ChatLogProto.ChatLog.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.ChatLogProto.ChatLog build() {
        generated.proto.common.ChatLogProto.ChatLog result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.ChatLogProto.ChatLog buildPartial() {
        generated.proto.common.ChatLogProto.ChatLog result = new generated.proto.common.ChatLogProto.ChatLog(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (chatIdBuilder_ == null) {
          result.chatId_ = chatId_;
        } else {
          result.chatId_ = chatIdBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          userEntries_ = userEntries_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.userEntries_ = userEntries_;
        if (((bitField0_ & 0x00000004) != 0)) {
          tutorEntries_ = tutorEntries_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.tutorEntries_ = tutorEntries_;
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
        if (other instanceof generated.proto.common.ChatLogProto.ChatLog) {
          return mergeFrom((generated.proto.common.ChatLogProto.ChatLog)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.ChatLogProto.ChatLog other) {
        if (other == generated.proto.common.ChatLogProto.ChatLog.getDefaultInstance()) return this;
        if (other.hasChatId()) {
          mergeChatId(other.getChatId());
        }
        if (!other.userEntries_.isEmpty()) {
          if (userEntries_.isEmpty()) {
            userEntries_ = other.userEntries_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUserEntriesIsMutable();
            userEntries_.addAll(other.userEntries_);
          }
          onChanged();
        }
        if (!other.tutorEntries_.isEmpty()) {
          if (tutorEntries_.isEmpty()) {
            tutorEntries_ = other.tutorEntries_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureTutorEntriesIsMutable();
            tutorEntries_.addAll(other.tutorEntries_);
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
        generated.proto.common.ChatLogProto.ChatLog parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.ChatLogProto.ChatLog) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Int32Value chatId_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> chatIdBuilder_;
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public boolean hasChatId() {
        return chatIdBuilder_ != null || chatId_ != null;
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public com.google.protobuf.Int32Value getChatId() {
        if (chatIdBuilder_ == null) {
          return chatId_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : chatId_;
        } else {
          return chatIdBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public Builder setChatId(com.google.protobuf.Int32Value value) {
        if (chatIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chatId_ = value;
          onChanged();
        } else {
          chatIdBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public Builder setChatId(
          com.google.protobuf.Int32Value.Builder builderForValue) {
        if (chatIdBuilder_ == null) {
          chatId_ = builderForValue.build();
          onChanged();
        } else {
          chatIdBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public Builder mergeChatId(com.google.protobuf.Int32Value value) {
        if (chatIdBuilder_ == null) {
          if (chatId_ != null) {
            chatId_ =
              com.google.protobuf.Int32Value.newBuilder(chatId_).mergeFrom(value).buildPartial();
          } else {
            chatId_ = value;
          }
          onChanged();
        } else {
          chatIdBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public Builder clearChatId() {
        if (chatIdBuilder_ == null) {
          chatId_ = null;
          onChanged();
        } else {
          chatId_ = null;
          chatIdBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public com.google.protobuf.Int32Value.Builder getChatIdBuilder() {
        
        onChanged();
        return getChatIdFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      public com.google.protobuf.Int32ValueOrBuilder getChatIdOrBuilder() {
        if (chatIdBuilder_ != null) {
          return chatIdBuilder_.getMessageOrBuilder();
        } else {
          return chatId_ == null ?
              com.google.protobuf.Int32Value.getDefaultInstance() : chatId_;
        }
      }
      /**
       * <pre>
       * Unique id for the chat. 
       * </pre>
       *
       * <code>.google.protobuf.Int32Value chat_id = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
          getChatIdFieldBuilder() {
        if (chatIdBuilder_ == null) {
          chatIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                  getChatId(),
                  getParentForChildren(),
                  isClean());
          chatId_ = null;
        }
        return chatIdBuilder_;
      }

      private com.google.protobuf.LazyStringList userEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureUserEntriesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          userEntries_ = new com.google.protobuf.LazyStringArrayList(userEntries_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getUserEntriesList() {
        return userEntries_.getUnmodifiableView();
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public int getUserEntriesCount() {
        return userEntries_.size();
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public java.lang.String getUserEntries(int index) {
        return userEntries_.get(index);
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUserEntriesBytes(int index) {
        return userEntries_.getByteString(index);
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public Builder setUserEntries(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUserEntriesIsMutable();
        userEntries_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public Builder addUserEntries(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUserEntriesIsMutable();
        userEntries_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public Builder addAllUserEntries(
          java.lang.Iterable<java.lang.String> values) {
        ensureUserEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userEntries_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public Builder clearUserEntries() {
        userEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * User chat entries. 
       * </pre>
       *
       * <code>repeated string user_entries = 2;</code>
       */
      public Builder addUserEntriesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureUserEntriesIsMutable();
        userEntries_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList tutorEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureTutorEntriesIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          tutorEntries_ = new com.google.protobuf.LazyStringArrayList(tutorEntries_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getTutorEntriesList() {
        return tutorEntries_.getUnmodifiableView();
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public int getTutorEntriesCount() {
        return tutorEntries_.size();
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public java.lang.String getTutorEntries(int index) {
        return tutorEntries_.get(index);
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTutorEntriesBytes(int index) {
        return tutorEntries_.getByteString(index);
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public Builder setTutorEntries(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTutorEntriesIsMutable();
        tutorEntries_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public Builder addTutorEntries(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTutorEntriesIsMutable();
        tutorEntries_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public Builder addAllTutorEntries(
          java.lang.Iterable<java.lang.String> values) {
        ensureTutorEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tutorEntries_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public Builder clearTutorEntries() {
        tutorEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Tutor chat entries. 
       * </pre>
       *
       * <code>repeated string tutor_entries = 3;</code>
       */
      public Builder addTutorEntriesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureTutorEntriesIsMutable();
        tutorEntries_.add(value);
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


      // @@protoc_insertion_point(builder_scope:ChatLog)
    }

    // @@protoc_insertion_point(class_scope:ChatLog)
    private static final generated.proto.common.ChatLogProto.ChatLog DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.ChatLogProto.ChatLog();
    }

    public static generated.proto.common.ChatLogProto.ChatLog getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatLog>
        PARSER = new com.google.protobuf.AbstractParser<ChatLog>() {
      @java.lang.Override
      public ChatLog parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatLog(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatLog> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatLog> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.ChatLogProto.ChatLog getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatLog_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rChatLog.proto\032\036google/protobuf/wrapper" +
      "s.proto\"d\n\007ChatLog\022,\n\007chat_id\030\001 \001(\0132\033.go" +
      "ogle.protobuf.Int32Value\022\024\n\014user_entries" +
      "\030\002 \003(\t\022\025\n\rtutor_entries\030\003 \003(\tB&\n\026generat" +
      "ed.proto.commonB\014ChatLogProtob\006proto3"
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
    internal_static_ChatLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatLog_descriptor,
        new java.lang.String[] { "ChatId", "UserEntries", "TutorEntries", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}