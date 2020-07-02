# NettyProtobuf

## protobuf介绍
protobuf是google的一个开源项目，是一种网络协议，可以用来进行高效的网络通信

### protobuf支持的基础类型及其对应

| proto类型  | java类型       |
| ------ | ---------- |
| Double | double     |
| float  | float      |
| int32  | Int        |
| Int64  | Long       |
| bool   | boolean    |
| string | String     |
| Bytes  | ByteString |

### Protobuf消息定义

消息定义如下：

```
syntax = "proto3";
// 输出到哪个包中
option java_package = "netty.test.message";
// 输出文件名
option java_outer_classname = "TestProto";
// 是否每个message一个文件，默认为false
option java_multiple_files = true;
 
message Student {
    int32 id = 1;
    string name = 2;
}

enum EnumTest {
    ZERO = 0;
    ONE = 1;
}

message Test {
    int64 id = 1;           	// long类型
    int32 sex = 2;          	// int类型
    string name = 3;        	// 字符串类型
    float floatTest = 4;    	// float类型
    double doubleTest = 5;  	// double类型
    repeated Student stu = 6;   // Student集合
    EnumTest enu = 7;       	// 枚举类型
    bool flag = 9;          	// boolean类型
    bytes bs = 10;          	// byteString类型
}
```

性能对比：
和json格式化对比，查看Compare运行效果

## netty
Netty 是一个利用 Java 的高级网络的能力，隐藏其背后的复杂性而提供一个易于使用的 API 的客户端/服务器框架。提供了便于开发的BIO，BIO，NIO的实现方式。同时提供了零copy技术，省去了网络数据从内核态转换为应用态的过程。

注意handler顺序
* IdleStateHandler
    - 心跳检查handler
* HeartBeartHandler
    - 心跳handler，拦截心跳消息
* LengthFieldBasedFrameDecoder
    - 消息预处理，处理成一个完整的消息
* MessageEncoder
    - 消息编码
* MessageDecoder
    - 消息解码
* CustomChannelHandler
    - 自定义处理，转移消息到线程池处理，同时可以扩展负责客户端连接和下线功能


### 注意网络字节序
简单来讲就是数据转成byte数组的顺序
* 大端字节序（Big Endian）：最高有效位存于最低内存地址处，最低有效位存于最高内存处；
* 小端字节序（Little Endian）：最高有效位存于最高内存地址，最低有效位存于最低内存处。

java写入文件时默认使用的是大端字节序

示例：

```
int i = 1;
```

i转换成byte数组后

* 大端字节序 [1,0,0,0]
* 小端字节序 [0,0,0,1]