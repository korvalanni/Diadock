// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Workflows/TitleReceiptBehavior.proto

package Diadoc.Api.Proto.Workflows.TitleReceiptBehavior;

public final class TitleReceiptBehaviorOuterClass {
  private TitleReceiptBehaviorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.Workflows.TitleReceiptBehavior.TitleReceiptBehavior}
   */
  public enum TitleReceiptBehavior
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknown = 0;</code>
     */
    Unknown(0, 0),
    /**
     * <code>Never = 1;</code>
     */
    Never(1, 1),
    /**
     * <code>DefineByUser = 2;</code>
     */
    DefineByUser(2, 2),
    /**
     * <code>Always = 3;</code>
     */
    Always(3, 3),
    ;

    /**
     * <code>Unknown = 0;</code>
     */
    public static final int Unknown_VALUE = 0;
    /**
     * <code>Never = 1;</code>
     */
    public static final int Never_VALUE = 1;
    /**
     * <code>DefineByUser = 2;</code>
     */
    public static final int DefineByUser_VALUE = 2;
    /**
     * <code>Always = 3;</code>
     */
    public static final int Always_VALUE = 3;


    public final int getNumber() { return value; }

    public static TitleReceiptBehavior valueOf(int value) {
      switch (value) {
        case 0: return Unknown;
        case 1: return Never;
        case 2: return DefineByUser;
        case 3: return Always;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TitleReceiptBehavior>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TitleReceiptBehavior>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TitleReceiptBehavior>() {
            public TitleReceiptBehavior findValueByNumber(int number) {
              return TitleReceiptBehavior.valueOf(number);
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
      return Diadoc.Api.Proto.Workflows.TitleReceiptBehavior.TitleReceiptBehaviorOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final TitleReceiptBehavior[] VALUES = values();

    public static TitleReceiptBehavior valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private TitleReceiptBehavior(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Workflows.TitleReceiptBehavior.TitleReceiptBehavior)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$Workflows/TitleReceiptBehavior.proto\022/" +
      "Diadoc.Api.Proto.Workflows.TitleReceiptB" +
      "ehavior*L\n\024TitleReceiptBehavior\022\013\n\007Unkno" +
      "wn\020\000\022\t\n\005Never\020\001\022\020\n\014DefineByUser\020\002\022\n\n\006Alw" +
      "ays\020\003"
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
