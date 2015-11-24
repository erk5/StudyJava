package chapter1;

/**
 * リスト1.6.<br>
 * 2進数リテラルで10ビット目が1かどうかを調べる.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L106 {

    private static int x;

    public L106() {
        x = 1234;
        check(x);
        x = 123456;
        check(x);
    }

    private void check(int x) {
        // 10ビット目が1か0なのかを調べる
        if ((x & 0b1000000000) != 0) {
            // 10ビット目が1の場合の処理
            System.out.println("10ビット目は1です.");
        } else {
            // 10ビット目が0の場合の処理
            System.out.println("10ビット目は1ではありません.");
        }
    }

    public static void main(String[] args) {
        new L106();
    }

}
