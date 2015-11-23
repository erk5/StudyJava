package chapter1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * リスト1.29.<br>
 * ファイルの読み込み.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L129 {

    public L129() {
        List<String> contents = readFile(ClassLoader.getSystemResource("test.txt").getPath());
        contents.forEach(System.out::println);
    }

    List<String> readFile(String filename) {
        BufferedReader reader = null;
        List<String> contents = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(filename));

            // 1行読み込んでcontentsに追加する
            for (; ; ) {
                String line = reader.readLine();

                if (line == null) {
                    break;
                } else {
                    contents.add(line);
                }
            }

        } catch (IOException ex) {
            // 例外処理
        } finally {
            // クローズ処理
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                }
            }
        }

        return contents;
    }

    public static void main(String[] args) {
        new L129();
    }

}
