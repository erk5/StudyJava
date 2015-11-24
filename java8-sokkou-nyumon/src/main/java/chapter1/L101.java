package chapter1;

/**
 * リスト1.1.<br>
 * 文字列で条件分岐をさせる.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L101 {

    private static String text;

    public L101() {
        text = "Java SE";
        check(text);
        text = "Java";
        check(text);
    }

    private void check(String text) {
        if (text.equals("Java SE")) {
            // textがJava SEだった場合の処理
            System.out.println("Java SE!!");
        } else if (text.equals("Java EE")) {
            // textがJava EEだった場合の処理
            System.out.println("Java EE!!");
        } else if (text.equals("JavaFX")) {
            // textがJavaFXだった場合の処理
            System.out.println("JavaFX!!");
        } else {
            // それ以外の場合の処理
            System.out.println("non-Java");
        }
    }

    public static void main(String[] args) {
        new L101();
    }

}
