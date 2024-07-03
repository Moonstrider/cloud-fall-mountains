package com.volvocars.conncar.connectivityinsight.proto.events;

public final class UserAccount {
  private UserAccount() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      UserAccount.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserAccountUpdatedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messages.UserAccountUpdated)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
     * @return The enum numeric value on the wire for eventType.
     */
    int getEventTypeValue();
    /**
     * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
     * @return The eventType.
     */
    com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType getEventType();

    /**
     * <code>string id = 3;</code>
     * @return The id.
     */
    java.lang.String getId();
    /**
     * <code>string id = 3;</code>
     * @return The bytes for id.
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>optional string market = 4;</code>
     * @return Whether the market field is set.
     */
    boolean hasMarket();
    /**
     * <code>optional string market = 4;</code>
     * @return The market.
     */
    java.lang.String getMarket();
    /**
     * <code>optional string market = 4;</code>
     * @return The bytes for market.
     */
    com.google.protobuf.ByteString
        getMarketBytes();

    /**
     * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
     * @return Whether the brand field is set.
     */
    boolean hasBrand();
    /**
     * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
     * @return The enum numeric value on the wire for brand.
     */
    int getBrandValue();
    /**
     * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
     * @return The brand.
     */
    com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand getBrand();

    /**
     * <code>optional string type = 6;</code>
     * @return Whether the type field is set.
     */
    boolean hasType();
    /**
     * <code>optional string type = 6;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <code>optional string type = 6;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>optional string channel = 7;</code>
     * @return Whether the channel field is set.
     */
    boolean hasChannel();
    /**
     * <code>optional string channel = 7;</code>
     * @return The channel.
     */
    java.lang.String getChannel();
    /**
     * <code>optional string channel = 7;</code>
     * @return The bytes for channel.
     */
    com.google.protobuf.ByteString
        getChannelBytes();

    /**
     * <code>optional string language = 8;</code>
     * @return Whether the language field is set.
     */
    boolean hasLanguage();
    /**
     * <code>optional string language = 8;</code>
     * @return The language.
     */
    java.lang.String getLanguage();
    /**
     * <code>optional string language = 8;</code>
     * @return The bytes for language.
     */
    com.google.protobuf.ByteString
        getLanguageBytes();

    /**
     * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
     * @return Whether the usernameType field is set.
     */
    boolean hasUsernameType();
    /**
     * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
     * @return The enum numeric value on the wire for usernameType.
     */
    int getUsernameTypeValue();
    /**
     * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
     * @return The usernameType.
     */
    com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType getUsernameType();
  }
  /**
   * Protobuf type {@code messages.UserAccountUpdated}
   */
  public static final class UserAccountUpdated extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:messages.UserAccountUpdated)
      UserAccountUpdatedOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 1,
        /* suffix= */ "",
        UserAccountUpdated.class.getName());
    }
    // Use UserAccountUpdated.newBuilder() to construct.
    private UserAccountUpdated(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private UserAccountUpdated() {
      eventType_ = 0;
      id_ = "";
      market_ = "";
      brand_ = 0;
      type_ = "";
      channel_ = "";
      language_ = "";
      usernameType_ = 0;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_messages_UserAccountUpdated_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_messages_UserAccountUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.class, com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Builder.class);
    }

    /**
     * Protobuf enum {@code messages.UserAccountUpdated.EventType}
     */
    public enum EventType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>USER_CONFIRMED_ACCOUNT = 1;</code>
       */
      USER_CONFIRMED_ACCOUNT(1),
      /**
       * <code>USER_DELETED_ACCOUNT = 2;</code>
       */
      USER_DELETED_ACCOUNT(2),
      /**
       * <code>USER_DATA_UPDATED = 3;</code>
       */
      USER_DATA_UPDATED(3),
      /**
       * <code>USER_ACCOUNT_DELETED_BY_SYSTEM = 4;</code>
       */
      USER_ACCOUNT_DELETED_BY_SYSTEM(4),
      /**
       * <code>USER_REQUESTED_USERNAME_CHANGE = 5;</code>
       */
      USER_REQUESTED_USERNAME_CHANGE(5),
      /**
       * <code>USER_CONFIRMED_USERNAME_CHANGE = 6;</code>
       */
      USER_CONFIRMED_USERNAME_CHANGE(6),
      /**
       * <code>USER_REQUESTED_PASS_CHANGE = 7;</code>
       */
      USER_REQUESTED_PASS_CHANGE(7),
      /**
       * <code>USER_SET_PASS_RESET = 8;</code>
       */
      USER_SET_PASS_RESET(8),
      /**
       * <code>USER_SET_NEW_PASS_WHEN_LOGGED_IN = 9;</code>
       */
      USER_SET_NEW_PASS_WHEN_LOGGED_IN(9),
      /**
       * <code>UNCONFIRMED_USER_DETAILS_QUERIES = 10;</code>
       */
      UNCONFIRMED_USER_DETAILS_QUERIES(10),
      /**
       * <code>USER_DETAILS_QUERIES_BY_ID = 11;</code>
       */
      USER_DETAILS_QUERIES_BY_ID(11),
      /**
       * <code>USER_DETAILS_QUERIED_BY_USERNAME_BRAND = 12;</code>
       */
      USER_DETAILS_QUERIED_BY_USERNAME_BRAND(12),
      /**
       * <code>USER_CREATED_ACCOUNT = 13;</code>
       */
      USER_CREATED_ACCOUNT(13),
      UNRECOGNIZED(-1),
      ;

      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 27,
          /* patch= */ 1,
          /* suffix= */ "",
          EventType.class.getName());
      }
      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>USER_CONFIRMED_ACCOUNT = 1;</code>
       */
      public static final int USER_CONFIRMED_ACCOUNT_VALUE = 1;
      /**
       * <code>USER_DELETED_ACCOUNT = 2;</code>
       */
      public static final int USER_DELETED_ACCOUNT_VALUE = 2;
      /**
       * <code>USER_DATA_UPDATED = 3;</code>
       */
      public static final int USER_DATA_UPDATED_VALUE = 3;
      /**
       * <code>USER_ACCOUNT_DELETED_BY_SYSTEM = 4;</code>
       */
      public static final int USER_ACCOUNT_DELETED_BY_SYSTEM_VALUE = 4;
      /**
       * <code>USER_REQUESTED_USERNAME_CHANGE = 5;</code>
       */
      public static final int USER_REQUESTED_USERNAME_CHANGE_VALUE = 5;
      /**
       * <code>USER_CONFIRMED_USERNAME_CHANGE = 6;</code>
       */
      public static final int USER_CONFIRMED_USERNAME_CHANGE_VALUE = 6;
      /**
       * <code>USER_REQUESTED_PASS_CHANGE = 7;</code>
       */
      public static final int USER_REQUESTED_PASS_CHANGE_VALUE = 7;
      /**
       * <code>USER_SET_PASS_RESET = 8;</code>
       */
      public static final int USER_SET_PASS_RESET_VALUE = 8;
      /**
       * <code>USER_SET_NEW_PASS_WHEN_LOGGED_IN = 9;</code>
       */
      public static final int USER_SET_NEW_PASS_WHEN_LOGGED_IN_VALUE = 9;
      /**
       * <code>UNCONFIRMED_USER_DETAILS_QUERIES = 10;</code>
       */
      public static final int UNCONFIRMED_USER_DETAILS_QUERIES_VALUE = 10;
      /**
       * <code>USER_DETAILS_QUERIES_BY_ID = 11;</code>
       */
      public static final int USER_DETAILS_QUERIES_BY_ID_VALUE = 11;
      /**
       * <code>USER_DETAILS_QUERIED_BY_USERNAME_BRAND = 12;</code>
       */
      public static final int USER_DETAILS_QUERIED_BY_USERNAME_BRAND_VALUE = 12;
      /**
       * <code>USER_CREATED_ACCOUNT = 13;</code>
       */
      public static final int USER_CREATED_ACCOUNT_VALUE = 13;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static EventType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static EventType forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return USER_CONFIRMED_ACCOUNT;
          case 2: return USER_DELETED_ACCOUNT;
          case 3: return USER_DATA_UPDATED;
          case 4: return USER_ACCOUNT_DELETED_BY_SYSTEM;
          case 5: return USER_REQUESTED_USERNAME_CHANGE;
          case 6: return USER_CONFIRMED_USERNAME_CHANGE;
          case 7: return USER_REQUESTED_PASS_CHANGE;
          case 8: return USER_SET_PASS_RESET;
          case 9: return USER_SET_NEW_PASS_WHEN_LOGGED_IN;
          case 10: return UNCONFIRMED_USER_DETAILS_QUERIES;
          case 11: return USER_DETAILS_QUERIES_BY_ID;
          case 12: return USER_DETAILS_QUERIED_BY_USERNAME_BRAND;
          case 13: return USER_CREATED_ACCOUNT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<EventType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          EventType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
              public EventType findValueByNumber(int number) {
                return EventType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.getDescriptor().getEnumTypes().get(0);
      }

      private static final EventType[] VALUES = values();

      public static EventType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private EventType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:messages.UserAccountUpdated.EventType)
    }

    /**
     * Protobuf enum {@code messages.UserAccountUpdated.Brand}
     */
    public enum Brand
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>VOLVO = 0;</code>
       */
      VOLVO(0),
      /**
       * <code>POLESTAR = 1;</code>
       */
      POLESTAR(1),
      UNRECOGNIZED(-1),
      ;

      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 27,
          /* patch= */ 1,
          /* suffix= */ "",
          Brand.class.getName());
      }
      /**
       * <code>VOLVO = 0;</code>
       */
      public static final int VOLVO_VALUE = 0;
      /**
       * <code>POLESTAR = 1;</code>
       */
      public static final int POLESTAR_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Brand valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Brand forNumber(int value) {
        switch (value) {
          case 0: return VOLVO;
          case 1: return POLESTAR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Brand>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Brand> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Brand>() {
              public Brand findValueByNumber(int number) {
                return Brand.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.getDescriptor().getEnumTypes().get(1);
      }

      private static final Brand[] VALUES = values();

      public static Brand valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Brand(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:messages.UserAccountUpdated.Brand)
    }

    /**
     * Protobuf enum {@code messages.UserAccountUpdated.UsernameType}
     */
    public enum UsernameType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>PHONE = 0;</code>
       */
      PHONE(0),
      /**
       * <code>EMAIL = 1;</code>
       */
      EMAIL(1),
      UNRECOGNIZED(-1),
      ;

      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 27,
          /* patch= */ 1,
          /* suffix= */ "",
          UsernameType.class.getName());
      }
      /**
       * <code>PHONE = 0;</code>
       */
      public static final int PHONE_VALUE = 0;
      /**
       * <code>EMAIL = 1;</code>
       */
      public static final int EMAIL_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static UsernameType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static UsernameType forNumber(int value) {
        switch (value) {
          case 0: return PHONE;
          case 1: return EMAIL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<UsernameType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          UsernameType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<UsernameType>() {
              public UsernameType findValueByNumber(int number) {
                return UsernameType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.getDescriptor().getEnumTypes().get(2);
      }

      private static final UsernameType[] VALUES = values();

      public static UsernameType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private UsernameType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:messages.UserAccountUpdated.UsernameType)
    }

    private int bitField0_;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_ = 0L;
    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int EVENTTYPE_FIELD_NUMBER = 2;
    private int eventType_ = 0;
    /**
     * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
     * @return The enum numeric value on the wire for eventType.
     */
    @java.lang.Override public int getEventTypeValue() {
      return eventType_;
    }
    /**
     * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
     * @return The eventType.
     */
    @java.lang.Override public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType getEventType() {
      com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType result = com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType.forNumber(eventType_);
      return result == null ? com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType.UNRECOGNIZED : result;
    }

    public static final int ID_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object id_ = "";
    /**
     * <code>string id = 3;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>string id = 3;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MARKET_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object market_ = "";
    /**
     * <code>optional string market = 4;</code>
     * @return Whether the market field is set.
     */
    @java.lang.Override
    public boolean hasMarket() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string market = 4;</code>
     * @return The market.
     */
    @java.lang.Override
    public java.lang.String getMarket() {
      java.lang.Object ref = market_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        market_ = s;
        return s;
      }
    }
    /**
     * <code>optional string market = 4;</code>
     * @return The bytes for market.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMarketBytes() {
      java.lang.Object ref = market_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        market_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BRAND_FIELD_NUMBER = 5;
    private int brand_ = 0;
    /**
     * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
     * @return Whether the brand field is set.
     */
    @java.lang.Override public boolean hasBrand() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
     * @return The enum numeric value on the wire for brand.
     */
    @java.lang.Override public int getBrandValue() {
      return brand_;
    }
    /**
     * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
     * @return The brand.
     */
    @java.lang.Override public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand getBrand() {
      com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand result = com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand.forNumber(brand_);
      return result == null ? com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand.UNRECOGNIZED : result;
    }

    public static final int TYPE_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private volatile java.lang.Object type_ = "";
    /**
     * <code>optional string type = 6;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string type = 6;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <code>optional string type = 6;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHANNEL_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private volatile java.lang.Object channel_ = "";
    /**
     * <code>optional string channel = 7;</code>
     * @return Whether the channel field is set.
     */
    @java.lang.Override
    public boolean hasChannel() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string channel = 7;</code>
     * @return The channel.
     */
    @java.lang.Override
    public java.lang.String getChannel() {
      java.lang.Object ref = channel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channel_ = s;
        return s;
      }
    }
    /**
     * <code>optional string channel = 7;</code>
     * @return The bytes for channel.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getChannelBytes() {
      java.lang.Object ref = channel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LANGUAGE_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private volatile java.lang.Object language_ = "";
    /**
     * <code>optional string language = 8;</code>
     * @return Whether the language field is set.
     */
    @java.lang.Override
    public boolean hasLanguage() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional string language = 8;</code>
     * @return The language.
     */
    @java.lang.Override
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      }
    }
    /**
     * <code>optional string language = 8;</code>
     * @return The bytes for language.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAMETYPE_FIELD_NUMBER = 9;
    private int usernameType_ = 0;
    /**
     * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
     * @return Whether the usernameType field is set.
     */
    @java.lang.Override public boolean hasUsernameType() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
     * @return The enum numeric value on the wire for usernameType.
     */
    @java.lang.Override public int getUsernameTypeValue() {
      return usernameType_;
    }
    /**
     * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
     * @return The usernameType.
     */
    @java.lang.Override public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType getUsernameType() {
      com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType result = com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType.forNumber(usernameType_);
      return result == null ? com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (timestamp_ != 0L) {
        output.writeInt64(1, timestamp_);
      }
      if (eventType_ != com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType.UNKNOWN.getNumber()) {
        output.writeEnum(2, eventType_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, id_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, market_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(5, brand_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 6, type_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 7, channel_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 8, language_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeEnum(9, usernameType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      if (eventType_ != com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, eventType_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, id_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, market_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, brand_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(6, type_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(7, channel_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(8, language_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, usernameType_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated)) {
        return super.equals(obj);
      }
      com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated other = (com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated) obj;

      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (eventType_ != other.eventType_) return false;
      if (!getId()
          .equals(other.getId())) return false;
      if (hasMarket() != other.hasMarket()) return false;
      if (hasMarket()) {
        if (!getMarket()
            .equals(other.getMarket())) return false;
      }
      if (hasBrand() != other.hasBrand()) return false;
      if (hasBrand()) {
        if (brand_ != other.brand_) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (!getType()
            .equals(other.getType())) return false;
      }
      if (hasChannel() != other.hasChannel()) return false;
      if (hasChannel()) {
        if (!getChannel()
            .equals(other.getChannel())) return false;
      }
      if (hasLanguage() != other.hasLanguage()) return false;
      if (hasLanguage()) {
        if (!getLanguage()
            .equals(other.getLanguage())) return false;
      }
      if (hasUsernameType() != other.hasUsernameType()) return false;
      if (hasUsernameType()) {
        if (usernameType_ != other.usernameType_) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + EVENTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + eventType_;
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      if (hasMarket()) {
        hash = (37 * hash) + MARKET_FIELD_NUMBER;
        hash = (53 * hash) + getMarket().hashCode();
      }
      if (hasBrand()) {
        hash = (37 * hash) + BRAND_FIELD_NUMBER;
        hash = (53 * hash) + brand_;
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasChannel()) {
        hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
        hash = (53 * hash) + getChannel().hashCode();
      }
      if (hasLanguage()) {
        hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
        hash = (53 * hash) + getLanguage().hashCode();
      }
      if (hasUsernameType()) {
        hash = (37 * hash) + USERNAMETYPE_FIELD_NUMBER;
        hash = (53 * hash) + usernameType_;
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code messages.UserAccountUpdated}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messages.UserAccountUpdated)
        com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdatedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_messages_UserAccountUpdated_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_messages_UserAccountUpdated_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.class, com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Builder.class);
      }

      // Construct using com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        timestamp_ = 0L;
        eventType_ = 0;
        id_ = "";
        market_ = "";
        brand_ = 0;
        type_ = "";
        channel_ = "";
        language_ = "";
        usernameType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_messages_UserAccountUpdated_descriptor;
      }

      @java.lang.Override
      public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      @java.lang.Override
      public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated build() {
        com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated buildPartial() {
        com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated result = new com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timestamp_ = timestamp_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.eventType_ = eventType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.id_ = id_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.market_ = market_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.brand_ = brand_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.type_ = type_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.channel_ = channel_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.language_ = language_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.usernameType_ = usernameType_;
          to_bitField0_ |= 0x00000020;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated) {
          return mergeFrom((com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated other) {
        if (other == getDefaultInstance()) return this;
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.eventType_ != 0) {
          setEventTypeValue(other.getEventTypeValue());
        }
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.hasMarket()) {
          market_ = other.market_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (other.hasBrand()) {
          setBrand(other.getBrand());
        }
        if (other.hasType()) {
          type_ = other.type_;
          bitField0_ |= 0x00000020;
          onChanged();
        }
        if (other.hasChannel()) {
          channel_ = other.channel_;
          bitField0_ |= 0x00000040;
          onChanged();
        }
        if (other.hasLanguage()) {
          language_ = other.language_;
          bitField0_ |= 0x00000080;
          onChanged();
        }
        if (other.hasUsernameType()) {
          setUsernameType(other.getUsernameType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                timestamp_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                eventType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                id_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                market_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 40: {
                brand_ = input.readEnum();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 50: {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000020;
                break;
              } // case 50
              case 58: {
                channel_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000040;
                break;
              } // case 58
              case 66: {
                language_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000080;
                break;
              } // case 66
              case 72: {
                usernameType_ = input.readEnum();
                bitField0_ |= 0x00000100;
                break;
              } // case 72
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 1;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {

        timestamp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private int eventType_ = 0;
      /**
       * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
       * @return The enum numeric value on the wire for eventType.
       */
      @java.lang.Override public int getEventTypeValue() {
        return eventType_;
      }
      /**
       * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
       * @param value The enum numeric value on the wire for eventType to set.
       * @return This builder for chaining.
       */
      public Builder setEventTypeValue(int value) {
        eventType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
       * @return The eventType.
       */
      @java.lang.Override
      public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType getEventType() {
        com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType result = com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType.forNumber(eventType_);
        return result == null ? com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType.UNRECOGNIZED : result;
      }
      /**
       * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
       * @param value The eventType to set.
       * @return This builder for chaining.
       */
      public Builder setEventType(com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.EventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        eventType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.messages.UserAccountUpdated.EventType eventType = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        eventType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>string id = 3;</code>
       * @return The id.
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string id = 3;</code>
       * @return The bytes for id.
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string id = 3;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        id_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        id_ = getDefaultInstance().getId();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string id = 3;</code>
       * @param value The bytes for id to set.
       * @return This builder for chaining.
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        id_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object market_ = "";
      /**
       * <code>optional string market = 4;</code>
       * @return Whether the market field is set.
       */
      public boolean hasMarket() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional string market = 4;</code>
       * @return The market.
       */
      public java.lang.String getMarket() {
        java.lang.Object ref = market_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          market_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string market = 4;</code>
       * @return The bytes for market.
       */
      public com.google.protobuf.ByteString
          getMarketBytes() {
        java.lang.Object ref = market_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          market_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string market = 4;</code>
       * @param value The market to set.
       * @return This builder for chaining.
       */
      public Builder setMarket(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        market_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional string market = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMarket() {
        market_ = getDefaultInstance().getMarket();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>optional string market = 4;</code>
       * @param value The bytes for market to set.
       * @return This builder for chaining.
       */
      public Builder setMarketBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        market_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private int brand_ = 0;
      /**
       * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
       * @return Whether the brand field is set.
       */
      @java.lang.Override public boolean hasBrand() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
       * @return The enum numeric value on the wire for brand.
       */
      @java.lang.Override public int getBrandValue() {
        return brand_;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
       * @param value The enum numeric value on the wire for brand to set.
       * @return This builder for chaining.
       */
      public Builder setBrandValue(int value) {
        brand_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
       * @return The brand.
       */
      @java.lang.Override
      public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand getBrand() {
        com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand result = com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand.forNumber(brand_);
        return result == null ? com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
       * @param value The brand to set.
       * @return This builder for chaining.
       */
      public Builder setBrand(com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.Brand value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        brand_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.Brand brand = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBrand() {
        bitField0_ = (bitField0_ & ~0x00000010);
        brand_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>optional string type = 6;</code>
       * @return Whether the type field is set.
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional string type = 6;</code>
       * @return The type.
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string type = 6;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string type = 6;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        type_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>optional string type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        type_ = getDefaultInstance().getType();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
        return this;
      }
      /**
       * <code>optional string type = 6;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        type_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }

      private java.lang.Object channel_ = "";
      /**
       * <code>optional string channel = 7;</code>
       * @return Whether the channel field is set.
       */
      public boolean hasChannel() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional string channel = 7;</code>
       * @return The channel.
       */
      public java.lang.String getChannel() {
        java.lang.Object ref = channel_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          channel_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string channel = 7;</code>
       * @return The bytes for channel.
       */
      public com.google.protobuf.ByteString
          getChannelBytes() {
        java.lang.Object ref = channel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          channel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string channel = 7;</code>
       * @param value The channel to set.
       * @return This builder for chaining.
       */
      public Builder setChannel(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        channel_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>optional string channel = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannel() {
        channel_ = getDefaultInstance().getChannel();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
        return this;
      }
      /**
       * <code>optional string channel = 7;</code>
       * @param value The bytes for channel to set.
       * @return This builder for chaining.
       */
      public Builder setChannelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        channel_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }

      private java.lang.Object language_ = "";
      /**
       * <code>optional string language = 8;</code>
       * @return Whether the language field is set.
       */
      public boolean hasLanguage() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <code>optional string language = 8;</code>
       * @return The language.
       */
      public java.lang.String getLanguage() {
        java.lang.Object ref = language_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          language_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string language = 8;</code>
       * @return The bytes for language.
       */
      public com.google.protobuf.ByteString
          getLanguageBytes() {
        java.lang.Object ref = language_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          language_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string language = 8;</code>
       * @param value The language to set.
       * @return This builder for chaining.
       */
      public Builder setLanguage(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        language_ = value;
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <code>optional string language = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLanguage() {
        language_ = getDefaultInstance().getLanguage();
        bitField0_ = (bitField0_ & ~0x00000080);
        onChanged();
        return this;
      }
      /**
       * <code>optional string language = 8;</code>
       * @param value The bytes for language to set.
       * @return This builder for chaining.
       */
      public Builder setLanguageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        language_ = value;
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }

      private int usernameType_ = 0;
      /**
       * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
       * @return Whether the usernameType field is set.
       */
      @java.lang.Override public boolean hasUsernameType() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
       * @return The enum numeric value on the wire for usernameType.
       */
      @java.lang.Override public int getUsernameTypeValue() {
        return usernameType_;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
       * @param value The enum numeric value on the wire for usernameType to set.
       * @return This builder for chaining.
       */
      public Builder setUsernameTypeValue(int value) {
        usernameType_ = value;
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
       * @return The usernameType.
       */
      @java.lang.Override
      public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType getUsernameType() {
        com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType result = com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType.forNumber(usernameType_);
        return result == null ? com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
       * @param value The usernameType to set.
       * @return This builder for chaining.
       */
      public Builder setUsernameType(com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated.UsernameType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        usernameType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .messages.UserAccountUpdated.UsernameType usernameType = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsernameType() {
        bitField0_ = (bitField0_ & ~0x00000100);
        usernameType_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:messages.UserAccountUpdated)
    }

    // @@protoc_insertion_point(class_scope:messages.UserAccountUpdated)
    private static final com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated();
    }

    public static com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserAccountUpdated>
        PARSER = new com.google.protobuf.AbstractParser<UserAccountUpdated>() {
      @java.lang.Override
      public UserAccountUpdated parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<UserAccountUpdated> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserAccountUpdated> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_UserAccountUpdated_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_messages_UserAccountUpdated_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user_account.proto\022\010messages\"\220\007\n\022UserA" +
      "ccountUpdated\022\021\n\ttimestamp\030\001 \001(\003\0229\n\teven" +
      "tType\030\002 \001(\0162&.messages.UserAccountUpdate" +
      "d.EventType\022\n\n\002id\030\003 \001(\t\022\023\n\006market\030\004 \001(\tH" +
      "\000\210\001\001\0226\n\005brand\030\005 \001(\0162\".messages.UserAccou" +
      "ntUpdated.BrandH\001\210\001\001\022\021\n\004type\030\006 \001(\tH\002\210\001\001\022" +
      "\024\n\007channel\030\007 \001(\tH\003\210\001\001\022\025\n\010language\030\010 \001(\tH" +
      "\004\210\001\001\022D\n\014usernameType\030\t \001(\0162).messages.Us" +
      "erAccountUpdated.UsernameTypeH\005\210\001\001\"\274\003\n\tE" +
      "ventType\022\013\n\007UNKNOWN\020\000\022\032\n\026USER_CONFIRMED_" +
      "ACCOUNT\020\001\022\030\n\024USER_DELETED_ACCOUNT\020\002\022\025\n\021U" +
      "SER_DATA_UPDATED\020\003\022\"\n\036USER_ACCOUNT_DELET" +
      "ED_BY_SYSTEM\020\004\022\"\n\036USER_REQUESTED_USERNAM" +
      "E_CHANGE\020\005\022\"\n\036USER_CONFIRMED_USERNAME_CH" +
      "ANGE\020\006\022\036\n\032USER_REQUESTED_PASS_CHANGE\020\007\022\027" +
      "\n\023USER_SET_PASS_RESET\020\010\022$\n USER_SET_NEW_" +
      "PASS_WHEN_LOGGED_IN\020\t\022$\n UNCONFIRMED_USE" +
      "R_DETAILS_QUERIES\020\n\022\036\n\032USER_DETAILS_QUER" +
      "IES_BY_ID\020\013\022*\n&USER_DETAILS_QUERIED_BY_U" +
      "SERNAME_BRAND\020\014\022\030\n\024USER_CREATED_ACCOUNT\020" +
      "\r\" \n\005Brand\022\t\n\005VOLVO\020\000\022\014\n\010POLESTAR\020\001\"$\n\014U" +
      "sernameType\022\t\n\005PHONE\020\000\022\t\n\005EMAIL\020\001B\t\n\007_ma" +
      "rketB\010\n\006_brandB\007\n\005_typeB\n\n\010_channelB\013\n\t_" +
      "languageB\017\n\r_usernameTypeBE\n6com.volvoca" +
      "rs.conncar.connectivityinsight.proto.eve" +
      "ntsB\013UserAccountb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_messages_UserAccountUpdated_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_UserAccountUpdated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_messages_UserAccountUpdated_descriptor,
        new java.lang.String[] { "Timestamp", "EventType", "Id", "Market", "Brand", "Type", "Channel", "Language", "UsernameType", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
