package chapter1;

/**
 * リスト1.7.<br>
 * 一千万より大きいかどうかを調べる.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L107 {

    private static int y = 1234;

    public L107() {
        y = 1234;
        check(y);
        y = 123456789;
        check(y);
    }

    private void check(int y) {
        if (y > 10000000) {
            // 一千万より大きい場合の処理
            System.out.println("一千万より大きい.");
        } else {
            // 一千万以下の場合
            System.out.println("一千万より小さい.");
        }
    }

    public static void main(String[] args) {
        new L107();
    }

}
