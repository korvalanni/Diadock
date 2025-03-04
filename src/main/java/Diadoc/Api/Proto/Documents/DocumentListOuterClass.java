// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Documents/DocumentList.proto

package Diadoc.Api.Proto.Documents;

public final class DocumentListOuterClass {
  private DocumentListOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DocumentListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Documents.DocumentList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 TotalCount = 1;</code>
     */
    boolean hasTotalCount();
    /**
     * <code>required int32 TotalCount = 1;</code>
     */
    int getTotalCount();

    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    java.util.List<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document> 
        getDocumentsList();
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    Diadoc.Api.Proto.Documents.DocumentOuterClass.Document getDocuments(int index);
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    int getDocumentsCount();
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    java.util.List<? extends Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder> 
        getDocumentsOrBuilderList();
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder getDocumentsOrBuilder(
        int index);

    /**
     * <code>optional bool HasMoreResults = 3;</code>
     */
    boolean hasHasMoreResults();
    /**
     * <code>optional bool HasMoreResults = 3;</code>
     */
    boolean getHasMoreResults();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Documents.DocumentList}
   */
  public static final class DocumentList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Documents.DocumentList)
      DocumentListOrBuilder {
    // Use DocumentList.newBuilder() to construct.
    private DocumentList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DocumentList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DocumentList defaultInstance;
    public static DocumentList getDefaultInstance() {
      return defaultInstance;
    }

    public DocumentList getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DocumentList(
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
              totalCount_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                documents_ = new java.util.ArrayList<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document>();
                mutable_bitField0_ |= 0x00000002;
              }
              documents_.add(input.readMessage(Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.PARSER, extensionRegistry));
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              hasMoreResults_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          documents_ = java.util.Collections.unmodifiableList(documents_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Documents.DocumentListOuterClass.internal_static_Diadoc_Api_Proto_Documents_DocumentList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Documents.DocumentListOuterClass.internal_static_Diadoc_Api_Proto_Documents_DocumentList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList.class, Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList.Builder.class);
    }

    public static com.google.protobuf.Parser<DocumentList> PARSER =
        new com.google.protobuf.AbstractParser<DocumentList>() {
      public DocumentList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentList(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DocumentList> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TOTALCOUNT_FIELD_NUMBER = 1;
    private int totalCount_;
    /**
     * <code>required int32 TotalCount = 1;</code>
     */
    public boolean hasTotalCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 TotalCount = 1;</code>
     */
    public int getTotalCount() {
      return totalCount_;
    }

    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private java.util.List<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document> documents_;
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    public java.util.List<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document> getDocumentsList() {
      return documents_;
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    public java.util.List<? extends Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder> 
        getDocumentsOrBuilderList() {
      return documents_;
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    public int getDocumentsCount() {
      return documents_.size();
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    public Diadoc.Api.Proto.Documents.DocumentOuterClass.Document getDocuments(int index) {
      return documents_.get(index);
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
     */
    public Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder getDocumentsOrBuilder(
        int index) {
      return documents_.get(index);
    }

    public static final int HASMORERESULTS_FIELD_NUMBER = 3;
    private boolean hasMoreResults_;
    /**
     * <code>optional bool HasMoreResults = 3;</code>
     */
    public boolean hasHasMoreResults() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool HasMoreResults = 3;</code>
     */
    public boolean getHasMoreResults() {
      return hasMoreResults_;
    }

    private void initFields() {
      totalCount_ = 0;
      documents_ = java.util.Collections.emptyList();
      hasMoreResults_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTotalCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getDocumentsCount(); i++) {
        if (!getDocuments(i).isInitialized()) {
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
        output.writeInt32(1, totalCount_);
      }
      for (int i = 0; i < documents_.size(); i++) {
        output.writeMessage(2, documents_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(3, hasMoreResults_);
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
          .computeInt32Size(1, totalCount_);
      }
      for (int i = 0; i < documents_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, documents_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, hasMoreResults_);
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

    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Documents.DocumentList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Documents.DocumentList)
        Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Documents.DocumentListOuterClass.internal_static_Diadoc_Api_Proto_Documents_DocumentList_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Documents.DocumentListOuterClass.internal_static_Diadoc_Api_Proto_Documents_DocumentList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList.class, Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList.newBuilder()
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
          getDocumentsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        totalCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (documentsBuilder_ == null) {
          documents_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          documentsBuilder_.clear();
        }
        hasMoreResults_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Documents.DocumentListOuterClass.internal_static_Diadoc_Api_Proto_Documents_DocumentList_descriptor;
      }

      public Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList build() {
        Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList buildPartial() {
        Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList result = new Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.totalCount_ = totalCount_;
        if (documentsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            documents_ = java.util.Collections.unmodifiableList(documents_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.documents_ = documents_;
        } else {
          result.documents_ = documentsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.hasMoreResults_ = hasMoreResults_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList) {
          return mergeFrom((Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList other) {
        if (other == Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList.getDefaultInstance()) return this;
        if (other.hasTotalCount()) {
          setTotalCount(other.getTotalCount());
        }
        if (documentsBuilder_ == null) {
          if (!other.documents_.isEmpty()) {
            if (documents_.isEmpty()) {
              documents_ = other.documents_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDocumentsIsMutable();
              documents_.addAll(other.documents_);
            }
            onChanged();
          }
        } else {
          if (!other.documents_.isEmpty()) {
            if (documentsBuilder_.isEmpty()) {
              documentsBuilder_.dispose();
              documentsBuilder_ = null;
              documents_ = other.documents_;
              bitField0_ = (bitField0_ & ~0x00000002);
              documentsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getDocumentsFieldBuilder() : null;
            } else {
              documentsBuilder_.addAllMessages(other.documents_);
            }
          }
        }
        if (other.hasHasMoreResults()) {
          setHasMoreResults(other.getHasMoreResults());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTotalCount()) {
          
          return false;
        }
        for (int i = 0; i < getDocumentsCount(); i++) {
          if (!getDocuments(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Documents.DocumentListOuterClass.DocumentList) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int totalCount_ ;
      /**
       * <code>required int32 TotalCount = 1;</code>
       */
      public boolean hasTotalCount() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 TotalCount = 1;</code>
       */
      public int getTotalCount() {
        return totalCount_;
      }
      /**
       * <code>required int32 TotalCount = 1;</code>
       */
      public Builder setTotalCount(int value) {
        bitField0_ |= 0x00000001;
        totalCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 TotalCount = 1;</code>
       */
      public Builder clearTotalCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        totalCount_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document> documents_ =
        java.util.Collections.emptyList();
      private void ensureDocumentsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          documents_ = new java.util.ArrayList<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document>(documents_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.Documents.DocumentOuterClass.Document, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder, Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder> documentsBuilder_;

      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public java.util.List<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document> getDocumentsList() {
        if (documentsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(documents_);
        } else {
          return documentsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public int getDocumentsCount() {
        if (documentsBuilder_ == null) {
          return documents_.size();
        } else {
          return documentsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Diadoc.Api.Proto.Documents.DocumentOuterClass.Document getDocuments(int index) {
        if (documentsBuilder_ == null) {
          return documents_.get(index);
        } else {
          return documentsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder setDocuments(
          int index, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document value) {
        if (documentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentsIsMutable();
          documents_.set(index, value);
          onChanged();
        } else {
          documentsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder setDocuments(
          int index, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder builderForValue) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.set(index, builderForValue.build());
          onChanged();
        } else {
          documentsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder addDocuments(Diadoc.Api.Proto.Documents.DocumentOuterClass.Document value) {
        if (documentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentsIsMutable();
          documents_.add(value);
          onChanged();
        } else {
          documentsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder addDocuments(
          int index, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document value) {
        if (documentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentsIsMutable();
          documents_.add(index, value);
          onChanged();
        } else {
          documentsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder addDocuments(
          Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder builderForValue) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.add(builderForValue.build());
          onChanged();
        } else {
          documentsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder addDocuments(
          int index, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder builderForValue) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.add(index, builderForValue.build());
          onChanged();
        } else {
          documentsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder addAllDocuments(
          java.lang.Iterable<? extends Diadoc.Api.Proto.Documents.DocumentOuterClass.Document> values) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, documents_);
          onChanged();
        } else {
          documentsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder clearDocuments() {
        if (documentsBuilder_ == null) {
          documents_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          documentsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Builder removeDocuments(int index) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.remove(index);
          onChanged();
        } else {
          documentsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder getDocumentsBuilder(
          int index) {
        return getDocumentsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder getDocumentsOrBuilder(
          int index) {
        if (documentsBuilder_ == null) {
          return documents_.get(index);  } else {
          return documentsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public java.util.List<? extends Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder> 
           getDocumentsOrBuilderList() {
        if (documentsBuilder_ != null) {
          return documentsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(documents_);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder addDocumentsBuilder() {
        return getDocumentsFieldBuilder().addBuilder(
            Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.getDefaultInstance());
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder addDocumentsBuilder(
          int index) {
        return getDocumentsFieldBuilder().addBuilder(
            index, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.getDefaultInstance());
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Documents.Document Documents = 2;</code>
       */
      public java.util.List<Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder> 
           getDocumentsBuilderList() {
        return getDocumentsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.Documents.DocumentOuterClass.Document, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder, Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder> 
          getDocumentsFieldBuilder() {
        if (documentsBuilder_ == null) {
          documentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              Diadoc.Api.Proto.Documents.DocumentOuterClass.Document, Diadoc.Api.Proto.Documents.DocumentOuterClass.Document.Builder, Diadoc.Api.Proto.Documents.DocumentOuterClass.DocumentOrBuilder>(
                  documents_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          documents_ = null;
        }
        return documentsBuilder_;
      }

      private boolean hasMoreResults_ ;
      /**
       * <code>optional bool HasMoreResults = 3;</code>
       */
      public boolean hasHasMoreResults() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool HasMoreResults = 3;</code>
       */
      public boolean getHasMoreResults() {
        return hasMoreResults_;
      }
      /**
       * <code>optional bool HasMoreResults = 3;</code>
       */
      public Builder setHasMoreResults(boolean value) {
        bitField0_ |= 0x00000004;
        hasMoreResults_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool HasMoreResults = 3;</code>
       */
      public Builder clearHasMoreResults() {
        bitField0_ = (bitField0_ & ~0x00000004);
        hasMoreResults_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Documents.DocumentList)
    }

    static {
      defaultInstance = new DocumentList(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Documents.DocumentList)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Documents_DocumentList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Documents_DocumentList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034Documents/DocumentList.proto\022\032Diadoc.A" +
      "pi.Proto.Documents\032\030Documents/Document.p" +
      "roto\"s\n\014DocumentList\022\022\n\nTotalCount\030\001 \002(\005" +
      "\0227\n\tDocuments\030\002 \003(\0132$.Diadoc.Api.Proto.D" +
      "ocuments.Document\022\026\n\016HasMoreResults\030\003 \001(" +
      "\010"
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
          Diadoc.Api.Proto.Documents.DocumentOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_Documents_DocumentList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Documents_DocumentList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Documents_DocumentList_descriptor,
        new java.lang.String[] { "TotalCount", "Documents", "HasMoreResults", });
    Diadoc.Api.Proto.Documents.DocumentOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
