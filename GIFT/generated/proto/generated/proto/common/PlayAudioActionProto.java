// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayAudioAction.proto

package generated.proto.common;

public final class PlayAudioActionProto {
  private PlayAudioActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayAudioActionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayAudioAction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The MP3 file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue mp3_file = 1;</code>
     */
    boolean hasMp3File();
    /**
     * <pre>
     * The MP3 file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue mp3_file = 1;</code>
     */
    com.google.protobuf.StringValue getMp3File();
    /**
     * <pre>
     * The MP3 file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue mp3_file = 1;</code>
     */
    com.google.protobuf.StringValueOrBuilder getMp3FileOrBuilder();

    /**
     * <pre>
     * The OGG file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue ogg_file = 2;</code>
     */
    boolean hasOggFile();
    /**
     * <pre>
     * The OGG file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue ogg_file = 2;</code>
     */
    com.google.protobuf.StringValue getOggFile();
    /**
     * <pre>
     * The OGG file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue ogg_file = 2;</code>
     */
    com.google.protobuf.StringValueOrBuilder getOggFileOrBuilder();
  }
  /**
   * <pre>
   * This message represents a feedback action to play some audio. 
   * </pre>
   *
   * Protobuf type {@code PlayAudioAction}
   */
  public  static final class PlayAudioAction extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayAudioAction)
      PlayAudioActionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayAudioAction.newBuilder() to construct.
    private PlayAudioAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayAudioAction() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayAudioAction(
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
              if (mp3File_ != null) {
                subBuilder = mp3File_.toBuilder();
              }
              mp3File_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mp3File_);
                mp3File_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              com.google.protobuf.StringValue.Builder subBuilder = null;
              if (oggFile_ != null) {
                subBuilder = oggFile_.toBuilder();
              }
              oggFile_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(oggFile_);
                oggFile_ = subBuilder.buildPartial();
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
      return generated.proto.common.PlayAudioActionProto.internal_static_PlayAudioAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.PlayAudioActionProto.internal_static_PlayAudioAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.PlayAudioActionProto.PlayAudioAction.class, generated.proto.common.PlayAudioActionProto.PlayAudioAction.Builder.class);
    }

    public static final int MP3_FILE_FIELD_NUMBER = 1;
    private com.google.protobuf.StringValue mp3File_;
    /**
     * <pre>
     * The MP3 file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue mp3_file = 1;</code>
     */
    public boolean hasMp3File() {
      return mp3File_ != null;
    }
    /**
     * <pre>
     * The MP3 file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue mp3_file = 1;</code>
     */
    public com.google.protobuf.StringValue getMp3File() {
      return mp3File_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : mp3File_;
    }
    /**
     * <pre>
     * The MP3 file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue mp3_file = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getMp3FileOrBuilder() {
      return getMp3File();
    }

    public static final int OGG_FILE_FIELD_NUMBER = 2;
    private com.google.protobuf.StringValue oggFile_;
    /**
     * <pre>
     * The OGG file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue ogg_file = 2;</code>
     */
    public boolean hasOggFile() {
      return oggFile_ != null;
    }
    /**
     * <pre>
     * The OGG file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue ogg_file = 2;</code>
     */
    public com.google.protobuf.StringValue getOggFile() {
      return oggFile_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : oggFile_;
    }
    /**
     * <pre>
     * The OGG file to play for feedback. 
     * </pre>
     *
     * <code>.google.protobuf.StringValue ogg_file = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getOggFileOrBuilder() {
      return getOggFile();
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
      if (mp3File_ != null) {
        output.writeMessage(1, getMp3File());
      }
      if (oggFile_ != null) {
        output.writeMessage(2, getOggFile());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mp3File_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMp3File());
      }
      if (oggFile_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getOggFile());
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
      if (!(obj instanceof generated.proto.common.PlayAudioActionProto.PlayAudioAction)) {
        return super.equals(obj);
      }
      generated.proto.common.PlayAudioActionProto.PlayAudioAction other = (generated.proto.common.PlayAudioActionProto.PlayAudioAction) obj;

      if (hasMp3File() != other.hasMp3File()) return false;
      if (hasMp3File()) {
        if (!getMp3File()
            .equals(other.getMp3File())) return false;
      }
      if (hasOggFile() != other.hasOggFile()) return false;
      if (hasOggFile()) {
        if (!getOggFile()
            .equals(other.getOggFile())) return false;
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
      if (hasMp3File()) {
        hash = (37 * hash) + MP3_FILE_FIELD_NUMBER;
        hash = (53 * hash) + getMp3File().hashCode();
      }
      if (hasOggFile()) {
        hash = (37 * hash) + OGG_FILE_FIELD_NUMBER;
        hash = (53 * hash) + getOggFile().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction parseFrom(
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
    public static Builder newBuilder(generated.proto.common.PlayAudioActionProto.PlayAudioAction prototype) {
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
     * This message represents a feedback action to play some audio. 
     * </pre>
     *
     * Protobuf type {@code PlayAudioAction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayAudioAction)
        generated.proto.common.PlayAudioActionProto.PlayAudioActionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.PlayAudioActionProto.internal_static_PlayAudioAction_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.PlayAudioActionProto.internal_static_PlayAudioAction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.PlayAudioActionProto.PlayAudioAction.class, generated.proto.common.PlayAudioActionProto.PlayAudioAction.Builder.class);
      }

      // Construct using generated.proto.common.PlayAudioActionProto.PlayAudioAction.newBuilder()
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
        if (mp3FileBuilder_ == null) {
          mp3File_ = null;
        } else {
          mp3File_ = null;
          mp3FileBuilder_ = null;
        }
        if (oggFileBuilder_ == null) {
          oggFile_ = null;
        } else {
          oggFile_ = null;
          oggFileBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.PlayAudioActionProto.internal_static_PlayAudioAction_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.PlayAudioActionProto.PlayAudioAction getDefaultInstanceForType() {
        return generated.proto.common.PlayAudioActionProto.PlayAudioAction.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.PlayAudioActionProto.PlayAudioAction build() {
        generated.proto.common.PlayAudioActionProto.PlayAudioAction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.PlayAudioActionProto.PlayAudioAction buildPartial() {
        generated.proto.common.PlayAudioActionProto.PlayAudioAction result = new generated.proto.common.PlayAudioActionProto.PlayAudioAction(this);
        if (mp3FileBuilder_ == null) {
          result.mp3File_ = mp3File_;
        } else {
          result.mp3File_ = mp3FileBuilder_.build();
        }
        if (oggFileBuilder_ == null) {
          result.oggFile_ = oggFile_;
        } else {
          result.oggFile_ = oggFileBuilder_.build();
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
        if (other instanceof generated.proto.common.PlayAudioActionProto.PlayAudioAction) {
          return mergeFrom((generated.proto.common.PlayAudioActionProto.PlayAudioAction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.PlayAudioActionProto.PlayAudioAction other) {
        if (other == generated.proto.common.PlayAudioActionProto.PlayAudioAction.getDefaultInstance()) return this;
        if (other.hasMp3File()) {
          mergeMp3File(other.getMp3File());
        }
        if (other.hasOggFile()) {
          mergeOggFile(other.getOggFile());
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
        generated.proto.common.PlayAudioActionProto.PlayAudioAction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.PlayAudioActionProto.PlayAudioAction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.StringValue mp3File_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> mp3FileBuilder_;
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public boolean hasMp3File() {
        return mp3FileBuilder_ != null || mp3File_ != null;
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public com.google.protobuf.StringValue getMp3File() {
        if (mp3FileBuilder_ == null) {
          return mp3File_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : mp3File_;
        } else {
          return mp3FileBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public Builder setMp3File(com.google.protobuf.StringValue value) {
        if (mp3FileBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mp3File_ = value;
          onChanged();
        } else {
          mp3FileBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public Builder setMp3File(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (mp3FileBuilder_ == null) {
          mp3File_ = builderForValue.build();
          onChanged();
        } else {
          mp3FileBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public Builder mergeMp3File(com.google.protobuf.StringValue value) {
        if (mp3FileBuilder_ == null) {
          if (mp3File_ != null) {
            mp3File_ =
              com.google.protobuf.StringValue.newBuilder(mp3File_).mergeFrom(value).buildPartial();
          } else {
            mp3File_ = value;
          }
          onChanged();
        } else {
          mp3FileBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public Builder clearMp3File() {
        if (mp3FileBuilder_ == null) {
          mp3File_ = null;
          onChanged();
        } else {
          mp3File_ = null;
          mp3FileBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public com.google.protobuf.StringValue.Builder getMp3FileBuilder() {
        
        onChanged();
        return getMp3FileFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getMp3FileOrBuilder() {
        if (mp3FileBuilder_ != null) {
          return mp3FileBuilder_.getMessageOrBuilder();
        } else {
          return mp3File_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : mp3File_;
        }
      }
      /**
       * <pre>
       * The MP3 file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue mp3_file = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getMp3FileFieldBuilder() {
        if (mp3FileBuilder_ == null) {
          mp3FileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getMp3File(),
                  getParentForChildren(),
                  isClean());
          mp3File_ = null;
        }
        return mp3FileBuilder_;
      }

      private com.google.protobuf.StringValue oggFile_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> oggFileBuilder_;
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public boolean hasOggFile() {
        return oggFileBuilder_ != null || oggFile_ != null;
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public com.google.protobuf.StringValue getOggFile() {
        if (oggFileBuilder_ == null) {
          return oggFile_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : oggFile_;
        } else {
          return oggFileBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public Builder setOggFile(com.google.protobuf.StringValue value) {
        if (oggFileBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oggFile_ = value;
          onChanged();
        } else {
          oggFileBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public Builder setOggFile(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (oggFileBuilder_ == null) {
          oggFile_ = builderForValue.build();
          onChanged();
        } else {
          oggFileBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public Builder mergeOggFile(com.google.protobuf.StringValue value) {
        if (oggFileBuilder_ == null) {
          if (oggFile_ != null) {
            oggFile_ =
              com.google.protobuf.StringValue.newBuilder(oggFile_).mergeFrom(value).buildPartial();
          } else {
            oggFile_ = value;
          }
          onChanged();
        } else {
          oggFileBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public Builder clearOggFile() {
        if (oggFileBuilder_ == null) {
          oggFile_ = null;
          onChanged();
        } else {
          oggFile_ = null;
          oggFileBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public com.google.protobuf.StringValue.Builder getOggFileBuilder() {
        
        onChanged();
        return getOggFileFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getOggFileOrBuilder() {
        if (oggFileBuilder_ != null) {
          return oggFileBuilder_.getMessageOrBuilder();
        } else {
          return oggFile_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : oggFile_;
        }
      }
      /**
       * <pre>
       * The OGG file to play for feedback. 
       * </pre>
       *
       * <code>.google.protobuf.StringValue ogg_file = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getOggFileFieldBuilder() {
        if (oggFileBuilder_ == null) {
          oggFileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getOggFile(),
                  getParentForChildren(),
                  isClean());
          oggFile_ = null;
        }
        return oggFileBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayAudioAction)
    }

    // @@protoc_insertion_point(class_scope:PlayAudioAction)
    private static final generated.proto.common.PlayAudioActionProto.PlayAudioAction DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.PlayAudioActionProto.PlayAudioAction();
    }

    public static generated.proto.common.PlayAudioActionProto.PlayAudioAction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayAudioAction>
        PARSER = new com.google.protobuf.AbstractParser<PlayAudioAction>() {
      @java.lang.Override
      public PlayAudioAction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayAudioAction(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayAudioAction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayAudioAction> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.PlayAudioActionProto.PlayAudioAction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayAudioAction_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayAudioAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PlayAudioAction.proto\032\036google/protobuf" +
      "/wrappers.proto\"q\n\017PlayAudioAction\022.\n\010mp" +
      "3_file\030\001 \001(\0132\034.google.protobuf.StringVal" +
      "ue\022.\n\010ogg_file\030\002 \001(\0132\034.google.protobuf.S" +
      "tringValueB.\n\026generated.proto.commonB\024Pl" +
      "ayAudioActionProtob\006proto3"
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
    internal_static_PlayAudioAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayAudioAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayAudioAction_descriptor,
        new java.lang.String[] { "Mp3File", "OggFile", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}