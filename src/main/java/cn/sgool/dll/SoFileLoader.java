package cn.sgool.dll;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: Dong Shufeng
 * Date: 13-7-10
 */
public class SoFileLoader {

    public static final String systemType = System.getProperty("os.name");
    public static boolean isLoaded = false;

    public static void loadSoFiles() {
        if (isLoaded)
            return;
        try {
            isLoaded = true;
            if (systemType.toLowerCase().contains("win")) {
                //系统库
                writeSoFile("/win32/FanixJNI.dll", "FanixJNI.dll");
                writeSoFile("/win32/fxClassifyDLL.dll", "fxClassifyDLL.dll");
                writeSoFile("/win32/fxSelectBattInfo.dll", "fxSelectBattInfo.dll");
                writeSoFile("/win32/fxUpFreeTray.dll", "fxUpFreeTray.dll");
                writeSoFile("/win32/LoginDLL.dll", "LoginDLL.dll");

                //SuperLU库
                //writeSoFile("/win32/libsuperlu_4.3.a", "libsuperlu_4.3.a");

                //加载
                loadLib("/win32/FanixJNI.dll", "FanixJNI.dll");
                loadLib("/win32/fxClassifyDLL.dll", "fxClassifyDLL.dll");
                loadLib("/win32/fxSelectBattInfo.dll", "fxSelectBattInfo.dll");
                loadLib("/win32/fxUpFreeTray.dll", "fxUpFreeTray.dll");
                loadLib("/win32/LoginDLL.dll", "LoginDLL.dll");
            } else if (systemType.toLowerCase().contains("linux")) {
                //在Linux下要求所有.so文件都放在LD_LIBRARY_PATH能够找到的地方
                System.loadLibrary("jpscpu");
            }
        } catch (Exception e) {
            isLoaded = false;
            System.err.println("load jni error!");
        }
    }

    private static void loadLib(String libFullName, String simpleName) throws IOException {
        File f = writeSoFile(libFullName, simpleName);
        System.load(f.toString());
    }

    private static File writeSoFile(String libFullName, String simpleName) throws IOException {
        String nativeTempDir = System.getProperty("user.dir");

        InputStream in = null;
        BufferedInputStream reader;
        FileOutputStream writer = null;

        File extractedLibFile = new File(nativeTempDir + File.separator + simpleName);
        if (!extractedLibFile.exists()) {
            try {
                in = SoFileLoader.class.getResourceAsStream(libFullName);
                if (in == null)
                    in = SoFileLoader.class.getResourceAsStream(libFullName);
                SoFileLoader.class.getResource(libFullName);
                reader = new BufferedInputStream(in);
                writer = new FileOutputStream(extractedLibFile);

                byte[] buffer = new byte[1024];

                while (reader.read(buffer) > 0) {
                    writer.write(buffer);
                    buffer = new byte[1024];
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null)
                    in.close();
                if (writer != null)
                    writer.close();
            }
        }
        extractedLibFile.deleteOnExit();
        return extractedLibFile;
    }
}
