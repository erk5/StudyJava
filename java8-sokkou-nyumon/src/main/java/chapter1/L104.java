package chapter1;

/**
 * リスト1.4.<br>
 * int型の変数の下3ビットを取り出す.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L104 {

    private static int x;

    public L104() {
        x = 1234; // 10進数"1234"は2進数で表すと"10011010010"
        check(x); // 下3ビットは"010"のため、標準出力には10進数の"2"と表示される
        x = 123456789; // 10進数"1234"は2進数で表すと"111010110111100110100010101"
        check(x); // 下3ビットは"101"のため、標準出力には10進数の"5"と表示される
    }

    private void check(int x) {
        x = x & 7;
        System.out.println(x);
    }

    public static void main(String[] args) {
        new L104();
    }

    /*
     * 【補足】
     * ビットAND演算とは演算するビットが両方とも1であった場合に1を返す演算方法.
     */

}
