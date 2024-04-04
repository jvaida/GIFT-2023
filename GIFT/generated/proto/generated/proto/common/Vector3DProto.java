// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Vector3D.proto

package generated.proto.common;

public final class Vector3DProto {
  private Vector3DProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Vector3DOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Vector3D)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Coordinate point at 'x'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue x = 1;</code>
     */
    boolean hasX();
    /**
     * <pre>
     * Coordinate point at 'x'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue x = 1;</code>
     */
    com.google.protobuf.DoubleValue getX();
    /**
     * <pre>
     * Coordinate point at 'x'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue x = 1;</code>
     */
    com.google.protobuf.DoubleValueOrBuilder getXOrBuilder();

    /**
     * <pre>
     * Coordinate point at 'y'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue y = 2;</code>
     */
    boolean hasY();
    /**
     * <pre>
     * Coordinate point at 'y'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue y = 2;</code>
     */
    com.google.protobuf.DoubleValue getY();
    /**
     * <pre>
     * Coordinate point at 'y'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue y = 2;</code>
     */
    com.google.protobuf.DoubleValueOrBuilder getYOrBuilder();

    /**
     * <pre>
     * Coordinate point at 'z'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue z = 3;</code>
     */
    boolean hasZ();
    /**
     * <pre>
     * Coordinate point at 'z'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue z = 3;</code>
     */
    com.google.protobuf.DoubleValue getZ();
    /**
     * <pre>
     * Coordinate point at 'z'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue z = 3;</code>
     */
    com.google.protobuf.DoubleValueOrBuilder getZOrBuilder();
  }
  /**
   * <pre>
   * This message represents a Vector 3D point. 
   * </pre>
   *
   * Protobuf type {@code Vector3D}
   */
  public  static final class Vector3D extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Vector3D)
      Vector3DOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Vector3D.newBuilder() to construct.
    private Vector3D(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Vector3D() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Vector3D(
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
              com.google.protobuf.DoubleValue.Builder subBuilder = null;
              if (x_ != null) {
                subBuilder = x_.toBuilder();
              }
              x_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(x_);
                x_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              com.google.protobuf.DoubleValue.Builder subBuilder = null;
              if (y_ != null) {
                subBuilder = y_.toBuilder();
              }
              y_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(y_);
                y_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              com.google.protobuf.DoubleValue.Builder subBuilder = null;
              if (z_ != null) {
                subBuilder = z_.toBuilder();
              }
              z_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(z_);
                z_ = subBuilder.buildPartial();
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
      return generated.proto.common.Vector3DProto.internal_static_Vector3D_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.Vector3DProto.internal_static_Vector3D_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.Vector3DProto.Vector3D.class, generated.proto.common.Vector3DProto.Vector3D.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private com.google.protobuf.DoubleValue x_;
    /**
     * <pre>
     * Coordinate point at 'x'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue x = 1;</code>
     */
    public boolean hasX() {
      return x_ != null;
    }
    /**
     * <pre>
     * Coordinate point at 'x'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue x = 1;</code>
     */
    public com.google.protobuf.DoubleValue getX() {
      return x_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : x_;
    }
    /**
     * <pre>
     * Coordinate point at 'x'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue x = 1;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getXOrBuilder() {
      return getX();
    }

    public static final int Y_FIELD_NUMBER = 2;
    private com.google.protobuf.DoubleValue y_;
    /**
     * <pre>
     * Coordinate point at 'y'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue y = 2;</code>
     */
    public boolean hasY() {
      return y_ != null;
    }
    /**
     * <pre>
     * Coordinate point at 'y'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue y = 2;</code>
     */
    public com.google.protobuf.DoubleValue getY() {
      return y_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : y_;
    }
    /**
     * <pre>
     * Coordinate point at 'y'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue y = 2;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getYOrBuilder() {
      return getY();
    }

    public static final int Z_FIELD_NUMBER = 3;
    private com.google.protobuf.DoubleValue z_;
    /**
     * <pre>
     * Coordinate point at 'z'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue z = 3;</code>
     */
    public boolean hasZ() {
      return z_ != null;
    }
    /**
     * <pre>
     * Coordinate point at 'z'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue z = 3;</code>
     */
    public com.google.protobuf.DoubleValue getZ() {
      return z_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : z_;
    }
    /**
     * <pre>
     * Coordinate point at 'z'. 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue z = 3;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getZOrBuilder() {
      return getZ();
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
      if (x_ != null) {
        output.writeMessage(1, getX());
      }
      if (y_ != null) {
        output.writeMessage(2, getY());
      }
      if (z_ != null) {
        output.writeMessage(3, getZ());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (x_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getX());
      }
      if (y_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getY());
      }
      if (z_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getZ());
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
      if (!(obj instanceof generated.proto.common.Vector3DProto.Vector3D)) {
        return super.equals(obj);
      }
      generated.proto.common.Vector3DProto.Vector3D other = (generated.proto.common.Vector3DProto.Vector3D) obj;

      if (hasX() != other.hasX()) return false;
      if (hasX()) {
        if (!getX()
            .equals(other.getX())) return false;
      }
      if (hasY() != other.hasY()) return false;
      if (hasY()) {
        if (!getY()
            .equals(other.getY())) return false;
      }
      if (hasZ() != other.hasZ()) return false;
      if (hasZ()) {
        if (!getZ()
            .equals(other.getZ())) return false;
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
      if (hasX()) {
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX().hashCode();
      }
      if (hasY()) {
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY().hashCode();
      }
      if (hasZ()) {
        hash = (37 * hash) + Z_FIELD_NUMBER;
        hash = (53 * hash) + getZ().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.Vector3DProto.Vector3D parseFrom(
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
    public static Builder newBuilder(generated.proto.common.Vector3DProto.Vector3D prototype) {
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
     * This message represents a Vector 3D point. 
     * </pre>
     *
     * Protobuf type {@code Vector3D}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Vector3D)
        generated.proto.common.Vector3DProto.Vector3DOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.Vector3DProto.internal_static_Vector3D_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.Vector3DProto.internal_static_Vector3D_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.Vector3DProto.Vector3D.class, generated.proto.common.Vector3DProto.Vector3D.Builder.class);
      }

      // Construct using generated.proto.common.Vector3DProto.Vector3D.newBuilder()
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
        if (xBuilder_ == null) {
          x_ = null;
        } else {
          x_ = null;
          xBuilder_ = null;
        }
        if (yBuilder_ == null) {
          y_ = null;
        } else {
          y_ = null;
          yBuilder_ = null;
        }
        if (zBuilder_ == null) {
          z_ = null;
        } else {
          z_ = null;
          zBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.Vector3DProto.internal_static_Vector3D_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.Vector3DProto.Vector3D getDefaultInstanceForType() {
        return generated.proto.common.Vector3DProto.Vector3D.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.Vector3DProto.Vector3D build() {
        generated.proto.common.Vector3DProto.Vector3D result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.Vector3DProto.Vector3D buildPartial() {
        generated.proto.common.Vector3DProto.Vector3D result = new generated.proto.common.Vector3DProto.Vector3D(this);
        if (xBuilder_ == null) {
          result.x_ = x_;
        } else {
          result.x_ = xBuilder_.build();
        }
        if (yBuilder_ == null) {
          result.y_ = y_;
        } else {
          result.y_ = yBuilder_.build();
        }
        if (zBuilder_ == null) {
          result.z_ = z_;
        } else {
          result.z_ = zBuilder_.build();
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
        if (other instanceof generated.proto.common.Vector3DProto.Vector3D) {
          return mergeFrom((generated.proto.common.Vector3DProto.Vector3D)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.Vector3DProto.Vector3D other) {
        if (other == generated.proto.common.Vector3DProto.Vector3D.getDefaultInstance()) return this;
        if (other.hasX()) {
          mergeX(other.getX());
        }
        if (other.hasY()) {
          mergeY(other.getY());
        }
        if (other.hasZ()) {
          mergeZ(other.getZ());
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
        generated.proto.common.Vector3DProto.Vector3D parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.Vector3DProto.Vector3D) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.DoubleValue x_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> xBuilder_;
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public boolean hasX() {
        return xBuilder_ != null || x_ != null;
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public com.google.protobuf.DoubleValue getX() {
        if (xBuilder_ == null) {
          return x_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : x_;
        } else {
          return xBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public Builder setX(com.google.protobuf.DoubleValue value) {
        if (xBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          x_ = value;
          onChanged();
        } else {
          xBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public Builder setX(
          com.google.protobuf.DoubleValue.Builder builderForValue) {
        if (xBuilder_ == null) {
          x_ = builderForValue.build();
          onChanged();
        } else {
          xBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public Builder mergeX(com.google.protobuf.DoubleValue value) {
        if (xBuilder_ == null) {
          if (x_ != null) {
            x_ =
              com.google.protobuf.DoubleValue.newBuilder(x_).mergeFrom(value).buildPartial();
          } else {
            x_ = value;
          }
          onChanged();
        } else {
          xBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public Builder clearX() {
        if (xBuilder_ == null) {
          x_ = null;
          onChanged();
        } else {
          x_ = null;
          xBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public com.google.protobuf.DoubleValue.Builder getXBuilder() {
        
        onChanged();
        return getXFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      public com.google.protobuf.DoubleValueOrBuilder getXOrBuilder() {
        if (xBuilder_ != null) {
          return xBuilder_.getMessageOrBuilder();
        } else {
          return x_ == null ?
              com.google.protobuf.DoubleValue.getDefaultInstance() : x_;
        }
      }
      /**
       * <pre>
       * Coordinate point at 'x'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue x = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
          getXFieldBuilder() {
        if (xBuilder_ == null) {
          xBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                  getX(),
                  getParentForChildren(),
                  isClean());
          x_ = null;
        }
        return xBuilder_;
      }

      private com.google.protobuf.DoubleValue y_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> yBuilder_;
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public boolean hasY() {
        return yBuilder_ != null || y_ != null;
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public com.google.protobuf.DoubleValue getY() {
        if (yBuilder_ == null) {
          return y_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : y_;
        } else {
          return yBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public Builder setY(com.google.protobuf.DoubleValue value) {
        if (yBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          y_ = value;
          onChanged();
        } else {
          yBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public Builder setY(
          com.google.protobuf.DoubleValue.Builder builderForValue) {
        if (yBuilder_ == null) {
          y_ = builderForValue.build();
          onChanged();
        } else {
          yBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public Builder mergeY(com.google.protobuf.DoubleValue value) {
        if (yBuilder_ == null) {
          if (y_ != null) {
            y_ =
              com.google.protobuf.DoubleValue.newBuilder(y_).mergeFrom(value).buildPartial();
          } else {
            y_ = value;
          }
          onChanged();
        } else {
          yBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public Builder clearY() {
        if (yBuilder_ == null) {
          y_ = null;
          onChanged();
        } else {
          y_ = null;
          yBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public com.google.protobuf.DoubleValue.Builder getYBuilder() {
        
        onChanged();
        return getYFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      public com.google.protobuf.DoubleValueOrBuilder getYOrBuilder() {
        if (yBuilder_ != null) {
          return yBuilder_.getMessageOrBuilder();
        } else {
          return y_ == null ?
              com.google.protobuf.DoubleValue.getDefaultInstance() : y_;
        }
      }
      /**
       * <pre>
       * Coordinate point at 'y'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue y = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
          getYFieldBuilder() {
        if (yBuilder_ == null) {
          yBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                  getY(),
                  getParentForChildren(),
                  isClean());
          y_ = null;
        }
        return yBuilder_;
      }

      private com.google.protobuf.DoubleValue z_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> zBuilder_;
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public boolean hasZ() {
        return zBuilder_ != null || z_ != null;
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public com.google.protobuf.DoubleValue getZ() {
        if (zBuilder_ == null) {
          return z_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : z_;
        } else {
          return zBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public Builder setZ(com.google.protobuf.DoubleValue value) {
        if (zBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          z_ = value;
          onChanged();
        } else {
          zBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public Builder setZ(
          com.google.protobuf.DoubleValue.Builder builderForValue) {
        if (zBuilder_ == null) {
          z_ = builderForValue.build();
          onChanged();
        } else {
          zBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public Builder mergeZ(com.google.protobuf.DoubleValue value) {
        if (zBuilder_ == null) {
          if (z_ != null) {
            z_ =
              com.google.protobuf.DoubleValue.newBuilder(z_).mergeFrom(value).buildPartial();
          } else {
            z_ = value;
          }
          onChanged();
        } else {
          zBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public Builder clearZ() {
        if (zBuilder_ == null) {
          z_ = null;
          onChanged();
        } else {
          z_ = null;
          zBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public com.google.protobuf.DoubleValue.Builder getZBuilder() {
        
        onChanged();
        return getZFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      public com.google.protobuf.DoubleValueOrBuilder getZOrBuilder() {
        if (zBuilder_ != null) {
          return zBuilder_.getMessageOrBuilder();
        } else {
          return z_ == null ?
              com.google.protobuf.DoubleValue.getDefaultInstance() : z_;
        }
      }
      /**
       * <pre>
       * Coordinate point at 'z'. 
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue z = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
          getZFieldBuilder() {
        if (zBuilder_ == null) {
          zBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                  getZ(),
                  getParentForChildren(),
                  isClean());
          z_ = null;
        }
        return zBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Vector3D)
    }

    // @@protoc_insertion_point(class_scope:Vector3D)
    private static final generated.proto.common.Vector3DProto.Vector3D DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.Vector3DProto.Vector3D();
    }

    public static generated.proto.common.Vector3DProto.Vector3D getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Vector3D>
        PARSER = new com.google.protobuf.AbstractParser<Vector3D>() {
      @java.lang.Override
      public Vector3D parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Vector3D(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Vector3D> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Vector3D> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.Vector3DProto.Vector3D getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vector3D_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vector3D_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Vector3D.proto\032\036google/protobuf/wrappe" +
      "rs.proto\"\205\001\n\010Vector3D\022\'\n\001x\030\001 \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\022\'\n\001y\030\002 \001(\0132\034.goog" +
      "le.protobuf.DoubleValue\022\'\n\001z\030\003 \001(\0132\034.goo" +
      "gle.protobuf.DoubleValueB\'\n\026generated.pr" +
      "oto.commonB\rVector3DProtob\006proto3"
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
    internal_static_Vector3D_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Vector3D_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vector3D_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}