package chapter1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * リスト1.31.<br>
 * try-with-resource構文を使用したファイルの読み込み.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L131 {

    public L131() {
        List<String> contents = readFile(ClassLoader.getSystemResource("test.txt").getPath());
        contents.forEach(System.out::println);
    }

    private List<String> readFile(String filename) {
        List<String> contents = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
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
            Logger.getGlobal().log(Level.SEVERE, "ファイルが開けませんでした", ex);
        }

        return contents;
    }

    public static void main(String[] args) {
        new L131();
    }

}
