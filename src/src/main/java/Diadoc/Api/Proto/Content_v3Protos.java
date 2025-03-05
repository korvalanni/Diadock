// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Content_v3.proto

package Diadoc.Api.Proto;

public final class Content_v3Protos {
  private Content_v3Protos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Content_v3OrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Content_v3)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes Content = 1;</code>
     */
    boolean hasContent();
    /**
     * <code>optional bytes Content = 1;</code>
     */
    com.google.protobuf.ByteString getContent();

    /**
     * <code>optional string NameOnShelf = 2;</code>
     */
    boolean hasNameOnShelf();
    /**
     * <code>optional string NameOnShelf = 2;</code>
     */
    java.lang.String getNameOnShelf();
    /**
     * <code>optional string NameOnShelf = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameOnShelfBytes();

    /**
     * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
     */
    boolean hasEntityId();
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
     */
    Diadoc.Api.Proto.DocumentIdProtos.DocumentId getEntityId();
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
     */
    Diadoc.Api.Proto.DocumentIdProtos.DocumentIdOrBuilder getEntityIdOrBuilder();

    /**
     * <code>optional string PatchedContentId = 4;</code>
     */
    boolean hasPatchedContentId();
    /**
     * <code>optional string PatchedContentId = 4;</code>
     */
    java.lang.String getPatchedContentId();
    /**
     * <code>optional string PatchedContentId = 4;</code>
     */
    com.google.protobuf.ByteString
        getPatchedContentIdBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Content_v3}
   */
  public static final class Content_v3 extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Content_v3)
      Content_v3OrBuilder {
    // Use Content_v3.newBuilder() to construct.
    private Content_v3(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Content_v3(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Content_v3 defaultInstance;
    public static Content_v3 getDefaultInstance() {
      return defaultInstance;
    }

    public Content_v3 getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Content_v3(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              content_ = input.readBytes();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              nameOnShelf_ = bs;
              break;
            }
            case 26: {
              Diadoc.Api.Proto.DocumentIdProtos.DocumentId.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = entityId_.toBuilder();
              }
              entityId_ = input.readMessage(Diadoc.Api.Proto.DocumentIdProtos.DocumentId.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entityId_);
                entityId_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              patchedContentId_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Content_v3Protos.internal_static_Diadoc_Api_Proto_Content_v3_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Content_v3Protos.internal_static_Diadoc_Api_Proto_Content_v3_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Content_v3Protos.Content_v3.class, Diadoc.Api.Proto.Content_v3Protos.Content_v3.Builder.class);
    }

    public static com.google.protobuf.Parser<Content_v3> PARSER =
        new com.google.protobuf.AbstractParser<Content_v3>() {
      public Content_v3 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Content_v3(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Content_v3> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString content_;
    /**
     * <code>optional bytes Content = 1;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes Content = 1;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    public static final int NAMEONSHELF_FIELD_NUMBER = 2;
    private java.lang.Object nameOnShelf_;
    /**
     * <code>optional string NameOnShelf = 2;</code>
     */
    public boolean hasNameOnShelf() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string NameOnShelf = 2;</code>
     */
    public java.lang.String getNameOnShelf() {
      java.lang.Object ref = nameOnShelf_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nameOnShelf_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string NameOnShelf = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameOnShelfBytes() {
      java.lang.Object ref = nameOnShelf_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nameOnShelf_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ENTITYID_FIELD_NUMBER = 3;
    private Diadoc.Api.Proto.DocumentIdProtos.DocumentId entityId_;
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
     */
    public boolean hasEntityId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
     */
    public Diadoc.Api.Proto.DocumentIdProtos.DocumentId getEntityId() {
      return entityId_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
     */
    public Diadoc.Api.Proto.DocumentIdProtos.DocumentIdOrBuilder getEntityIdOrBuilder() {
      return entityId_;
    }

    public static final int PATCHEDCONTENTID_FIELD_NUMBER = 4;
    private java.lang.Object patchedContentId_;
    /**
     * <code>optional string PatchedContentId = 4;</code>
     */
    public boolean hasPatchedContentId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string PatchedContentId = 4;</code>
     */
    public java.lang.String getPatchedContentId() {
      java.lang.Object ref = patchedContentId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          patchedContentId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string PatchedContentId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPatchedContentIdBytes() {
      java.lang.Object ref = patchedContentId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patchedContentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      content_ = com.google.protobuf.ByteString.EMPTY;
      nameOnShelf_ = "";
      entityId_ = Diadoc.Api.Proto.DocumentIdProtos.DocumentId.getDefaultInstance();
      patchedContentId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasEntityId()) {
        if (!getEntityId().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, content_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameOnShelfBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, entityId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getPatchedContentIdBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, content_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameOnShelfBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, entityId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getPatchedContentIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Content_v3Protos.Content_v3 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Content_v3Protos.Content_v3 prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Diadoc.Api.Proto.Content_v3}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Content_v3)
        Diadoc.Api.Proto.Content_v3Protos.Content_v3OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Content_v3Protos.internal_static_Diadoc_Api_Proto_Content_v3_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Content_v3Protos.internal_static_Diadoc_Api_Proto_Content_v3_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Content_v3Protos.Content_v3.class, Diadoc.Api.Proto.Content_v3Protos.Content_v3.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Content_v3Protos.Content_v3.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getEntityIdFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        content_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        nameOnShelf_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (entityIdBuilder_ == null) {
          entityId_ = Diadoc.Api.Proto.DocumentIdProtos.DocumentId.getDefaultInstance();
        } else {
          entityIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        patchedContentId_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Content_v3Protos.internal_static_Diadoc_Api_Proto_Content_v3_descriptor;
      }

      public Diadoc.Api.Proto.Content_v3Protos.Content_v3 getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Content_v3Protos.Content_v3.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Content_v3Protos.Content_v3 build() {
        Diadoc.Api.Proto.Content_v3Protos.Content_v3 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Content_v3Protos.Content_v3 buildPartial() {
        Diadoc.Api.Proto.Content_v3Protos.Content_v3 result = new Diadoc.Api.Proto.Content_v3Protos.Content_v3(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.content_ = content_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.nameOnShelf_ = nameOnShelf_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (entityIdBuilder_ == null) {
          result.entityId_ = entityId_;
        } else {
          result.entityId_ = entityIdBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.patchedContentId_ = patchedContentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Content_v3Protos.Content_v3) {
          return mergeFrom((Diadoc.Api.Proto.Content_v3Protos.Content_v3)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Content_v3Protos.Content_v3 other) {
        if (other == Diadoc.Api.Proto.Content_v3Protos.Content_v3.getDefaultInstance()) return this;
        if (other.hasContent()) {
          setContent(other.getContent());
        }
        if (other.hasNameOnShelf()) {
          bitField0_ |= 0x00000002;
          nameOnShelf_ = other.nameOnShelf_;
          onChanged();
        }
        if (other.hasEntityId()) {
          mergeEntityId(other.getEntityId());
        }
        if (other.hasPatchedContentId()) {
          bitField0_ |= 0x00000008;
          patchedContentId_ = other.patchedContentId_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasEntityId()) {
          if (!getEntityId().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Content_v3Protos.Content_v3 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Content_v3Protos.Content_v3) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes Content = 1;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes Content = 1;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <code>optional bytes Content = 1;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes Content = 1;</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }

      private java.lang.Object nameOnShelf_ = "";
      /**
       * <code>optional string NameOnShelf = 2;</code>
       */
      public boolean hasNameOnShelf() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       */
      public java.lang.String getNameOnShelf() {
        java.lang.Object ref = nameOnShelf_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nameOnShelf_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameOnShelfBytes() {
        java.lang.Object ref = nameOnShelf_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nameOnShelf_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       */
      public Builder setNameOnShelf(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        nameOnShelf_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       */
      public Builder clearNameOnShelf() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nameOnShelf_ = getDefaultInstance().getNameOnShelf();
        onChanged();
        return this;
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       */
      public Builder setNameOnShelfBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        nameOnShelf_ = value;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.DocumentIdProtos.DocumentId entityId_ = Diadoc.Api.Proto.DocumentIdProtos.DocumentId.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.DocumentIdProtos.DocumentId, Diadoc.Api.Proto.DocumentIdProtos.DocumentId.Builder, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdOrBuilder> entityIdBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public boolean hasEntityId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public Diadoc.Api.Proto.DocumentIdProtos.DocumentId getEntityId() {
        if (entityIdBuilder_ == null) {
          return entityId_;
        } else {
          return entityIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public Builder setEntityId(Diadoc.Api.Proto.DocumentIdProtos.DocumentId value) {
        if (entityIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entityId_ = value;
          onChanged();
        } else {
          entityIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public Builder setEntityId(
          Diadoc.Api.Proto.DocumentIdProtos.DocumentId.Builder builderForValue) {
        if (entityIdBuilder_ == null) {
          entityId_ = builderForValue.build();
          onChanged();
        } else {
          entityIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public Builder mergeEntityId(Diadoc.Api.Proto.DocumentIdProtos.DocumentId value) {
        if (entityIdBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              entityId_ != Diadoc.Api.Proto.DocumentIdProtos.DocumentId.getDefaultInstance()) {
            entityId_ =
              Diadoc.Api.Proto.DocumentIdProtos.DocumentId.newBuilder(entityId_).mergeFrom(value).buildPartial();
          } else {
            entityId_ = value;
          }
          onChanged();
        } else {
          entityIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public Builder clearEntityId() {
        if (entityIdBuilder_ == null) {
          entityId_ = Diadoc.Api.Proto.DocumentIdProtos.DocumentId.getDefaultInstance();
          onChanged();
        } else {
          entityIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public Diadoc.Api.Proto.DocumentIdProtos.DocumentId.Builder getEntityIdBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getEntityIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      public Diadoc.Api.Proto.DocumentIdProtos.DocumentIdOrBuilder getEntityIdOrBuilder() {
        if (entityIdBuilder_ != null) {
          return entityIdBuilder_.getMessageOrBuilder();
        } else {
          return entityId_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentId EntityId = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.DocumentIdProtos.DocumentId, Diadoc.Api.Proto.DocumentIdProtos.DocumentId.Builder, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdOrBuilder> 
          getEntityIdFieldBuilder() {
        if (entityIdBuilder_ == null) {
          entityIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.DocumentIdProtos.DocumentId, Diadoc.Api.Proto.DocumentIdProtos.DocumentId.Builder, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdOrBuilder>(
                  getEntityId(),
                  getParentForChildren(),
                  isClean());
          entityId_ = null;
        }
        return entityIdBuilder_;
      }

      private java.lang.Object patchedContentId_ = "";
      /**
       * <code>optional string PatchedContentId = 4;</code>
       */
      public boolean hasPatchedContentId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string PatchedContentId = 4;</code>
       */
      public java.lang.String getPatchedContentId() {
        java.lang.Object ref = patchedContentId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            patchedContentId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string PatchedContentId = 4;</code>
       */
      public com.google.protobuf.ByteString
          getPatchedContentIdBytes() {
        java.lang.Object ref = patchedContentId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          patchedContentId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string PatchedContentId = 4;</code>
       */
      public Builder setPatchedContentId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        patchedContentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string PatchedContentId = 4;</code>
       */
      public Builder clearPatchedContentId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        patchedContentId_ = getDefaultInstance().getPatchedContentId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string PatchedContentId = 4;</code>
       */
      public Builder setPatchedContentIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        patchedContentId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Content_v3)
    }

    static {
      defaultInstance = new Content_v3(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Content_v3)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Content_v3_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Content_v3_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Content_v3.proto\022\020Diadoc.Api.Proto\032\020Do" +
      "cumentId.proto\"|\n\nContent_v3\022\017\n\007Content\030" +
      "\001 \001(\014\022\023\n\013NameOnShelf\030\002 \001(\t\022.\n\010EntityId\030\003" +
      " \001(\0132\034.Diadoc.Api.Proto.DocumentId\022\030\n\020Pa" +
      "tchedContentId\030\004 \001(\tB\022B\020Content_v3Protos"
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
          Diadoc.Api.Proto.DocumentIdProtos.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_Content_v3_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Content_v3_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Content_v3_descriptor,
        new java.lang.String[] { "Content", "NameOnShelf", "EntityId", "PatchedContentId", });
    Diadoc.Api.Proto.DocumentIdProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
