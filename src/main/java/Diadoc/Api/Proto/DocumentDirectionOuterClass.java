// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DocumentDirection.proto

package Diadoc.Api.Proto;

public final class DocumentDirectionOuterClass {
  private DocumentDirectionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.DocumentDirection}
   */
  public enum DocumentDirection
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownDocumentDirection = 0;</code>
     *
     * <pre>
     * reserved for backward compatibility
     * </pre>
     */
    UnknownDocumentDirection(0, 0),
    /**
     * <code>Inbound = 1;</code>
     */
    Inbound(1, 1),
    /**
     * <code>Outbound = 2;</code>
     */
    Outbound(2, 2),
    /**
     * <code>Internal = 3;</code>
     */
    Internal(3, 3),
    ;

    /**
     * <code>UnknownDocumentDirection = 0;</code>
     *
     * <pre>
     * reserved for backward compatibility
     * </pre>
     */
    public static final int UnknownDocumentDirection_VALUE = 0;
    /**
     * <code>Inbound = 1;</code>
     */
    public static final int Inbound_VALUE = 1;
    /**
     * <code>Outbound = 2;</code>
     */
    public static final int Outbound_VALUE = 2;
    /**
     * <code>Internal = 3;</code>
     */
    public static final int Internal_VALUE = 3;


    public final int getNumber() { return value; }

    public static DocumentDirection valueOf(int value) {
      switch (value) {
        case 0: return UnknownDocumentDirection;
        case 1: return Inbound;
        case 2: return Outbound;
        case 3: return Internal;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DocumentDirection>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<DocumentDirection>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DocumentDirection>() {
            public DocumentDirection findValueByNumber(int number) {
              return DocumentDirection.valueOf(number);
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
      return Diadoc.Api.Proto.DocumentDirectionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DocumentDirection[] VALUES = values();

    public static DocumentDirection valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private DocumentDirection(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.DocumentDirection)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027DocumentDirection.proto\022\020Diadoc.Api.Pr" +
      "oto*Z\n\021DocumentDirection\022\034\n\030UnknownDocum" +
      "entDirection\020\000\022\013\n\007Inbound\020\001\022\014\n\010Outbound\020" +
      "\002\022\014\n\010Internal\020\003"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
