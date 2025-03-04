// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TotalCountType.proto

package Diadoc.Api.Proto;

public final class TotalCountTypeOuterClass {
  private TotalCountTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.TotalCountType}
   */
  public enum TotalCountType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownCountType = 0;</code>
     */
    UnknownCountType(0, 0),
    /**
     * <code>Equal = 1;</code>
     */
    Equal(1, 1),
    /**
     * <code>GreaterThanOrEqual = 2;</code>
     */
    GreaterThanOrEqual(2, 2),
    ;

    /**
     * <code>UnknownCountType = 0;</code>
     */
    public static final int UnknownCountType_VALUE = 0;
    /**
     * <code>Equal = 1;</code>
     */
    public static final int Equal_VALUE = 1;
    /**
     * <code>GreaterThanOrEqual = 2;</code>
     */
    public static final int GreaterThanOrEqual_VALUE = 2;


    public final int getNumber() { return value; }

    public static TotalCountType valueOf(int value) {
      switch (value) {
        case 0: return UnknownCountType;
        case 1: return Equal;
        case 2: return GreaterThanOrEqual;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TotalCountType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TotalCountType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TotalCountType>() {
            public TotalCountType findValueByNumber(int number) {
              return TotalCountType.valueOf(number);
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
      return Diadoc.Api.Proto.TotalCountTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final TotalCountType[] VALUES = values();

    public static TotalCountType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private TotalCountType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.TotalCountType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TotalCountType.proto\022\020Diadoc.Api.Proto" +
      "*I\n\016TotalCountType\022\024\n\020UnknownCountType\020\000" +
      "\022\t\n\005Equal\020\001\022\026\n\022GreaterThanOrEqual\020\002"
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
