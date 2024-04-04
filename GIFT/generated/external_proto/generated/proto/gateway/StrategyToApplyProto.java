// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StrategyToApply.proto

package generated.proto.gateway;

public final class StrategyToApplyProto {
  private StrategyToApplyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StrategyToApplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StrategyToApply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string trigger = 1;</code>
     */
    java.lang.String getTrigger();
    /**
     * <code>string trigger = 1;</code>
     */
    com.google.protobuf.ByteString
        getTriggerBytes();

    /**
     * <code>.Strategy strategy = 2;</code>
     */
    boolean hasStrategy();
    /**
     * <code>.Strategy strategy = 2;</code>
     */
    generated.proto.gateway.StrategyProto.Strategy getStrategy();
    /**
     * <code>.Strategy strategy = 2;</code>
     */
    generated.proto.gateway.StrategyProto.StrategyOrBuilder getStrategyOrBuilder();

    /**
     * <code>string evaluator = 3;</code>
     */
    java.lang.String getEvaluator();
    /**
     * <code>string evaluator = 3;</code>
     */
    com.google.protobuf.ByteString
        getEvaluatorBytes();
  }
  /**
   * Protobuf type {@code StrategyToApply}
   */
  public  static final class StrategyToApply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StrategyToApply)
      StrategyToApplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StrategyToApply.newBuilder() to construct.
    private StrategyToApply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StrategyToApply() {
      trigger_ = "";
      evaluator_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StrategyToApply(
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

              trigger_ = s;
              break;
            }
            case 18: {
              generated.proto.gateway.StrategyProto.Strategy.Builder subBuilder = null;
              if (strategy_ != null) {
                subBuilder = strategy_.toBuilder();
              }
              strategy_ = input.readMessage(generated.proto.gateway.StrategyProto.Strategy.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(strategy_);
                strategy_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              evaluator_ = s;
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
      return generated.proto.gateway.StrategyToApplyProto.internal_static_StrategyToApply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.gateway.StrategyToApplyProto.internal_static_StrategyToApply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.gateway.StrategyToApplyProto.StrategyToApply.class, generated.proto.gateway.StrategyToApplyProto.StrategyToApply.Builder.class);
    }

    public static final int TRIGGER_FIELD_NUMBER = 1;
    private volatile java.lang.Object trigger_;
    /**
     * <code>string trigger = 1;</code>
     */
    public java.lang.String getTrigger() {
      java.lang.Object ref = trigger_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trigger_ = s;
        return s;
      }
    }
    /**
     * <code>string trigger = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTriggerBytes() {
      java.lang.Object ref = trigger_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trigger_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STRATEGY_FIELD_NUMBER = 2;
    private generated.proto.gateway.StrategyProto.Strategy strategy_;
    /**
     * <code>.Strategy strategy = 2;</code>
     */
    public boolean hasStrategy() {
      return strategy_ != null;
    }
    /**
     * <code>.Strategy strategy = 2;</code>
     */
    public generated.proto.gateway.StrategyProto.Strategy getStrategy() {
      return strategy_ == null ? generated.proto.gateway.StrategyProto.Strategy.getDefaultInstance() : strategy_;
    }
    /**
     * <code>.Strategy strategy = 2;</code>
     */
    public generated.proto.gateway.StrategyProto.StrategyOrBuilder getStrategyOrBuilder() {
      return getStrategy();
    }

    public static final int EVALUATOR_FIELD_NUMBER = 3;
    private volatile java.lang.Object evaluator_;
    /**
     * <code>string evaluator = 3;</code>
     */
    public java.lang.String getEvaluator() {
      java.lang.Object ref = evaluator_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        evaluator_ = s;
        return s;
      }
    }
    /**
     * <code>string evaluator = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEvaluatorBytes() {
      java.lang.Object ref = evaluator_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        evaluator_ = b;
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
      if (!getTriggerBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trigger_);
      }
      if (strategy_ != null) {
        output.writeMessage(2, getStrategy());
      }
      if (!getEvaluatorBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, evaluator_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTriggerBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trigger_);
      }
      if (strategy_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getStrategy());
      }
      if (!getEvaluatorBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, evaluator_);
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
      if (!(obj instanceof generated.proto.gateway.StrategyToApplyProto.StrategyToApply)) {
        return super.equals(obj);
      }
      generated.proto.gateway.StrategyToApplyProto.StrategyToApply other = (generated.proto.gateway.StrategyToApplyProto.StrategyToApply) obj;

      if (!getTrigger()
          .equals(other.getTrigger())) return false;
      if (hasStrategy() != other.hasStrategy()) return false;
      if (hasStrategy()) {
        if (!getStrategy()
            .equals(other.getStrategy())) return false;
      }
      if (!getEvaluator()
          .equals(other.getEvaluator())) return false;
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
      hash = (37 * hash) + TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getTrigger().hashCode();
      if (hasStrategy()) {
        hash = (37 * hash) + STRATEGY_FIELD_NUMBER;
        hash = (53 * hash) + getStrategy().hashCode();
      }
      hash = (37 * hash) + EVALUATOR_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluator().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply parseFrom(
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
    public static Builder newBuilder(generated.proto.gateway.StrategyToApplyProto.StrategyToApply prototype) {
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
     * Protobuf type {@code StrategyToApply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StrategyToApply)
        generated.proto.gateway.StrategyToApplyProto.StrategyToApplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.gateway.StrategyToApplyProto.internal_static_StrategyToApply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.gateway.StrategyToApplyProto.internal_static_StrategyToApply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.gateway.StrategyToApplyProto.StrategyToApply.class, generated.proto.gateway.StrategyToApplyProto.StrategyToApply.Builder.class);
      }

      // Construct using generated.proto.gateway.StrategyToApplyProto.StrategyToApply.newBuilder()
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
        trigger_ = "";

        if (strategyBuilder_ == null) {
          strategy_ = null;
        } else {
          strategy_ = null;
          strategyBuilder_ = null;
        }
        evaluator_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.gateway.StrategyToApplyProto.internal_static_StrategyToApply_descriptor;
      }

      @java.lang.Override
      public generated.proto.gateway.StrategyToApplyProto.StrategyToApply getDefaultInstanceForType() {
        return generated.proto.gateway.StrategyToApplyProto.StrategyToApply.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.gateway.StrategyToApplyProto.StrategyToApply build() {
        generated.proto.gateway.StrategyToApplyProto.StrategyToApply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.gateway.StrategyToApplyProto.StrategyToApply buildPartial() {
        generated.proto.gateway.StrategyToApplyProto.StrategyToApply result = new generated.proto.gateway.StrategyToApplyProto.StrategyToApply(this);
        result.trigger_ = trigger_;
        if (strategyBuilder_ == null) {
          result.strategy_ = strategy_;
        } else {
          result.strategy_ = strategyBuilder_.build();
        }
        result.evaluator_ = evaluator_;
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
        if (other instanceof generated.proto.gateway.StrategyToApplyProto.StrategyToApply) {
          return mergeFrom((generated.proto.gateway.StrategyToApplyProto.StrategyToApply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.gateway.StrategyToApplyProto.StrategyToApply other) {
        if (other == generated.proto.gateway.StrategyToApplyProto.StrategyToApply.getDefaultInstance()) return this;
        if (!other.getTrigger().isEmpty()) {
          trigger_ = other.trigger_;
          onChanged();
        }
        if (other.hasStrategy()) {
          mergeStrategy(other.getStrategy());
        }
        if (!other.getEvaluator().isEmpty()) {
          evaluator_ = other.evaluator_;
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
        generated.proto.gateway.StrategyToApplyProto.StrategyToApply parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.gateway.StrategyToApplyProto.StrategyToApply) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object trigger_ = "";
      /**
       * <code>string trigger = 1;</code>
       */
      public java.lang.String getTrigger() {
        java.lang.Object ref = trigger_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          trigger_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string trigger = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTriggerBytes() {
        java.lang.Object ref = trigger_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          trigger_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string trigger = 1;</code>
       */
      public Builder setTrigger(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        trigger_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string trigger = 1;</code>
       */
      public Builder clearTrigger() {
        
        trigger_ = getDefaultInstance().getTrigger();
        onChanged();
        return this;
      }
      /**
       * <code>string trigger = 1;</code>
       */
      public Builder setTriggerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        trigger_ = value;
        onChanged();
        return this;
      }

      private generated.proto.gateway.StrategyProto.Strategy strategy_;
      private com.google.protobuf.SingleFieldBuilderV3<
          generated.proto.gateway.StrategyProto.Strategy, generated.proto.gateway.StrategyProto.Strategy.Builder, generated.proto.gateway.StrategyProto.StrategyOrBuilder> strategyBuilder_;
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public boolean hasStrategy() {
        return strategyBuilder_ != null || strategy_ != null;
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public generated.proto.gateway.StrategyProto.Strategy getStrategy() {
        if (strategyBuilder_ == null) {
          return strategy_ == null ? generated.proto.gateway.StrategyProto.Strategy.getDefaultInstance() : strategy_;
        } else {
          return strategyBuilder_.getMessage();
        }
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public Builder setStrategy(generated.proto.gateway.StrategyProto.Strategy value) {
        if (strategyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          strategy_ = value;
          onChanged();
        } else {
          strategyBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public Builder setStrategy(
          generated.proto.gateway.StrategyProto.Strategy.Builder builderForValue) {
        if (strategyBuilder_ == null) {
          strategy_ = builderForValue.build();
          onChanged();
        } else {
          strategyBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public Builder mergeStrategy(generated.proto.gateway.StrategyProto.Strategy value) {
        if (strategyBuilder_ == null) {
          if (strategy_ != null) {
            strategy_ =
              generated.proto.gateway.StrategyProto.Strategy.newBuilder(strategy_).mergeFrom(value).buildPartial();
          } else {
            strategy_ = value;
          }
          onChanged();
        } else {
          strategyBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public Builder clearStrategy() {
        if (strategyBuilder_ == null) {
          strategy_ = null;
          onChanged();
        } else {
          strategy_ = null;
          strategyBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public generated.proto.gateway.StrategyProto.Strategy.Builder getStrategyBuilder() {
        
        onChanged();
        return getStrategyFieldBuilder().getBuilder();
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      public generated.proto.gateway.StrategyProto.StrategyOrBuilder getStrategyOrBuilder() {
        if (strategyBuilder_ != null) {
          return strategyBuilder_.getMessageOrBuilder();
        } else {
          return strategy_ == null ?
              generated.proto.gateway.StrategyProto.Strategy.getDefaultInstance() : strategy_;
        }
      }
      /**
       * <code>.Strategy strategy = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          generated.proto.gateway.StrategyProto.Strategy, generated.proto.gateway.StrategyProto.Strategy.Builder, generated.proto.gateway.StrategyProto.StrategyOrBuilder> 
          getStrategyFieldBuilder() {
        if (strategyBuilder_ == null) {
          strategyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              generated.proto.gateway.StrategyProto.Strategy, generated.proto.gateway.StrategyProto.Strategy.Builder, generated.proto.gateway.StrategyProto.StrategyOrBuilder>(
                  getStrategy(),
                  getParentForChildren(),
                  isClean());
          strategy_ = null;
        }
        return strategyBuilder_;
      }

      private java.lang.Object evaluator_ = "";
      /**
       * <code>string evaluator = 3;</code>
       */
      public java.lang.String getEvaluator() {
        java.lang.Object ref = evaluator_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          evaluator_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string evaluator = 3;</code>
       */
      public com.google.protobuf.ByteString
          getEvaluatorBytes() {
        java.lang.Object ref = evaluator_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          evaluator_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string evaluator = 3;</code>
       */
      public Builder setEvaluator(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        evaluator_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string evaluator = 3;</code>
       */
      public Builder clearEvaluator() {
        
        evaluator_ = getDefaultInstance().getEvaluator();
        onChanged();
        return this;
      }
      /**
       * <code>string evaluator = 3;</code>
       */
      public Builder setEvaluatorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        evaluator_ = value;
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


      // @@protoc_insertion_point(builder_scope:StrategyToApply)
    }

    // @@protoc_insertion_point(class_scope:StrategyToApply)
    private static final generated.proto.gateway.StrategyToApplyProto.StrategyToApply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.gateway.StrategyToApplyProto.StrategyToApply();
    }

    public static generated.proto.gateway.StrategyToApplyProto.StrategyToApply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StrategyToApply>
        PARSER = new com.google.protobuf.AbstractParser<StrategyToApply>() {
      @java.lang.Override
      public StrategyToApply parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StrategyToApply(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StrategyToApply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StrategyToApply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.gateway.StrategyToApplyProto.StrategyToApply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StrategyToApply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StrategyToApply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025StrategyToApply.proto\032\016Strategy.proto\"" +
      "R\n\017StrategyToApply\022\017\n\007trigger\030\001 \001(\t\022\033\n\010s" +
      "trategy\030\002 \001(\0132\t.Strategy\022\021\n\tevaluator\030\003 " +
      "\001(\tB/\n\027generated.proto.gatewayB\024Strategy" +
      "ToApplyProtob\006proto3"
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
          generated.proto.gateway.StrategyProto.getDescriptor(),
        }, assigner);
    internal_static_StrategyToApply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StrategyToApply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StrategyToApply_descriptor,
        new java.lang.String[] { "Trigger", "Strategy", "Evaluator", });
    generated.proto.gateway.StrategyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
