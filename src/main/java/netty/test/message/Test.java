// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package netty.test.message;

/**
 * Protobuf type {@code Test}
 */
public final class Test extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Test)
    TestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Test.newBuilder() to construct.
  private Test(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Test() {
    name_ = "";
    enu_ = 0;
    bs_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Test();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Test(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 16: {

            sex_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 37: {

            floatTest_ = input.readFloat();
            break;
          }
          case 41: {

            doubleTest_ = input.readDouble();
            break;
          }
          case 50: {
            netty.test.message.Student.Builder subBuilder = null;
            if (stu_ != null) {
              subBuilder = stu_.toBuilder();
            }
            stu_ = input.readMessage(netty.test.message.Student.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stu_);
              stu_ = subBuilder.buildPartial();
            }

            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            enu_ = rawValue;
            break;
          }
          case 72: {

            flag_ = input.readBool();
            break;
          }
          case 82: {

            bs_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return netty.test.message.TestProto.internal_static_Test_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return netty.test.message.TestProto.internal_static_Test_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            netty.test.message.Test.class, netty.test.message.Test.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <pre>
   * long类型
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int SEX_FIELD_NUMBER = 2;
  private int sex_;
  /**
   * <pre>
   * int类型
   * </pre>
   *
   * <code>int32 sex = 2;</code>
   * @return The sex.
   */
  @java.lang.Override
  public int getSex() {
    return sex_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * 字符串类型
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 字符串类型
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLOATTEST_FIELD_NUMBER = 4;
  private float floatTest_;
  /**
   * <pre>
   * float类型
   * </pre>
   *
   * <code>float floatTest = 4;</code>
   * @return The floatTest.
   */
  @java.lang.Override
  public float getFloatTest() {
    return floatTest_;
  }

  public static final int DOUBLETEST_FIELD_NUMBER = 5;
  private double doubleTest_;
  /**
   * <pre>
   * double类型
   * </pre>
   *
   * <code>double doubleTest = 5;</code>
   * @return The doubleTest.
   */
  @java.lang.Override
  public double getDoubleTest() {
    return doubleTest_;
  }

  public static final int STU_FIELD_NUMBER = 6;
  private netty.test.message.Student stu_;
  /**
   * <pre>
   * 自定义类型
   * </pre>
   *
   * <code>.Student stu = 6;</code>
   * @return Whether the stu field is set.
   */
  @java.lang.Override
  public boolean hasStu() {
    return stu_ != null;
  }
  /**
   * <pre>
   * 自定义类型
   * </pre>
   *
   * <code>.Student stu = 6;</code>
   * @return The stu.
   */
  @java.lang.Override
  public netty.test.message.Student getStu() {
    return stu_ == null ? netty.test.message.Student.getDefaultInstance() : stu_;
  }
  /**
   * <pre>
   * 自定义类型
   * </pre>
   *
   * <code>.Student stu = 6;</code>
   */
  @java.lang.Override
  public netty.test.message.StudentOrBuilder getStuOrBuilder() {
    return getStu();
  }

  public static final int ENU_FIELD_NUMBER = 7;
  private int enu_;
  /**
   * <pre>
   * 枚举类型
   * </pre>
   *
   * <code>.EnumTest enu = 7;</code>
   * @return The enum numeric value on the wire for enu.
   */
  @java.lang.Override public int getEnuValue() {
    return enu_;
  }
  /**
   * <pre>
   * 枚举类型
   * </pre>
   *
   * <code>.EnumTest enu = 7;</code>
   * @return The enu.
   */
  @java.lang.Override public netty.test.message.EnumTest getEnu() {
    @SuppressWarnings("deprecation")
    netty.test.message.EnumTest result = netty.test.message.EnumTest.valueOf(enu_);
    return result == null ? netty.test.message.EnumTest.UNRECOGNIZED : result;
  }

  public static final int FLAG_FIELD_NUMBER = 9;
  private boolean flag_;
  /**
   * <pre>
   * boolean类型
   * </pre>
   *
   * <code>bool flag = 9;</code>
   * @return The flag.
   */
  @java.lang.Override
  public boolean getFlag() {
    return flag_;
  }

  public static final int BS_FIELD_NUMBER = 10;
  private com.google.protobuf.ByteString bs_;
  /**
   * <pre>
   * byteString类型
   * </pre>
   *
   * <code>bytes bs = 10;</code>
   * @return The bs.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBs() {
    return bs_;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (sex_ != 0) {
      output.writeInt32(2, sex_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (floatTest_ != 0F) {
      output.writeFloat(4, floatTest_);
    }
    if (doubleTest_ != 0D) {
      output.writeDouble(5, doubleTest_);
    }
    if (stu_ != null) {
      output.writeMessage(6, getStu());
    }
    if (enu_ != netty.test.message.EnumTest.ZERO.getNumber()) {
      output.writeEnum(7, enu_);
    }
    if (flag_ != false) {
      output.writeBool(9, flag_);
    }
    if (!bs_.isEmpty()) {
      output.writeBytes(10, bs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (sex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sex_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (floatTest_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, floatTest_);
    }
    if (doubleTest_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, doubleTest_);
    }
    if (stu_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getStu());
    }
    if (enu_ != netty.test.message.EnumTest.ZERO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, enu_);
    }
    if (flag_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, flag_);
    }
    if (!bs_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(10, bs_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof netty.test.message.Test)) {
      return super.equals(obj);
    }
    netty.test.message.Test other = (netty.test.message.Test) obj;

    if (getId()
        != other.getId()) return false;
    if (getSex()
        != other.getSex()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (java.lang.Float.floatToIntBits(getFloatTest())
        != java.lang.Float.floatToIntBits(
            other.getFloatTest())) return false;
    if (java.lang.Double.doubleToLongBits(getDoubleTest())
        != java.lang.Double.doubleToLongBits(
            other.getDoubleTest())) return false;
    if (hasStu() != other.hasStu()) return false;
    if (hasStu()) {
      if (!getStu()
          .equals(other.getStu())) return false;
    }
    if (enu_ != other.enu_) return false;
    if (getFlag()
        != other.getFlag()) return false;
    if (!getBs()
        .equals(other.getBs())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + SEX_FIELD_NUMBER;
    hash = (53 * hash) + getSex();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FLOATTEST_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFloatTest());
    hash = (37 * hash) + DOUBLETEST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDoubleTest()));
    if (hasStu()) {
      hash = (37 * hash) + STU_FIELD_NUMBER;
      hash = (53 * hash) + getStu().hashCode();
    }
    hash = (37 * hash) + ENU_FIELD_NUMBER;
    hash = (53 * hash) + enu_;
    hash = (37 * hash) + FLAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFlag());
    hash = (37 * hash) + BS_FIELD_NUMBER;
    hash = (53 * hash) + getBs().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static netty.test.message.Test parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static netty.test.message.Test parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static netty.test.message.Test parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static netty.test.message.Test parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static netty.test.message.Test parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static netty.test.message.Test parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static netty.test.message.Test parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static netty.test.message.Test parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static netty.test.message.Test parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static netty.test.message.Test parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static netty.test.message.Test parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static netty.test.message.Test parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(netty.test.message.Test prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Test}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Test)
      netty.test.message.TestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return netty.test.message.TestProto.internal_static_Test_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return netty.test.message.TestProto.internal_static_Test_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              netty.test.message.Test.class, netty.test.message.Test.Builder.class);
    }

    // Construct using netty.test.message.Test.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      sex_ = 0;

      name_ = "";

      floatTest_ = 0F;

      doubleTest_ = 0D;

      if (stuBuilder_ == null) {
        stu_ = null;
      } else {
        stu_ = null;
        stuBuilder_ = null;
      }
      enu_ = 0;

      flag_ = false;

      bs_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return netty.test.message.TestProto.internal_static_Test_descriptor;
    }

    @java.lang.Override
    public netty.test.message.Test getDefaultInstanceForType() {
      return netty.test.message.Test.getDefaultInstance();
    }

    @java.lang.Override
    public netty.test.message.Test build() {
      netty.test.message.Test result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public netty.test.message.Test buildPartial() {
      netty.test.message.Test result = new netty.test.message.Test(this);
      result.id_ = id_;
      result.sex_ = sex_;
      result.name_ = name_;
      result.floatTest_ = floatTest_;
      result.doubleTest_ = doubleTest_;
      if (stuBuilder_ == null) {
        result.stu_ = stu_;
      } else {
        result.stu_ = stuBuilder_.build();
      }
      result.enu_ = enu_;
      result.flag_ = flag_;
      result.bs_ = bs_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof netty.test.message.Test) {
        return mergeFrom((netty.test.message.Test)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(netty.test.message.Test other) {
      if (other == netty.test.message.Test.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getSex() != 0) {
        setSex(other.getSex());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getFloatTest() != 0F) {
        setFloatTest(other.getFloatTest());
      }
      if (other.getDoubleTest() != 0D) {
        setDoubleTest(other.getDoubleTest());
      }
      if (other.hasStu()) {
        mergeStu(other.getStu());
      }
      if (other.enu_ != 0) {
        setEnuValue(other.getEnuValue());
      }
      if (other.getFlag() != false) {
        setFlag(other.getFlag());
      }
      if (other.getBs() != com.google.protobuf.ByteString.EMPTY) {
        setBs(other.getBs());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      netty.test.message.Test parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (netty.test.message.Test) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * long类型
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * long类型
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * long类型
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private int sex_ ;
    /**
     * <pre>
     * int类型
     * </pre>
     *
     * <code>int32 sex = 2;</code>
     * @return The sex.
     */
    @java.lang.Override
    public int getSex() {
      return sex_;
    }
    /**
     * <pre>
     * int类型
     * </pre>
     *
     * <code>int32 sex = 2;</code>
     * @param value The sex to set.
     * @return This builder for chaining.
     */
    public Builder setSex(int value) {
      
      sex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * int类型
     * </pre>
     *
     * <code>int32 sex = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSex() {
      
      sex_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 字符串类型
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 字符串类型
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 字符串类型
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字符串类型
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字符串类型
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private float floatTest_ ;
    /**
     * <pre>
     * float类型
     * </pre>
     *
     * <code>float floatTest = 4;</code>
     * @return The floatTest.
     */
    @java.lang.Override
    public float getFloatTest() {
      return floatTest_;
    }
    /**
     * <pre>
     * float类型
     * </pre>
     *
     * <code>float floatTest = 4;</code>
     * @param value The floatTest to set.
     * @return This builder for chaining.
     */
    public Builder setFloatTest(float value) {
      
      floatTest_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * float类型
     * </pre>
     *
     * <code>float floatTest = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFloatTest() {
      
      floatTest_ = 0F;
      onChanged();
      return this;
    }

    private double doubleTest_ ;
    /**
     * <pre>
     * double类型
     * </pre>
     *
     * <code>double doubleTest = 5;</code>
     * @return The doubleTest.
     */
    @java.lang.Override
    public double getDoubleTest() {
      return doubleTest_;
    }
    /**
     * <pre>
     * double类型
     * </pre>
     *
     * <code>double doubleTest = 5;</code>
     * @param value The doubleTest to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleTest(double value) {
      
      doubleTest_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * double类型
     * </pre>
     *
     * <code>double doubleTest = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleTest() {
      
      doubleTest_ = 0D;
      onChanged();
      return this;
    }

    private netty.test.message.Student stu_;
    private com.google.protobuf.SingleFieldBuilderV3<
        netty.test.message.Student, netty.test.message.Student.Builder, netty.test.message.StudentOrBuilder> stuBuilder_;
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     * @return Whether the stu field is set.
     */
    public boolean hasStu() {
      return stuBuilder_ != null || stu_ != null;
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     * @return The stu.
     */
    public netty.test.message.Student getStu() {
      if (stuBuilder_ == null) {
        return stu_ == null ? netty.test.message.Student.getDefaultInstance() : stu_;
      } else {
        return stuBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     */
    public Builder setStu(netty.test.message.Student value) {
      if (stuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stu_ = value;
        onChanged();
      } else {
        stuBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     */
    public Builder setStu(
        netty.test.message.Student.Builder builderForValue) {
      if (stuBuilder_ == null) {
        stu_ = builderForValue.build();
        onChanged();
      } else {
        stuBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     */
    public Builder mergeStu(netty.test.message.Student value) {
      if (stuBuilder_ == null) {
        if (stu_ != null) {
          stu_ =
            netty.test.message.Student.newBuilder(stu_).mergeFrom(value).buildPartial();
        } else {
          stu_ = value;
        }
        onChanged();
      } else {
        stuBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     */
    public Builder clearStu() {
      if (stuBuilder_ == null) {
        stu_ = null;
        onChanged();
      } else {
        stu_ = null;
        stuBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     */
    public netty.test.message.Student.Builder getStuBuilder() {
      
      onChanged();
      return getStuFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     */
    public netty.test.message.StudentOrBuilder getStuOrBuilder() {
      if (stuBuilder_ != null) {
        return stuBuilder_.getMessageOrBuilder();
      } else {
        return stu_ == null ?
            netty.test.message.Student.getDefaultInstance() : stu_;
      }
    }
    /**
     * <pre>
     * 自定义类型
     * </pre>
     *
     * <code>.Student stu = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        netty.test.message.Student, netty.test.message.Student.Builder, netty.test.message.StudentOrBuilder> 
        getStuFieldBuilder() {
      if (stuBuilder_ == null) {
        stuBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            netty.test.message.Student, netty.test.message.Student.Builder, netty.test.message.StudentOrBuilder>(
                getStu(),
                getParentForChildren(),
                isClean());
        stu_ = null;
      }
      return stuBuilder_;
    }

    private int enu_ = 0;
    /**
     * <pre>
     * 枚举类型
     * </pre>
     *
     * <code>.EnumTest enu = 7;</code>
     * @return The enum numeric value on the wire for enu.
     */
    @java.lang.Override public int getEnuValue() {
      return enu_;
    }
    /**
     * <pre>
     * 枚举类型
     * </pre>
     *
     * <code>.EnumTest enu = 7;</code>
     * @param value The enum numeric value on the wire for enu to set.
     * @return This builder for chaining.
     */
    public Builder setEnuValue(int value) {
      
      enu_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 枚举类型
     * </pre>
     *
     * <code>.EnumTest enu = 7;</code>
     * @return The enu.
     */
    @java.lang.Override
    public netty.test.message.EnumTest getEnu() {
      @SuppressWarnings("deprecation")
      netty.test.message.EnumTest result = netty.test.message.EnumTest.valueOf(enu_);
      return result == null ? netty.test.message.EnumTest.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 枚举类型
     * </pre>
     *
     * <code>.EnumTest enu = 7;</code>
     * @param value The enu to set.
     * @return This builder for chaining.
     */
    public Builder setEnu(netty.test.message.EnumTest value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      enu_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 枚举类型
     * </pre>
     *
     * <code>.EnumTest enu = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnu() {
      
      enu_ = 0;
      onChanged();
      return this;
    }

    private boolean flag_ ;
    /**
     * <pre>
     * boolean类型
     * </pre>
     *
     * <code>bool flag = 9;</code>
     * @return The flag.
     */
    @java.lang.Override
    public boolean getFlag() {
      return flag_;
    }
    /**
     * <pre>
     * boolean类型
     * </pre>
     *
     * <code>bool flag = 9;</code>
     * @param value The flag to set.
     * @return This builder for chaining.
     */
    public Builder setFlag(boolean value) {
      
      flag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * boolean类型
     * </pre>
     *
     * <code>bool flag = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlag() {
      
      flag_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString bs_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * byteString类型
     * </pre>
     *
     * <code>bytes bs = 10;</code>
     * @return The bs.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBs() {
      return bs_;
    }
    /**
     * <pre>
     * byteString类型
     * </pre>
     *
     * <code>bytes bs = 10;</code>
     * @param value The bs to set.
     * @return This builder for chaining.
     */
    public Builder setBs(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * byteString类型
     * </pre>
     *
     * <code>bytes bs = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearBs() {
      
      bs_ = getDefaultInstance().getBs();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Test)
  }

  // @@protoc_insertion_point(class_scope:Test)
  private static final netty.test.message.Test DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new netty.test.message.Test();
  }

  public static netty.test.message.Test getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Test>
      PARSER = new com.google.protobuf.AbstractParser<Test>() {
    @java.lang.Override
    public Test parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Test(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Test> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Test> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public netty.test.message.Test getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
