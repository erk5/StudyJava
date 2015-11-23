package chapter1;

/**
 * リスト1.2.<br>
 * switch文での文字列の使用例.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L102 {

    private static String text = "Java SE";

    public L102() {
        text = "Java SE";
        check(text);
        text = "Java";
        check(text);
    }

    private void check(String text) {
        switch (text) {
            case "Java SE":
                // textがJava SEだった場合の処理
                System.out.println("Java SE!!");
                break;
            case "Java EE":
                // textがJava EEだった場合の処理
                System.out.println("Java EE!!");
                break;
            case "JavaFX":
                // textがJavaFXだった場合の処理
                System.out.println("JavaFX!!");
                break;
            default:
                // それ以外の場合の処理
                System.out.println("non-Java");
        }
    }

    public static void main(String[] args) {
        new L102();
    }

}
