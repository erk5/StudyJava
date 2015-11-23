package chapter1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * リスト1.32.<br>
 * 複数リソースの自動クローズ.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L132 {

    private static final int BUFFER_SIZE = 1_000;

    public L132() {
        try {
            System.out.println(ClassLoader.getSystemResource("test.txt").getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
        copy(ClassLoader.getSystemResource("test.txt").getPath(), "java8-sokkou-nyumon/target/test2.txt");
    }

    private void copy(String srcfile, String destfile) {
        try (BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(srcfile));
             BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(destfile))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            for (;;) {
                // lengthバイト読み込んで、それを書き込む
                int length = inStream.read(buffer);
                if (length != -1) {
                    outStream.write(buffer, 0, length);
                } else {
                    break;
                }
            }
        } catch (IOException ex) {
            // 例外処理
            Logger.getGlobal().log(Level.SEVERE, "ファイルがコピーできませんでした", ex);
        }
    }

    public static void main(String[] args) {
        new L132();
    }

}
