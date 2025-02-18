// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TutorMeLearnerTutorAction.proto

package generated.proto.common;

public final class TutorMeLearnerTutorActionProto {
  private TutorMeLearnerTutorActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TutorMeLearnerTutorActionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TutorMeLearnerTutorAction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The name of the learner action. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue action_name = 1;</code>
     */
    boolean hasActionName();
    /**
     * <pre>
     * The name of the learner action. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue action_name = 1;</code>
     */
    com.google.protobuf.StringValue getActionName();
    /**
     * <pre>
     * The name of the learner action. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue action_name = 1;</code>
     */
    com.google.protobuf.StringValueOrBuilder getActionNameOrBuilder();

    /**
     * <pre>
     * The learner action. 
     * </pre>
     *
     * <code>.LearnerAction learner_action = 2;</code>
     */
    boolean hasLearnerAction();
    /**
     * <pre>
     * The learner action. 
     * </pre>
     *
     * <code>.LearnerAction learner_action = 2;</code>
     */
    generated.proto.common.LearnerActionProto.LearnerAction getLearnerAction();
    /**
     * <pre>
     * The learner action. 
     * </pre>
     *
     * <code>.LearnerAction learner_action = 2;</code>
     */
    generated.proto.common.LearnerActionProto.LearnerActionOrBuilder getLearnerActionOrBuilder();
  }
  /**
   * <pre>
   * This message represents the learner tutor action of a set attribute. 
   * </pre>
   *
   * Protobuf type {@code TutorMeLearnerTutorAction}
   */
  public  static final class TutorMeLearnerTutorAction extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TutorMeLearnerTutorAction)
      TutorMeLearnerTutorActionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TutorMeLearnerTutorAction.newBuilder() to construct.
    private TutorMeLearnerTutorAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TutorMeLearnerTutorAction() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TutorMeLearnerTutorAction(
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
              if (actionName_ != null) {
                subBuilder = actionName_.toBuilder();
              }
              actionName_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(actionName_);
                actionName_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              generated.proto.common.LearnerActionProto.LearnerAction.Builder subBuilder = null;
              if (learnerAction_ != null) {
                subBuilder = learnerAction_.toBuilder();
              }
              learnerAction_ = input.readMessage(generated.proto.common.LearnerActionProto.LearnerAction.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(learnerAction_);
                learnerAction_ = subBuilder.buildPartial();
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
      return generated.proto.common.TutorMeLearnerTutorActionProto.internal_static_TutorMeLearnerTutorAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.TutorMeLearnerTutorActionProto.internal_static_TutorMeLearnerTutorAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction.class, generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction.Builder.class);
    }

    public static final int ACTION_NAME_FIELD_NUMBER = 1;
    private com.google.protobuf.StringValue actionName_;
    /**
     * <pre>
     * The name of the learner action. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue action_name = 1;</code>
     */
    public boolean hasActionName() {
      return actionName_ != null;
    }
    /**
     * <pre>
     * The name of the learner action. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue action_name = 1;</code>
     */
    public com.google.protobuf.StringValue getActionName() {
      return actionName_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : actionName_;
    }
    /**
     * <pre>
     * The name of the learner action. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue action_name = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getActionNameOrBuilder() {
      return getActionName();
    }

    public static final int LEARNER_ACTION_FIELD_NUMBER = 2;
    private generated.proto.common.LearnerActionProto.LearnerAction learnerAction_;
    /**
     * <pre>
     * The learner action. 
     * </pre>
     *
     * <code>.LearnerAction learner_action = 2;</code>
     */
    public boolean hasLearnerAction() {
      return learnerAction_ != null;
    }
    /**
     * <pre>
     * The learner action. 
     * </pre>
     *
     * <code>.LearnerAction learner_action = 2;</code>
     */
    public generated.proto.common.LearnerActionProto.LearnerAction getLearnerAction() {
      return learnerAction_ == null ? generated.proto.common.LearnerActionProto.LearnerAction.getDefaultInstance() : learnerAction_;
    }
    /**
     * <pre>
     * The learner action. 
     * </pre>
     *
     * <code>.LearnerAction learner_action = 2;</code>
     */
    public generated.proto.common.LearnerActionProto.LearnerActionOrBuilder getLearnerActionOrBuilder() {
      return getLearnerAction();
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
      if (actionName_ != null) {
        output.writeMessage(1, getActionName());
      }
      if (learnerAction_ != null) {
        output.writeMessage(2, getLearnerAction());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (actionName_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getActionName());
      }
      if (learnerAction_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLearnerAction());
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
      if (!(obj instanceof generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction)) {
        return super.equals(obj);
      }
      generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction other = (generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction) obj;

      if (hasActionName() != other.hasActionName()) return false;
      if (hasActionName()) {
        if (!getActionName()
            .equals(other.getActionName())) return false;
      }
      if (hasLearnerAction() != other.hasLearnerAction()) return false;
      if (hasLearnerAction()) {
        if (!getLearnerAction()
            .equals(other.getLearnerAction())) return false;
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
      if (hasActionName()) {
        hash = (37 * hash) + ACTION_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getActionName().hashCode();
      }
      if (hasLearnerAction()) {
        hash = (37 * hash) + LEARNER_ACTION_FIELD_NUMBER;
        hash = (53 * hash) + getLearnerAction().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parseFrom(
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
    public static Builder newBuilder(generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction prototype) {
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
     * This message represents the learner tutor action of a set attribute. 
     * </pre>
     *
     * Protobuf type {@code TutorMeLearnerTutorAction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TutorMeLearnerTutorAction)
        generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorActionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.TutorMeLearnerTutorActionProto.internal_static_TutorMeLearnerTutorAction_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.TutorMeLearnerTutorActionProto.internal_static_TutorMeLearnerTutorAction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction.class, generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction.Builder.class);
      }

      // Construct using generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction.newBuilder()
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
        if (actionNameBuilder_ == null) {
          actionName_ = null;
        } else {
          actionName_ = null;
          actionNameBuilder_ = null;
        }
        if (learnerActionBuilder_ == null) {
          learnerAction_ = null;
        } else {
          learnerAction_ = null;
          learnerActionBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.TutorMeLearnerTutorActionProto.internal_static_TutorMeLearnerTutorAction_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction getDefaultInstanceForType() {
        return generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction build() {
        generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction buildPartial() {
        generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction result = new generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction(this);
        if (actionNameBuilder_ == null) {
          result.actionName_ = actionName_;
        } else {
          result.actionName_ = actionNameBuilder_.build();
        }
        if (learnerActionBuilder_ == null) {
          result.learnerAction_ = learnerAction_;
        } else {
          result.learnerAction_ = learnerActionBuilder_.build();
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
        if (other instanceof generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction) {
          return mergeFrom((generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction other) {
        if (other == generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction.getDefaultInstance()) return this;
        if (other.hasActionName()) {
          mergeActionName(other.getActionName());
        }
        if (other.hasLearnerAction()) {
          mergeLearnerAction(other.getLearnerAction());
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
        generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.StringValue actionName_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> actionNameBuilder_;
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public boolean hasActionName() {
        return actionNameBuilder_ != null || actionName_ != null;
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public com.google.protobuf.StringValue getActionName() {
        if (actionNameBuilder_ == null) {
          return actionName_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : actionName_;
        } else {
          return actionNameBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public Builder setActionName(com.google.protobuf.StringValue value) {
        if (actionNameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          actionName_ = value;
          onChanged();
        } else {
          actionNameBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public Builder setActionName(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (actionNameBuilder_ == null) {
          actionName_ = builderForValue.build();
          onChanged();
        } else {
          actionNameBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public Builder mergeActionName(com.google.protobuf.StringValue value) {
        if (actionNameBuilder_ == null) {
          if (actionName_ != null) {
            actionName_ =
              com.google.protobuf.StringValue.newBuilder(actionName_).mergeFrom(value).buildPartial();
          } else {
            actionName_ = value;
          }
          onChanged();
        } else {
          actionNameBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public Builder clearActionName() {
        if (actionNameBuilder_ == null) {
          actionName_ = null;
          onChanged();
        } else {
          actionName_ = null;
          actionNameBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public com.google.protobuf.StringValue.Builder getActionNameBuilder() {
        
        onChanged();
        return getActionNameFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getActionNameOrBuilder() {
        if (actionNameBuilder_ != null) {
          return actionNameBuilder_.getMessageOrBuilder();
        } else {
          return actionName_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : actionName_;
        }
      }
      /**
       * <pre>
       * The name of the learner action. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue action_name = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getActionNameFieldBuilder() {
        if (actionNameBuilder_ == null) {
          actionNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getActionName(),
                  getParentForChildren(),
                  isClean());
          actionName_ = null;
        }
        return actionNameBuilder_;
      }

      private generated.proto.common.LearnerActionProto.LearnerAction learnerAction_;
      private com.google.protobuf.SingleFieldBuilderV3<
          generated.proto.common.LearnerActionProto.LearnerAction, generated.proto.common.LearnerActionProto.LearnerAction.Builder, generated.proto.common.LearnerActionProto.LearnerActionOrBuilder> learnerActionBuilder_;
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public boolean hasLearnerAction() {
        return learnerActionBuilder_ != null || learnerAction_ != null;
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public generated.proto.common.LearnerActionProto.LearnerAction getLearnerAction() {
        if (learnerActionBuilder_ == null) {
          return learnerAction_ == null ? generated.proto.common.LearnerActionProto.LearnerAction.getDefaultInstance() : learnerAction_;
        } else {
          return learnerActionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public Builder setLearnerAction(generated.proto.common.LearnerActionProto.LearnerAction value) {
        if (learnerActionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          learnerAction_ = value;
          onChanged();
        } else {
          learnerActionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public Builder setLearnerAction(
          generated.proto.common.LearnerActionProto.LearnerAction.Builder builderForValue) {
        if (learnerActionBuilder_ == null) {
          learnerAction_ = builderForValue.build();
          onChanged();
        } else {
          learnerActionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public Builder mergeLearnerAction(generated.proto.common.LearnerActionProto.LearnerAction value) {
        if (learnerActionBuilder_ == null) {
          if (learnerAction_ != null) {
            learnerAction_ =
              generated.proto.common.LearnerActionProto.LearnerAction.newBuilder(learnerAction_).mergeFrom(value).buildPartial();
          } else {
            learnerAction_ = value;
          }
          onChanged();
        } else {
          learnerActionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public Builder clearLearnerAction() {
        if (learnerActionBuilder_ == null) {
          learnerAction_ = null;
          onChanged();
        } else {
          learnerAction_ = null;
          learnerActionBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public generated.proto.common.LearnerActionProto.LearnerAction.Builder getLearnerActionBuilder() {
        
        onChanged();
        return getLearnerActionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      public generated.proto.common.LearnerActionProto.LearnerActionOrBuilder getLearnerActionOrBuilder() {
        if (learnerActionBuilder_ != null) {
          return learnerActionBuilder_.getMessageOrBuilder();
        } else {
          return learnerAction_ == null ?
              generated.proto.common.LearnerActionProto.LearnerAction.getDefaultInstance() : learnerAction_;
        }
      }
      /**
       * <pre>
       * The learner action. 
       * </pre>
       *
       * <code>.LearnerAction learner_action = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          generated.proto.common.LearnerActionProto.LearnerAction, generated.proto.common.LearnerActionProto.LearnerAction.Builder, generated.proto.common.LearnerActionProto.LearnerActionOrBuilder> 
          getLearnerActionFieldBuilder() {
        if (learnerActionBuilder_ == null) {
          learnerActionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              generated.proto.common.LearnerActionProto.LearnerAction, generated.proto.common.LearnerActionProto.LearnerAction.Builder, generated.proto.common.LearnerActionProto.LearnerActionOrBuilder>(
                  getLearnerAction(),
                  getParentForChildren(),
                  isClean());
          learnerAction_ = null;
        }
        return learnerActionBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TutorMeLearnerTutorAction)
    }

    // @@protoc_insertion_point(class_scope:TutorMeLearnerTutorAction)
    private static final generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction();
    }

    public static generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TutorMeLearnerTutorAction>
        PARSER = new com.google.protobuf.AbstractParser<TutorMeLearnerTutorAction>() {
      @java.lang.Override
      public TutorMeLearnerTutorAction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TutorMeLearnerTutorAction(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TutorMeLearnerTutorAction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TutorMeLearnerTutorAction> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.TutorMeLearnerTutorActionProto.TutorMeLearnerTutorAction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TutorMeLearnerTutorAction_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TutorMeLearnerTutorAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037TutorMeLearnerTutorAction.proto\032\023Learn" +
      "erAction.proto\032\036google/protobuf/wrappers" +
      ".proto\"v\n\031TutorMeLearnerTutorAction\0221\n\013a" +
      "ction_name\030\001 \001(\0132\034.google.protobuf.Strin" +
      "gValue\022&\n\016learner_action\030\002 \001(\0132\016.Learner" +
      "ActionB8\n\026generated.proto.commonB\036TutorM" +
      "eLearnerTutorActionProtob\006proto3"
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
          generated.proto.common.LearnerActionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_TutorMeLearnerTutorAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TutorMeLearnerTutorAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TutorMeLearnerTutorAction_descriptor,
        new java.lang.String[] { "ActionName", "LearnerAction", });
    generated.proto.common.LearnerActionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
