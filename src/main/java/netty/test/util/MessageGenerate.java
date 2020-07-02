package netty.test.util;

import java.io.*;

/**
 * 协议生成文件
 */
public class MessageGenerate {
    private static final String PROTO_PATH = "./protobuf";
    private static final String OUT_PATH = "./src/main/java";
    private static final String DELETE_PATH = OUT_PATH + "/netty/test/message";
    private static final String CMD = "protoc --proto_path=%s  --java_out=%s %s";

    public static void main(String[] args) throws IOException, InterruptedException {
        FileUtil.deleteFile(new File(DELETE_PATH));
        File protoFile = new File(PROTO_PATH);
        generate(protoFile);
    }

    private static void generate(File file) throws IOException, InterruptedException {
        if (file.isFile() && file.getName().endsWith(".proto")) {
            String cmd = String.format(CMD, PROTO_PATH, OUT_PATH, file.getPath());
//            System.out.println(cmd);
            Process p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
            InputStream inputStream;
            if (p.getErrorStream().available() > 0) {
                // 错误信息
                inputStream = p.getErrorStream();
            } else {
                // info信息
                if (p.getInputStream().available() == 0) {
                    System.out.println(file.getPath() + "   生成协议类成功");
                    return;
                } else {
                    inputStream = p.getInputStream();
                }
            }

            try (InputStreamReader streamReader = new InputStreamReader(inputStream);
                 BufferedReader reader = new BufferedReader(streamReader);) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } else if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                generate(f);
            }
        }
    }
}
