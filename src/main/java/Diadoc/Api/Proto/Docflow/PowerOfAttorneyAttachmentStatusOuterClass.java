// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Docflow/PowerOfAttorneyAttachmentStatus.proto

package Diadoc.Api.Proto.Docflow;

public final class PowerOfAttorneyAttachmentStatusOuterClass {
  private PowerOfAttorneyAttachmentStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.Docflow.StatusName}
   */
  public enum StatusName
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknown = 0;</code>
     */
    Unknown(0, 0),
    /**
     * <code>PowerOfAttorneyAttached = 1;</code>
     */
    PowerOfAttorneyAttached(1, 1),
    /**
     * <code>PowerOfAttorneyNotRequired = 2;</code>
     */
    PowerOfAttorneyNotRequired(2, 2),
    /**
     * <code>PowerOfAttorneyRequired = 3;</code>
     */
    PowerOfAttorneyRequired(3, 3),
    ;

    /**
     * <code>Unknown = 0;</code>
     */
    public static final int Unknown_VALUE = 0;
    /**
     * <code>PowerOfAttorneyAttached = 1;</code>
     */
    public static final int PowerOfAttorneyAttached_VALUE = 1;
    /**
     * <code>PowerOfAttorneyNotRequired = 2;</code>
     */
    public static final int PowerOfAttorneyNotRequired_VALUE = 2;
    /**
     * <code>PowerOfAttorneyRequired = 3;</code>
     */
    public static final int PowerOfAttorneyRequired_VALUE = 3;


    public final int getNumber() { return value; }

    public static StatusName valueOf(int value) {
      switch (value) {
        case 0: return Unknown;
        case 1: return PowerOfAttorneyAttached;
        case 2: return PowerOfAttorneyNotRequired;
        case 3: return PowerOfAttorneyRequired;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StatusName>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<StatusName>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StatusName>() {
            public StatusName findValueByNumber(int number) {
              return StatusName.valueOf(number);
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
      return Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final StatusName[] VALUES = values();

    public static StatusName valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private StatusName(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Docflow.StatusName)
  }

  public interface PowerOfAttorneyAttachmentStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
     */
    boolean hasStatusName();
    /**
     * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
     */
    Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName getStatusName();

    /**
     * <code>optional string Comment = 2;</code>
     */
    boolean hasComment();
    /**
     * <code>optional string Comment = 2;</code>
     */
    java.lang.String getComment();
    /**
     * <code>optional string Comment = 2;</code>
     */
    com.google.protobuf.ByteString
        getCommentBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatus}
   */
  public static final class PowerOfAttorneyAttachmentStatus extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatus)
      PowerOfAttorneyAttachmentStatusOrBuilder {
    // Use PowerOfAttorneyAttachmentStatus.newBuilder() to construct.
    private PowerOfAttorneyAttachmentStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PowerOfAttorneyAttachmentStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PowerOfAttorneyAttachmentStatus defaultInstance;
    public static PowerOfAttorneyAttachmentStatus getDefaultInstance() {
      return defaultInstance;
    }

    public PowerOfAttorneyAttachmentStatus getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PowerOfAttorneyAttachmentStatus(
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
              Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName value = Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                statusName_ = value;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              comment_ = bs;
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
      return Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus.class, Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus.Builder.class);
    }

    public static com.google.protobuf.Parser<PowerOfAttorneyAttachmentStatus> PARSER =
        new com.google.protobuf.AbstractParser<PowerOfAttorneyAttachmentStatus>() {
      public PowerOfAttorneyAttachmentStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PowerOfAttorneyAttachmentStatus(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PowerOfAttorneyAttachmentStatus> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUSNAME_FIELD_NUMBER = 1;
    private Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName statusName_;
    /**
     * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
     */
    public boolean hasStatusName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
     */
    public Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName getStatusName() {
      return statusName_;
    }

    public static final int COMMENT_FIELD_NUMBER = 2;
    private java.lang.Object comment_;
    /**
     * <code>optional string Comment = 2;</code>
     */
    public boolean hasComment() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string Comment = 2;</code>
     */
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          comment_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Comment = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      statusName_ = Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName.Unknown;
      comment_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasStatusName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, statusName_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getCommentBytes());
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
          .computeEnumSize(1, statusName_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getCommentBytes());
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

    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatus)
        Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus.class, Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus.newBuilder()
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
        statusName_ = Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName.Unknown;
        bitField0_ = (bitField0_ & ~0x00000001);
        comment_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_descriptor;
      }

      public Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus build() {
        Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus buildPartial() {
        Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus result = new Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.statusName_ = statusName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.comment_ = comment_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus) {
          return mergeFrom((Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus other) {
        if (other == Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus.getDefaultInstance()) return this;
        if (other.hasStatusName()) {
          setStatusName(other.getStatusName());
        }
        if (other.hasComment()) {
          bitField0_ |= 0x00000002;
          comment_ = other.comment_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatusName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.PowerOfAttorneyAttachmentStatus) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName statusName_ = Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName.Unknown;
      /**
       * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
       */
      public boolean hasStatusName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
       */
      public Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName getStatusName() {
        return statusName_;
      }
      /**
       * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
       */
      public Builder setStatusName(Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        statusName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .Diadoc.Api.Proto.Docflow.StatusName StatusName = 1 [default = Unknown];</code>
       */
      public Builder clearStatusName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        statusName_ = Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatusOuterClass.StatusName.Unknown;
        onChanged();
        return this;
      }

      private java.lang.Object comment_ = "";
      /**
       * <code>optional string Comment = 2;</code>
       */
      public boolean hasComment() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string Comment = 2;</code>
       */
      public java.lang.String getComment() {
        java.lang.Object ref = comment_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            comment_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Comment = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCommentBytes() {
        java.lang.Object ref = comment_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          comment_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Comment = 2;</code>
       */
      public Builder setComment(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        comment_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Comment = 2;</code>
       */
      public Builder clearComment() {
        bitField0_ = (bitField0_ & ~0x00000002);
        comment_ = getDefaultInstance().getComment();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Comment = 2;</code>
       */
      public Builder setCommentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        comment_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatus)
    }

    static {
      defaultInstance = new PowerOfAttorneyAttachmentStatus(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Docflow.PowerOfAttorneyAttachmentStatus)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-Docflow/PowerOfAttorneyAttachmentStatu" +
      "s.proto\022\030Diadoc.Api.Proto.Docflow\"u\n\037Pow" +
      "erOfAttorneyAttachmentStatus\022A\n\nStatusNa" +
      "me\030\001 \002(\0162$.Diadoc.Api.Proto.Docflow.Stat" +
      "usName:\007Unknown\022\017\n\007Comment\030\002 \001(\t*s\n\nStat" +
      "usName\022\013\n\007Unknown\020\000\022\033\n\027PowerOfAttorneyAt" +
      "tached\020\001\022\036\n\032PowerOfAttorneyNotRequired\020\002" +
      "\022\033\n\027PowerOfAttorneyRequired\020\003"
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
        }, assigner);
    internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Docflow_PowerOfAttorneyAttachmentStatus_descriptor,
        new java.lang.String[] { "StatusName", "Comment", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
