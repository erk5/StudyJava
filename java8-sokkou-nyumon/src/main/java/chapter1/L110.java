package chapter1;

/**
 * リスト1.10.<br>
 * 2進数リテラルに区切り文字を使用する.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L110 {

    private static int x;

    public L110() {
        x = 1234;
        check(x);
        x = 123456;
        check(x);
    }

    private void check(int x) {
        // 10ビット目が1か0なのかを調べる
        if ((x & 0b10_0000_0000) != 0) {
            // 10ビット目が1の場合の処理
            System.out.println("10ビット目は1です.");
        } else {
            // 10ビット目が0の場合の処理
            System.out.println("10ビット目は1ではありません.");
        }
    }

    public static void main(String[] args) {
        new L110();
    }

}
