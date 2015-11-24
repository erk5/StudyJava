package chapter1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * リスト1.12.<br>
 * リフレクションでインスタンス生成.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L112 {

    private static Logger logger = Logger.getLogger("L112");
    private static String className;

    public L112() {
        className = "java.lang.String";
        createInstance(className);
        className = "String";
        createInstance(className); // 存在しないクラスのためClassNotFoundExceptionが発生
        className = "java.lang.Runnable";
        createInstance(className); // インタフェースのためInstantiationExceptionが発生
        className = "java.lang.Void";
        createInstance(className); // 存在するクラスだがコンストラクタがないためIllegalAccessExceptionが発生
    }

    private <T> T createInstance(String className) {
        try {
            Class cls = Class.forName(className);
            return (T) cls.newInstance();
        } catch (ClassNotFoundException ex) {
            logger.log(Level.SEVERE, "インスタンス生成失敗", ex);
        } catch (InstantiationException ex) {
            logger.log(Level.SEVERE, "インスタンス生成失敗", ex);
        } catch (IllegalAccessException ex) {
            logger.log(Level.SEVERE, "インスタンス生成失敗", ex);
        }
        return null;
    }

    public static void main(String[] args) {
        new L112();
    }

}
