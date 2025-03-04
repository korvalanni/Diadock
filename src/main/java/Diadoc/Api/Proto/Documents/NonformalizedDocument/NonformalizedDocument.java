// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Documents/NonformalizedDocument.proto

package Diadoc.Api.Proto.Documents.NonformalizedDocument;

public final class NonformalizedDocument {
  private NonformalizedDocument() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus}
   */
  public enum NonformalizedDocumentStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownNonformalizedDocumentStatus = 0;</code>
     *
     * <pre>
     * Reserved state to report to legacy client for new statuses
     * </pre>
     */
    UnknownNonformalizedDocumentStatus(0, 0),
    /**
     * <code>OutboundNoRecipientSignatureRequest = 1;</code>
     */
    OutboundNoRecipientSignatureRequest(1, 1),
    /**
     * <code>OutboundWaitingForRecipientSignature = 2;</code>
     */
    OutboundWaitingForRecipientSignature(2, 2),
    /**
     * <code>OutboundWithRecipientSignature = 3;</code>
     */
    OutboundWithRecipientSignature(3, 3),
    /**
     * <code>OutboundRecipientSignatureRequestRejected = 4;</code>
     */
    OutboundRecipientSignatureRequestRejected(4, 4),
    /**
     * <code>OutboundWaitingForSenderSignature = 13;</code>
     */
    OutboundWaitingForSenderSignature(5, 13),
    /**
     * <code>OutboundInvalidSenderSignature = 14;</code>
     */
    OutboundInvalidSenderSignature(6, 14),
    /**
     * <code>InboundNoRecipientSignatureRequest = 5;</code>
     */
    InboundNoRecipientSignatureRequest(7, 5),
    /**
     * <code>InboundWaitingForRecipientSignature = 6;</code>
     */
    InboundWaitingForRecipientSignature(8, 6),
    /**
     * <code>InboundWithRecipientSignature = 7;</code>
     */
    InboundWithRecipientSignature(9, 7),
    /**
     * <code>InboundRecipientSignatureRequestRejected = 8;</code>
     */
    InboundRecipientSignatureRequestRejected(10, 8),
    /**
     * <code>InboundInvalidRecipientSignature = 15;</code>
     */
    InboundInvalidRecipientSignature(11, 15),
    /**
     * <code>InternalNoRecipientSignatureRequest = 9;</code>
     */
    InternalNoRecipientSignatureRequest(12, 9),
    /**
     * <code>InternalWaitingForRecipientSignature = 10;</code>
     */
    InternalWaitingForRecipientSignature(13, 10),
    /**
     * <code>InternalWithRecipientSignature = 11;</code>
     */
    InternalWithRecipientSignature(14, 11),
    /**
     * <code>InternalRecipientSignatureRequestRejected = 12;</code>
     */
    InternalRecipientSignatureRequestRejected(15, 12),
    /**
     * <code>InternalWaitingForSenderSignature = 16;</code>
     */
    InternalWaitingForSenderSignature(16, 16),
    /**
     * <code>InternalInvalidSenderSignature = 17;</code>
     */
    InternalInvalidSenderSignature(17, 17),
    /**
     * <code>InternalInvalidRecipientSignature = 18;</code>
     */
    InternalInvalidRecipientSignature(18, 18),
    ;

    /**
     * <code>UnknownNonformalizedDocumentStatus = 0;</code>
     *
     * <pre>
     * Reserved state to report to legacy client for new statuses
     * </pre>
     */
    public static final int UnknownNonformalizedDocumentStatus_VALUE = 0;
    /**
     * <code>OutboundNoRecipientSignatureRequest = 1;</code>
     */
    public static final int OutboundNoRecipientSignatureRequest_VALUE = 1;
    /**
     * <code>OutboundWaitingForRecipientSignature = 2;</code>
     */
    public static final int OutboundWaitingForRecipientSignature_VALUE = 2;
    /**
     * <code>OutboundWithRecipientSignature = 3;</code>
     */
    public static final int OutboundWithRecipientSignature_VALUE = 3;
    /**
     * <code>OutboundRecipientSignatureRequestRejected = 4;</code>
     */
    public static final int OutboundRecipientSignatureRequestRejected_VALUE = 4;
    /**
     * <code>OutboundWaitingForSenderSignature = 13;</code>
     */
    public static final int OutboundWaitingForSenderSignature_VALUE = 13;
    /**
     * <code>OutboundInvalidSenderSignature = 14;</code>
     */
    public static final int OutboundInvalidSenderSignature_VALUE = 14;
    /**
     * <code>InboundNoRecipientSignatureRequest = 5;</code>
     */
    public static final int InboundNoRecipientSignatureRequest_VALUE = 5;
    /**
     * <code>InboundWaitingForRecipientSignature = 6;</code>
     */
    public static final int InboundWaitingForRecipientSignature_VALUE = 6;
    /**
     * <code>InboundWithRecipientSignature = 7;</code>
     */
    public static final int InboundWithRecipientSignature_VALUE = 7;
    /**
     * <code>InboundRecipientSignatureRequestRejected = 8;</code>
     */
    public static final int InboundRecipientSignatureRequestRejected_VALUE = 8;
    /**
     * <code>InboundInvalidRecipientSignature = 15;</code>
     */
    public static final int InboundInvalidRecipientSignature_VALUE = 15;
    /**
     * <code>InternalNoRecipientSignatureRequest = 9;</code>
     */
    public static final int InternalNoRecipientSignatureRequest_VALUE = 9;
    /**
     * <code>InternalWaitingForRecipientSignature = 10;</code>
     */
    public static final int InternalWaitingForRecipientSignature_VALUE = 10;
    /**
     * <code>InternalWithRecipientSignature = 11;</code>
     */
    public static final int InternalWithRecipientSignature_VALUE = 11;
    /**
     * <code>InternalRecipientSignatureRequestRejected = 12;</code>
     */
    public static final int InternalRecipientSignatureRequestRejected_VALUE = 12;
    /**
     * <code>InternalWaitingForSenderSignature = 16;</code>
     */
    public static final int InternalWaitingForSenderSignature_VALUE = 16;
    /**
     * <code>InternalInvalidSenderSignature = 17;</code>
     */
    public static final int InternalInvalidSenderSignature_VALUE = 17;
    /**
     * <code>InternalInvalidRecipientSignature = 18;</code>
     */
    public static final int InternalInvalidRecipientSignature_VALUE = 18;


    public final int getNumber() { return value; }

    public static NonformalizedDocumentStatus valueOf(int value) {
      switch (value) {
        case 0: return UnknownNonformalizedDocumentStatus;
        case 1: return OutboundNoRecipientSignatureRequest;
        case 2: return OutboundWaitingForRecipientSignature;
        case 3: return OutboundWithRecipientSignature;
        case 4: return OutboundRecipientSignatureRequestRejected;
        case 13: return OutboundWaitingForSenderSignature;
        case 14: return OutboundInvalidSenderSignature;
        case 5: return InboundNoRecipientSignatureRequest;
        case 6: return InboundWaitingForRecipientSignature;
        case 7: return InboundWithRecipientSignature;
        case 8: return InboundRecipientSignatureRequestRejected;
        case 15: return InboundInvalidRecipientSignature;
        case 9: return InternalNoRecipientSignatureRequest;
        case 10: return InternalWaitingForRecipientSignature;
        case 11: return InternalWithRecipientSignature;
        case 12: return InternalRecipientSignatureRequestRejected;
        case 16: return InternalWaitingForSenderSignature;
        case 17: return InternalInvalidSenderSignature;
        case 18: return InternalInvalidRecipientSignature;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NonformalizedDocumentStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<NonformalizedDocumentStatus>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NonformalizedDocumentStatus>() {
            public NonformalizedDocumentStatus findValueByNumber(int number) {
              return NonformalizedDocumentStatus.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.getDescriptor().getEnumTypes().get(0);
    }

    private static final NonformalizedDocumentStatus[] VALUES = values();

    public static NonformalizedDocumentStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private NonformalizedDocumentStatus(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus)
  }

  public interface NonformalizedDocumentMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentMetadata)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
     */
    boolean hasDocumentStatus();
    /**
     * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
     */
    Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus getDocumentStatus();

    /**
     * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
     */
    boolean hasReceiptStatus();
    /**
     * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
     */
    Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus getReceiptStatus();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentMetadata}
   */
  public static final class NonformalizedDocumentMetadata extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentMetadata)
      NonformalizedDocumentMetadataOrBuilder {
    // Use NonformalizedDocumentMetadata.newBuilder() to construct.
    private NonformalizedDocumentMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NonformalizedDocumentMetadata(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NonformalizedDocumentMetadata defaultInstance;
    public static NonformalizedDocumentMetadata getDefaultInstance() {
      return defaultInstance;
    }

    public NonformalizedDocumentMetadata getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NonformalizedDocumentMetadata(
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
              int rawValue = input.readEnum();
              Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus value = Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                documentStatus_ = value;
              }
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus value = Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                receiptStatus_ = value;
              }
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
      return Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata.class, Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata.Builder.class);
    }

    public static com.google.protobuf.Parser<NonformalizedDocumentMetadata> PARSER =
        new com.google.protobuf.AbstractParser<NonformalizedDocumentMetadata>() {
      public NonformalizedDocumentMetadata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NonformalizedDocumentMetadata(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NonformalizedDocumentMetadata> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int DOCUMENTSTATUS_FIELD_NUMBER = 1;
    private Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus documentStatus_;
    /**
     * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
     */
    public boolean hasDocumentStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
     */
    public Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus getDocumentStatus() {
      return documentStatus_;
    }

    public static final int RECEIPTSTATUS_FIELD_NUMBER = 2;
    private Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus receiptStatus_;
    /**
     * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
     */
    public boolean hasReceiptStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
     */
    public Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus getReceiptStatus() {
      return receiptStatus_;
    }

    private void initFields() {
      documentStatus_ = Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus.UnknownNonformalizedDocumentStatus;
      receiptStatus_ = Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus.UnknownReceiptStatus;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, documentStatus_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, receiptStatus_.getNumber());
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
          .computeEnumSize(1, documentStatus_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, receiptStatus_.getNumber());
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

    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentMetadata)
        Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata.class, Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        documentStatus_ = Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus.UnknownNonformalizedDocumentStatus;
        bitField0_ = (bitField0_ & ~0x00000001);
        receiptStatus_ = Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus.UnknownReceiptStatus;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_descriptor;
      }

      public Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata build() {
        Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata buildPartial() {
        Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata result = new Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.documentStatus_ = documentStatus_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.receiptStatus_ = receiptStatus_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata) {
          return mergeFrom((Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata other) {
        if (other == Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata.getDefaultInstance()) return this;
        if (other.hasDocumentStatus()) {
          setDocumentStatus(other.getDocumentStatus());
        }
        if (other.hasReceiptStatus()) {
          setReceiptStatus(other.getReceiptStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentMetadata) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus documentStatus_ = Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus.UnknownNonformalizedDocumentStatus;
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
       */
      public boolean hasDocumentStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
       */
      public Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus getDocumentStatus() {
        return documentStatus_;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
       */
      public Builder setDocumentStatus(Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        documentStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentStatus DocumentStatus = 1 [default = UnknownNonformalizedDocumentStatus];</code>
       */
      public Builder clearDocumentStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        documentStatus_ = Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocument.NonformalizedDocumentStatus.UnknownNonformalizedDocumentStatus;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus receiptStatus_ = Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus.UnknownReceiptStatus;
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
       */
      public boolean hasReceiptStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
       */
      public Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus getReceiptStatus() {
        return receiptStatus_;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
       */
      public Builder setReceiptStatus(Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        receiptStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Documents.ReceiptStatus ReceiptStatus = 2 [default = UnknownReceiptStatus];</code>
       */
      public Builder clearReceiptStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        receiptStatus_ = Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.ReceiptStatus.UnknownReceiptStatus;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentMetadata)
    }

    static {
      defaultInstance = new NonformalizedDocumentMetadata(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Documents.NonformalizedDocument.NonformalizedDocumentMetadata)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%Documents/NonformalizedDocument.proto\022" +
      "0Diadoc.Api.Proto.Documents.Nonformalize" +
      "dDocument\032\035Documents/ReceiptStatus.proto" +
      "\"\203\002\n\035NonformalizedDocumentMetadata\022\211\001\n\016D" +
      "ocumentStatus\030\001 \001(\0162M.Diadoc.Api.Proto.D" +
      "ocuments.NonformalizedDocument.Nonformal" +
      "izedDocumentStatus:\"UnknownNonformalized" +
      "DocumentStatus\022V\n\rReceiptStatus\030\002 \001(\0162)." +
      "Diadoc.Api.Proto.Documents.ReceiptStatus" +
      ":\024UnknownReceiptStatus*\226\006\n\033Nonformalized",
      "DocumentStatus\022&\n\"UnknownNonformalizedDo" +
      "cumentStatus\020\000\022\'\n#OutboundNoRecipientSig" +
      "natureRequest\020\001\022(\n$OutboundWaitingForRec" +
      "ipientSignature\020\002\022\"\n\036OutboundWithRecipie" +
      "ntSignature\020\003\022-\n)OutboundRecipientSignat" +
      "ureRequestRejected\020\004\022%\n!OutboundWaitingF" +
      "orSenderSignature\020\r\022\"\n\036OutboundInvalidSe" +
      "nderSignature\020\016\022&\n\"InboundNoRecipientSig" +
      "natureRequest\020\005\022\'\n#InboundWaitingForReci" +
      "pientSignature\020\006\022!\n\035InboundWithRecipient",
      "Signature\020\007\022,\n(InboundRecipientSignature" +
      "RequestRejected\020\010\022$\n InboundInvalidRecip" +
      "ientSignature\020\017\022\'\n#InternalNoRecipientSi" +
      "gnatureRequest\020\t\022(\n$InternalWaitingForRe" +
      "cipientSignature\020\n\022\"\n\036InternalWithRecipi" +
      "entSignature\020\013\022-\n)InternalRecipientSigna" +
      "tureRequestRejected\020\014\022%\n!InternalWaiting" +
      "ForSenderSignature\020\020\022\"\n\036InternalInvalidS" +
      "enderSignature\020\021\022%\n!InternalInvalidRecip" +
      "ientSignature\020\022"
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
          Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Documents_NonformalizedDocument_NonformalizedDocumentMetadata_descriptor,
        new java.lang.String[] { "DocumentStatus", "ReceiptStatus", });
    Diadoc.Api.Proto.Documents.ReceiptStatusOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
