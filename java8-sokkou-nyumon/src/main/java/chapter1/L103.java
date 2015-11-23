package chapter1;

/**
 * リスト1.2.<br>
 * NullPointerException例外がスローされてしまう例.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L103 {

    private static String text;

    public L103() {
        check(text);
    }

    private void check(String text) {
        switch (text) { // textは初期化されていないため、暗黙の初期値NULLが代入されているためここてヌルポが発生する
            case "A":
                System.out.println("A!!");
                break;
            case "B":
                System.out.println("B!!");
                break;
            default:
                System.out.println("other");
        }
    }

    public static void main(String[] args) {
        new L103();
    }

}
