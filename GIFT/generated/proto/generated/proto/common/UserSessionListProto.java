// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserSessionList.proto

package generated.proto.common;

public final class UserSessionListProto {
  private UserSessionListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserSessionListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UserSessionList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    java.util.List<generated.proto.common.UserSessionProto.UserSession> 
        getUserSessionsList();
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    generated.proto.common.UserSessionProto.UserSession getUserSessions(int index);
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    int getUserSessionsCount();
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    java.util.List<? extends generated.proto.common.UserSessionProto.UserSessionOrBuilder> 
        getUserSessionsOrBuilderList();
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    generated.proto.common.UserSessionProto.UserSessionOrBuilder getUserSessionsOrBuilder(
        int index);
  }
  /**
   * <pre>
   * This message contains a list of user sessions. 
   * </pre>
   *
   * Protobuf type {@code UserSessionList}
   */
  public  static final class UserSessionList extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UserSessionList)
      UserSessionListOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserSessionList.newBuilder() to construct.
    private UserSessionList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserSessionList() {
      userSessions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserSessionList(
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
                userSessions_ = new java.util.ArrayList<generated.proto.common.UserSessionProto.UserSession>();
                mutable_bitField0_ |= 0x00000001;
              }
              userSessions_.add(
                  input.readMessage(generated.proto.common.UserSessionProto.UserSession.parser(), extensionRegistry));
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
          userSessions_ = java.util.Collections.unmodifiableList(userSessions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.proto.common.UserSessionListProto.internal_static_UserSessionList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.UserSessionListProto.internal_static_UserSessionList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.UserSessionListProto.UserSessionList.class, generated.proto.common.UserSessionListProto.UserSessionList.Builder.class);
    }

    public static final int USER_SESSIONS_FIELD_NUMBER = 1;
    private java.util.List<generated.proto.common.UserSessionProto.UserSession> userSessions_;
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    public java.util.List<generated.proto.common.UserSessionProto.UserSession> getUserSessionsList() {
      return userSessions_;
    }
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    public java.util.List<? extends generated.proto.common.UserSessionProto.UserSessionOrBuilder> 
        getUserSessionsOrBuilderList() {
      return userSessions_;
    }
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    public int getUserSessionsCount() {
      return userSessions_.size();
    }
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    public generated.proto.common.UserSessionProto.UserSession getUserSessions(int index) {
      return userSessions_.get(index);
    }
    /**
     * <pre>
     * The list of user sessions. 
     * </pre>
     *
     * <code>repeated .UserSession user_sessions = 1;</code>
     */
    public generated.proto.common.UserSessionProto.UserSessionOrBuilder getUserSessionsOrBuilder(
        int index) {
      return userSessions_.get(index);
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
      for (int i = 0; i < userSessions_.size(); i++) {
        output.writeMessage(1, userSessions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < userSessions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, userSessions_.get(i));
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
      if (!(obj instanceof generated.proto.common.UserSessionListProto.UserSessionList)) {
        return super.equals(obj);
      }
      generated.proto.common.UserSessionListProto.UserSessionList other = (generated.proto.common.UserSessionListProto.UserSessionList) obj;

      if (!getUserSessionsList()
          .equals(other.getUserSessionsList())) return false;
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
      if (getUserSessionsCount() > 0) {
        hash = (37 * hash) + USER_SESSIONS_FIELD_NUMBER;
        hash = (53 * hash) + getUserSessionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.UserSessionListProto.UserSessionList parseFrom(
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
    public static Builder newBuilder(generated.proto.common.UserSessionListProto.UserSessionList prototype) {
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
     * This message contains a list of user sessions. 
     * </pre>
     *
     * Protobuf type {@code UserSessionList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UserSessionList)
        generated.proto.common.UserSessionListProto.UserSessionListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.UserSessionListProto.internal_static_UserSessionList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.UserSessionListProto.internal_static_UserSessionList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.UserSessionListProto.UserSessionList.class, generated.proto.common.UserSessionListProto.UserSessionList.Builder.class);
      }

      // Construct using generated.proto.common.UserSessionListProto.UserSessionList.newBuilder()
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
          getUserSessionsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (userSessionsBuilder_ == null) {
          userSessions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          userSessionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.UserSessionListProto.internal_static_UserSessionList_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.UserSessionListProto.UserSessionList getDefaultInstanceForType() {
        return generated.proto.common.UserSessionListProto.UserSessionList.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.UserSessionListProto.UserSessionList build() {
        generated.proto.common.UserSessionListProto.UserSessionList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.UserSessionListProto.UserSessionList buildPartial() {
        generated.proto.common.UserSessionListProto.UserSessionList result = new generated.proto.common.UserSessionListProto.UserSessionList(this);
        int from_bitField0_ = bitField0_;
        if (userSessionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            userSessions_ = java.util.Collections.unmodifiableList(userSessions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.userSessions_ = userSessions_;
        } else {
          result.userSessions_ = userSessionsBuilder_.build();
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
        if (other instanceof generated.proto.common.UserSessionListProto.UserSessionList) {
          return mergeFrom((generated.proto.common.UserSessionListProto.UserSessionList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.UserSessionListProto.UserSessionList other) {
        if (other == generated.proto.common.UserSessionListProto.UserSessionList.getDefaultInstance()) return this;
        if (userSessionsBuilder_ == null) {
          if (!other.userSessions_.isEmpty()) {
            if (userSessions_.isEmpty()) {
              userSessions_ = other.userSessions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUserSessionsIsMutable();
              userSessions_.addAll(other.userSessions_);
            }
            onChanged();
          }
        } else {
          if (!other.userSessions_.isEmpty()) {
            if (userSessionsBuilder_.isEmpty()) {
              userSessionsBuilder_.dispose();
              userSessionsBuilder_ = null;
              userSessions_ = other.userSessions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              userSessionsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUserSessionsFieldBuilder() : null;
            } else {
              userSessionsBuilder_.addAllMessages(other.userSessions_);
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
        generated.proto.common.UserSessionListProto.UserSessionList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.UserSessionListProto.UserSessionList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<generated.proto.common.UserSessionProto.UserSession> userSessions_ =
        java.util.Collections.emptyList();
      private void ensureUserSessionsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          userSessions_ = new java.util.ArrayList<generated.proto.common.UserSessionProto.UserSession>(userSessions_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          generated.proto.common.UserSessionProto.UserSession, generated.proto.common.UserSessionProto.UserSession.Builder, generated.proto.common.UserSessionProto.UserSessionOrBuilder> userSessionsBuilder_;

      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public java.util.List<generated.proto.common.UserSessionProto.UserSession> getUserSessionsList() {
        if (userSessionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(userSessions_);
        } else {
          return userSessionsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public int getUserSessionsCount() {
        if (userSessionsBuilder_ == null) {
          return userSessions_.size();
        } else {
          return userSessionsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public generated.proto.common.UserSessionProto.UserSession getUserSessions(int index) {
        if (userSessionsBuilder_ == null) {
          return userSessions_.get(index);
        } else {
          return userSessionsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder setUserSessions(
          int index, generated.proto.common.UserSessionProto.UserSession value) {
        if (userSessionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUserSessionsIsMutable();
          userSessions_.set(index, value);
          onChanged();
        } else {
          userSessionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder setUserSessions(
          int index, generated.proto.common.UserSessionProto.UserSession.Builder builderForValue) {
        if (userSessionsBuilder_ == null) {
          ensureUserSessionsIsMutable();
          userSessions_.set(index, builderForValue.build());
          onChanged();
        } else {
          userSessionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder addUserSessions(generated.proto.common.UserSessionProto.UserSession value) {
        if (userSessionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUserSessionsIsMutable();
          userSessions_.add(value);
          onChanged();
        } else {
          userSessionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder addUserSessions(
          int index, generated.proto.common.UserSessionProto.UserSession value) {
        if (userSessionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUserSessionsIsMutable();
          userSessions_.add(index, value);
          onChanged();
        } else {
          userSessionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder addUserSessions(
          generated.proto.common.UserSessionProto.UserSession.Builder builderForValue) {
        if (userSessionsBuilder_ == null) {
          ensureUserSessionsIsMutable();
          userSessions_.add(builderForValue.build());
          onChanged();
        } else {
          userSessionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder addUserSessions(
          int index, generated.proto.common.UserSessionProto.UserSession.Builder builderForValue) {
        if (userSessionsBuilder_ == null) {
          ensureUserSessionsIsMutable();
          userSessions_.add(index, builderForValue.build());
          onChanged();
        } else {
          userSessionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder addAllUserSessions(
          java.lang.Iterable<? extends generated.proto.common.UserSessionProto.UserSession> values) {
        if (userSessionsBuilder_ == null) {
          ensureUserSessionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, userSessions_);
          onChanged();
        } else {
          userSessionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder clearUserSessions() {
        if (userSessionsBuilder_ == null) {
          userSessions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          userSessionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public Builder removeUserSessions(int index) {
        if (userSessionsBuilder_ == null) {
          ensureUserSessionsIsMutable();
          userSessions_.remove(index);
          onChanged();
        } else {
          userSessionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public generated.proto.common.UserSessionProto.UserSession.Builder getUserSessionsBuilder(
          int index) {
        return getUserSessionsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public generated.proto.common.UserSessionProto.UserSessionOrBuilder getUserSessionsOrBuilder(
          int index) {
        if (userSessionsBuilder_ == null) {
          return userSessions_.get(index);  } else {
          return userSessionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public java.util.List<? extends generated.proto.common.UserSessionProto.UserSessionOrBuilder> 
           getUserSessionsOrBuilderList() {
        if (userSessionsBuilder_ != null) {
          return userSessionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(userSessions_);
        }
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public generated.proto.common.UserSessionProto.UserSession.Builder addUserSessionsBuilder() {
        return getUserSessionsFieldBuilder().addBuilder(
            generated.proto.common.UserSessionProto.UserSession.getDefaultInstance());
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public generated.proto.common.UserSessionProto.UserSession.Builder addUserSessionsBuilder(
          int index) {
        return getUserSessionsFieldBuilder().addBuilder(
            index, generated.proto.common.UserSessionProto.UserSession.getDefaultInstance());
      }
      /**
       * <pre>
       * The list of user sessions. 
       * </pre>
       *
       * <code>repeated .UserSession user_sessions = 1;</code>
       */
      public java.util.List<generated.proto.common.UserSessionProto.UserSession.Builder> 
           getUserSessionsBuilderList() {
        return getUserSessionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          generated.proto.common.UserSessionProto.UserSession, generated.proto.common.UserSessionProto.UserSession.Builder, generated.proto.common.UserSessionProto.UserSessionOrBuilder> 
          getUserSessionsFieldBuilder() {
        if (userSessionsBuilder_ == null) {
          userSessionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              generated.proto.common.UserSessionProto.UserSession, generated.proto.common.UserSessionProto.UserSession.Builder, generated.proto.common.UserSessionProto.UserSessionOrBuilder>(
                  userSessions_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          userSessions_ = null;
        }
        return userSessionsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:UserSessionList)
    }

    // @@protoc_insertion_point(class_scope:UserSessionList)
    private static final generated.proto.common.UserSessionListProto.UserSessionList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.UserSessionListProto.UserSessionList();
    }

    public static generated.proto.common.UserSessionListProto.UserSessionList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserSessionList>
        PARSER = new com.google.protobuf.AbstractParser<UserSessionList>() {
      @java.lang.Override
      public UserSessionList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserSessionList(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserSessionList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserSessionList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.UserSessionListProto.UserSessionList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserSessionList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserSessionList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025UserSessionList.proto\032\021UserSession.pro" +
      "to\"6\n\017UserSessionList\022#\n\ruser_sessions\030\001" +
      " \003(\0132\014.UserSessionB.\n\026generated.proto.co" +
      "mmonB\024UserSessionListProtob\006proto3"
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
          generated.proto.common.UserSessionProto.getDescriptor(),
        }, assigner);
    internal_static_UserSessionList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UserSessionList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserSessionList_descriptor,
        new java.lang.String[] { "UserSessions", });
    generated.proto.common.UserSessionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
