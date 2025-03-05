// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Events/CounteragentEventType.proto

package Diadoc.Api.Proto.Events;

public final class CounteragentEventTypeProtos {
  private CounteragentEventTypeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.Events.CounteragentEventType}
   */
  public enum CounteragentEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownCounteragentEventType = 0;</code>
     */
    UnknownCounteragentEventType(0, 0),
    /**
     * <code>IInvitedCounteragent = 1;</code>
     */
    IInvitedCounteragent(1, 1),
    /**
     * <code>CounteragentInvitedMe = 2;</code>
     */
    CounteragentInvitedMe(2, 2),
    /**
     * <code>CounteragentAcceptedInvitation = 3;</code>
     */
    CounteragentAcceptedInvitation(3, 3),
    /**
     * <code>IAcceptedInvitation = 4;</code>
     */
    IAcceptedInvitation(4, 4),
    /**
     * <code>IWithdrewInvitation = 5;</code>
     */
    IWithdrewInvitation(5, 5),
    /**
     * <code>CounteragentWithdrewInvitation = 6;</code>
     */
    CounteragentWithdrewInvitation(6, 6),
    /**
     * <code>IRejectedInvitation = 7;</code>
     */
    IRejectedInvitation(7, 7),
    /**
     * <code>CounteragentRejectedInvitation = 8;</code>
     */
    CounteragentRejectedInvitation(8, 8),
    /**
     * <code>IBrokeUpWithCounteragent = 9;</code>
     */
    IBrokeUpWithCounteragent(9, 9),
    /**
     * <code>CounteragentBrokeUpWithMe = 10;</code>
     */
    CounteragentBrokeUpWithMe(10, 10),
    /**
     * <code>IForgotCounteragent = 11;</code>
     */
    IForgotCounteragent(11, 11),
    /**
     * <code>CounteragentForgotMe = 12;</code>
     */
    CounteragentForgotMe(12, 12),
    /**
     * <code>IMadeCounteragent = 13;</code>
     */
    IMadeCounteragent(13, 13),
    /**
     * <code>CounteragentMadeMe = 14;</code>
     */
    CounteragentMadeMe(14, 14),
    ;

    /**
     * <code>UnknownCounteragentEventType = 0;</code>
     */
    public static final int UnknownCounteragentEventType_VALUE = 0;
    /**
     * <code>IInvitedCounteragent = 1;</code>
     */
    public static final int IInvitedCounteragent_VALUE = 1;
    /**
     * <code>CounteragentInvitedMe = 2;</code>
     */
    public static final int CounteragentInvitedMe_VALUE = 2;
    /**
     * <code>CounteragentAcceptedInvitation = 3;</code>
     */
    public static final int CounteragentAcceptedInvitation_VALUE = 3;
    /**
     * <code>IAcceptedInvitation = 4;</code>
     */
    public static final int IAcceptedInvitation_VALUE = 4;
    /**
     * <code>IWithdrewInvitation = 5;</code>
     */
    public static final int IWithdrewInvitation_VALUE = 5;
    /**
     * <code>CounteragentWithdrewInvitation = 6;</code>
     */
    public static final int CounteragentWithdrewInvitation_VALUE = 6;
    /**
     * <code>IRejectedInvitation = 7;</code>
     */
    public static final int IRejectedInvitation_VALUE = 7;
    /**
     * <code>CounteragentRejectedInvitation = 8;</code>
     */
    public static final int CounteragentRejectedInvitation_VALUE = 8;
    /**
     * <code>IBrokeUpWithCounteragent = 9;</code>
     */
    public static final int IBrokeUpWithCounteragent_VALUE = 9;
    /**
     * <code>CounteragentBrokeUpWithMe = 10;</code>
     */
    public static final int CounteragentBrokeUpWithMe_VALUE = 10;
    /**
     * <code>IForgotCounteragent = 11;</code>
     */
    public static final int IForgotCounteragent_VALUE = 11;
    /**
     * <code>CounteragentForgotMe = 12;</code>
     */
    public static final int CounteragentForgotMe_VALUE = 12;
    /**
     * <code>IMadeCounteragent = 13;</code>
     */
    public static final int IMadeCounteragent_VALUE = 13;
    /**
     * <code>CounteragentMadeMe = 14;</code>
     */
    public static final int CounteragentMadeMe_VALUE = 14;


    public final int getNumber() { return value; }

    public static CounteragentEventType valueOf(int value) {
      switch (value) {
        case 0: return UnknownCounteragentEventType;
        case 1: return IInvitedCounteragent;
        case 2: return CounteragentInvitedMe;
        case 3: return CounteragentAcceptedInvitation;
        case 4: return IAcceptedInvitation;
        case 5: return IWithdrewInvitation;
        case 6: return CounteragentWithdrewInvitation;
        case 7: return IRejectedInvitation;
        case 8: return CounteragentRejectedInvitation;
        case 9: return IBrokeUpWithCounteragent;
        case 10: return CounteragentBrokeUpWithMe;
        case 11: return IForgotCounteragent;
        case 12: return CounteragentForgotMe;
        case 13: return IMadeCounteragent;
        case 14: return CounteragentMadeMe;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CounteragentEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<CounteragentEventType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CounteragentEventType>() {
            public CounteragentEventType findValueByNumber(int number) {
              return CounteragentEventType.valueOf(number);
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
      return Diadoc.Api.Proto.Events.CounteragentEventTypeProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final CounteragentEventType[] VALUES = values();

    public static CounteragentEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private CounteragentEventType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Events.CounteragentEventType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"Events/CounteragentEventType.proto\022\027Di" +
      "adoc.Api.Proto.Events*\304\003\n\025CounteragentEv" +
      "entType\022 \n\034UnknownCounteragentEventType\020" +
      "\000\022\030\n\024IInvitedCounteragent\020\001\022\031\n\025Counterag" +
      "entInvitedMe\020\002\022\"\n\036CounteragentAcceptedIn" +
      "vitation\020\003\022\027\n\023IAcceptedInvitation\020\004\022\027\n\023I" +
      "WithdrewInvitation\020\005\022\"\n\036CounteragentWith" +
      "drewInvitation\020\006\022\027\n\023IRejectedInvitation\020" +
      "\007\022\"\n\036CounteragentRejectedInvitation\020\010\022\034\n" +
      "\030IBrokeUpWithCounteragent\020\t\022\035\n\031Counterag",
      "entBrokeUpWithMe\020\n\022\027\n\023IForgotCounteragen" +
      "t\020\013\022\030\n\024CounteragentForgotMe\020\014\022\025\n\021IMadeCo" +
      "unteragent\020\r\022\026\n\022CounteragentMadeMe\020\016B\035B\033" +
      "CounteragentEventTypeProtos"
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
