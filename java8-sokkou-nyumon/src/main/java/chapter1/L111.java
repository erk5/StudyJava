package chapter1;

/**
 * リスト1.11.<br>
 * 10進数リテラルに区切り文字を使用する.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L111 {

    private static int y = 1234;

    public L111() {
        y = 1234;
        check(y);
        y = 123456789;
        check(y);
    }

    private void check(int y) {
        if (y > 10_000_000) {
            // 一千万より大きい場合の処理
            System.out.println("一千万より大きい.");
        } else {
            // 一千万以下の場合
            System.out.println("一千万より小さい.");
        }
    }

    public static void main(String[] args) {
        new L111();
    }

}
