package chapter1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * リスト1.15.<br>
 * ファイル読み込みのコード.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L115 {

    private static Logger logger = Logger.getLogger("L115");
    private static String filename;

    public L115() {
        filename = ClassLoader.getSystemResource("test.txt").getPath();
        readFile(filename);
        filename = "test.txt";
        readFile(filename); // 存在しないファイルためFileNotFoundExceptionが発生
        // IOExceptionは発生させるのが難しいため割愛
    }

    private void readFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();

            // 他の処理

        } catch (FileNotFoundException ex) {
            logger.log(Level.SEVERE, "読み込みに失敗しました", ex);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "読み込みに失敗しました", ex);
        }
    }

    public static void main(String[] args) {
        new L115();
    }

}
