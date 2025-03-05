// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResolutionRequestType.proto

package Diadoc.Api.Proto;

public final class ResolutionRequestTypeOuterClass {
  private ResolutionRequestTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.ResolutionRequestType}
   */
  public enum ResolutionRequestType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownResolutionRequestType = -1;</code>
     */
    UnknownResolutionRequestType(0, -1),
    /**
     * <code>ApprovementRequest = 0;</code>
     */
    ApprovementRequest(1, 0),
    /**
     * <code>SignatureRequest = 1;</code>
     */
    SignatureRequest(2, 1),
    /**
     * <code>ApprovementSignatureRequest = 2;</code>
     */
    ApprovementSignatureRequest(3, 2),
    /**
     * <code>Custom = 3;</code>
     */
    Custom(4, 3),
    ;

    /**
     * <code>UnknownResolutionRequestType = -1;</code>
     */
    public static final int UnknownResolutionRequestType_VALUE = -1;
    /**
     * <code>ApprovementRequest = 0;</code>
     */
    public static final int ApprovementRequest_VALUE = 0;
    /**
     * <code>SignatureRequest = 1;</code>
     */
    public static final int SignatureRequest_VALUE = 1;
    /**
     * <code>ApprovementSignatureRequest = 2;</code>
     */
    public static final int ApprovementSignatureRequest_VALUE = 2;
    /**
     * <code>Custom = 3;</code>
     */
    public static final int Custom_VALUE = 3;


    public final int getNumber() { return value; }

    public static ResolutionRequestType valueOf(int value) {
      switch (value) {
        case -1: return UnknownResolutionRequestType;
        case 0: return ApprovementRequest;
        case 1: return SignatureRequest;
        case 2: return ApprovementSignatureRequest;
        case 3: return Custom;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResolutionRequestType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ResolutionRequestType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResolutionRequestType>() {
            public ResolutionRequestType findValueByNumber(int number) {
              return ResolutionRequestType.valueOf(number);
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
      return Diadoc.Api.Proto.ResolutionRequestTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResolutionRequestType[] VALUES = values();

    public static ResolutionRequestType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ResolutionRequestType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.ResolutionRequestType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ResolutionRequestType.proto\022\020Diadoc.Ap" +
      "i.Proto*\235\001\n\025ResolutionRequestType\022)\n\034Unk" +
      "nownResolutionRequestType\020\377\377\377\377\377\377\377\377\377\001\022\026\n\022" +
      "ApprovementRequest\020\000\022\024\n\020SignatureRequest" +
      "\020\001\022\037\n\033ApprovementSignatureRequest\020\002\022\n\n\006C" +
      "ustom\020\003"
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
