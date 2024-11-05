// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Docflow/ReceiptDocflow.proto

package Diadoc.Api.Proto.Docflow;

public final class ReceiptDocflowProtos {
  private ReceiptDocflowProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReceiptDocflowOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Docflow.ReceiptDocflow)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool IsFinished = 1;</code>
     */
    boolean hasIsFinished();
    /**
     * <code>optional bool IsFinished = 1;</code>
     */
    boolean getIsFinished();

    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
     */
    boolean hasReceiptAttachment();
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
     */
    Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment getReceiptAttachment();
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
     */
    Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder getReceiptAttachmentOrBuilder();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Docflow.ReceiptDocflow}
   */
  public static final class ReceiptDocflow extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Docflow.ReceiptDocflow)
      ReceiptDocflowOrBuilder {
    // Use ReceiptDocflow.newBuilder() to construct.
    private ReceiptDocflow(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReceiptDocflow(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReceiptDocflow defaultInstance;
    public static ReceiptDocflow getDefaultInstance() {
      return defaultInstance;
    }

    public ReceiptDocflow getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReceiptDocflow(
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
            case 8: {
              bitField0_ |= 0x00000001;
              isFinished_ = input.readBool();
              break;
            }
            case 18: {
              Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = receiptAttachment_.toBuilder();
              }
              receiptAttachment_ = input.readMessage(Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(receiptAttachment_);
                receiptAttachment_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow.class, Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow.Builder.class);
    }

    public static com.google.protobuf.Parser<ReceiptDocflow> PARSER =
        new com.google.protobuf.AbstractParser<ReceiptDocflow>() {
      public ReceiptDocflow parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReceiptDocflow(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReceiptDocflow> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ISFINISHED_FIELD_NUMBER = 1;
    private boolean isFinished_;
    /**
     * <code>optional bool IsFinished = 1;</code>
     */
    public boolean hasIsFinished() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool IsFinished = 1;</code>
     */
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int RECEIPTATTACHMENT_FIELD_NUMBER = 2;
    private Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment receiptAttachment_;
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
     */
    public boolean hasReceiptAttachment() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
     */
    public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment getReceiptAttachment() {
      return receiptAttachment_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
     */
    public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder getReceiptAttachmentOrBuilder() {
      return receiptAttachment_;
    }

    private void initFields() {
      isFinished_ = false;
      receiptAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasReceiptAttachment()) {
        if (!getReceiptAttachment().isInitialized()) {
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
        output.writeBool(1, isFinished_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, receiptAttachment_);
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
          .computeBoolSize(1, isFinished_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, receiptAttachment_);
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

    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Docflow.ReceiptDocflow}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Docflow.ReceiptDocflow)
        Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflowOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow.class, Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow.newBuilder()
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
          getReceiptAttachmentFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        isFinished_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (receiptAttachmentBuilder_ == null) {
          receiptAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
        } else {
          receiptAttachmentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_descriptor;
      }

      public Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow build() {
        Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow buildPartial() {
        Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow result = new Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isFinished_ = isFinished_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (receiptAttachmentBuilder_ == null) {
          result.receiptAttachment_ = receiptAttachment_;
        } else {
          result.receiptAttachment_ = receiptAttachmentBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow) {
          return mergeFrom((Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow other) {
        if (other == Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow.getDefaultInstance()) return this;
        if (other.hasIsFinished()) {
          setIsFinished(other.getIsFinished());
        }
        if (other.hasReceiptAttachment()) {
          mergeReceiptAttachment(other.getReceiptAttachment());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasReceiptAttachment()) {
          if (!getReceiptAttachment().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Docflow.ReceiptDocflowProtos.ReceiptDocflow) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isFinished_ ;
      /**
       * <code>optional bool IsFinished = 1;</code>
       */
      public boolean hasIsFinished() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool IsFinished = 1;</code>
       */
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>optional bool IsFinished = 1;</code>
       */
      public Builder setIsFinished(boolean value) {
        bitField0_ |= 0x00000001;
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool IsFinished = 1;</code>
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment receiptAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder> receiptAttachmentBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public boolean hasReceiptAttachment() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment getReceiptAttachment() {
        if (receiptAttachmentBuilder_ == null) {
          return receiptAttachment_;
        } else {
          return receiptAttachmentBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public Builder setReceiptAttachment(Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment value) {
        if (receiptAttachmentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          receiptAttachment_ = value;
          onChanged();
        } else {
          receiptAttachmentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public Builder setReceiptAttachment(
          Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder builderForValue) {
        if (receiptAttachmentBuilder_ == null) {
          receiptAttachment_ = builderForValue.build();
          onChanged();
        } else {
          receiptAttachmentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public Builder mergeReceiptAttachment(Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment value) {
        if (receiptAttachmentBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              receiptAttachment_ != Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance()) {
            receiptAttachment_ =
              Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.newBuilder(receiptAttachment_).mergeFrom(value).buildPartial();
          } else {
            receiptAttachment_ = value;
          }
          onChanged();
        } else {
          receiptAttachmentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public Builder clearReceiptAttachment() {
        if (receiptAttachmentBuilder_ == null) {
          receiptAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
          onChanged();
        } else {
          receiptAttachmentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder getReceiptAttachmentBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getReceiptAttachmentFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder getReceiptAttachmentOrBuilder() {
        if (receiptAttachmentBuilder_ != null) {
          return receiptAttachmentBuilder_.getMessageOrBuilder();
        } else {
          return receiptAttachment_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.SignedAttachment ReceiptAttachment = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder> 
          getReceiptAttachmentFieldBuilder() {
        if (receiptAttachmentBuilder_ == null) {
          receiptAttachmentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder>(
                  getReceiptAttachment(),
                  getParentForChildren(),
                  isClean());
          receiptAttachment_ = null;
        }
        return receiptAttachmentBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Docflow.ReceiptDocflow)
    }

    static {
      defaultInstance = new ReceiptDocflow(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Docflow.ReceiptDocflow)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034Docflow/ReceiptDocflow.proto\022\030Diadoc.A" +
      "pi.Proto.Docflow\032\030Docflow/Attachment.pro" +
      "to\"k\n\016ReceiptDocflow\022\022\n\nIsFinished\030\001 \001(\010" +
      "\022E\n\021ReceiptAttachment\030\002 \001(\0132*.Diadoc.Api" +
      ".Proto.Docflow.SignedAttachmentB\026B\024Recei" +
      "ptDocflowProtos"
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
          Diadoc.Api.Proto.Docflow.AttachmentProtos.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Docflow_ReceiptDocflow_descriptor,
        new java.lang.String[] { "IsFinished", "ReceiptAttachment", });
    Diadoc.Api.Proto.Docflow.AttachmentProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}