// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test1.proto

package netty.test.message.test;

public final class TestProto {
  private TestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Test1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Test1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013test1.proto\"!\n\005Test1\022\013\n\003aaa\030\001 \001(\005\022\013\n\003b" +
      "bb\030\002 \001(\003B&\n\027netty.test.message.testB\tTes" +
      "tProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Test1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Test1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Test1_descriptor,
        new java.lang.String[] { "Aaa", "Bbb", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
