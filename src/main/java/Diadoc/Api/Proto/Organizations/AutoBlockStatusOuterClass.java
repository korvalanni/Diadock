// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Organizations/AutoBlockStatus.proto

package Diadoc.Api.Proto.Organizations;

public final class AutoBlockStatusOuterClass {
  private AutoBlockStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AutoBlockStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Organizations.AutoBlockStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool IsBlocked = 1;</code>
     */
    boolean hasIsBlocked();
    /**
     * <code>required bool IsBlocked = 1;</code>
     */
    boolean getIsBlocked();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Organizations.AutoBlockStatus}
   */
  public static final class AutoBlockStatus extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Organizations.AutoBlockStatus)
      AutoBlockStatusOrBuilder {
    // Use AutoBlockStatus.newBuilder() to construct.
    private AutoBlockStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AutoBlockStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AutoBlockStatus defaultInstance;
    public static AutoBlockStatus getDefaultInstance() {
      return defaultInstance;
    }

    public AutoBlockStatus getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AutoBlockStatus(
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
              isBlocked_ = input.readBool();
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
      return Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus.class, Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus.Builder.class);
    }

    public static com.google.protobuf.Parser<AutoBlockStatus> PARSER =
        new com.google.protobuf.AbstractParser<AutoBlockStatus>() {
      public AutoBlockStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AutoBlockStatus(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AutoBlockStatus> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ISBLOCKED_FIELD_NUMBER = 1;
    private boolean isBlocked_;
    /**
     * <code>required bool IsBlocked = 1;</code>
     */
    public boolean hasIsBlocked() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool IsBlocked = 1;</code>
     */
    public boolean getIsBlocked() {
      return isBlocked_;
    }

    private void initFields() {
      isBlocked_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIsBlocked()) {
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
        output.writeBool(1, isBlocked_);
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
          .computeBoolSize(1, isBlocked_);
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

    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Organizations.AutoBlockStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Organizations.AutoBlockStatus)
        Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus.class, Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus.newBuilder()
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
        isBlocked_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_descriptor;
      }

      public Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus build() {
        Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus buildPartial() {
        Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus result = new Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isBlocked_ = isBlocked_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus) {
          return mergeFrom((Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus other) {
        if (other == Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus.getDefaultInstance()) return this;
        if (other.hasIsBlocked()) {
          setIsBlocked(other.getIsBlocked());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasIsBlocked()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Organizations.AutoBlockStatusOuterClass.AutoBlockStatus) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isBlocked_ ;
      /**
       * <code>required bool IsBlocked = 1;</code>
       */
      public boolean hasIsBlocked() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool IsBlocked = 1;</code>
       */
      public boolean getIsBlocked() {
        return isBlocked_;
      }
      /**
       * <code>required bool IsBlocked = 1;</code>
       */
      public Builder setIsBlocked(boolean value) {
        bitField0_ |= 0x00000001;
        isBlocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool IsBlocked = 1;</code>
       */
      public Builder clearIsBlocked() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isBlocked_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Organizations.AutoBlockStatus)
    }

    static {
      defaultInstance = new AutoBlockStatus(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Organizations.AutoBlockStatus)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Organizations/AutoBlockStatus.proto\022\036D" +
      "iadoc.Api.Proto.Organizations\"$\n\017AutoBlo" +
      "ckStatus\022\021\n\tIsBlocked\030\001 \002(\010"
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
    internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Organizations_AutoBlockStatus_descriptor,
        new java.lang.String[] { "IsBlocked", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
