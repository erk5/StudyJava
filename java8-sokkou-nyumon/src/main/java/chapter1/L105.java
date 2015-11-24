package chapter1;

/**
 * リスト1.5.<br>
 * 2進数リテラルの使用例.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L105 {

    private static int x;

    public L105() {
        x = 1234; // 10進数"1234"は2進数で表すと"10011010010"
        check(x); // 下3ビットは"010"のため、標準出力には10進数の"2"と表示される
        x = 123456789; // 10進数"1234"は2進数で表すと"111010110111100110100010101"
        check(x); // 下3ビットは"101"のため、標準出力には10進数の"5"と表示される
    }

    private void check(int x) {
        x = x & 0b111;
        System.out.println(x);
    }

    public static void main(String[] args) {
        new L105();
    }

}
