package chapter1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * リスト1.18.<br>
 * Exception例外でキャッチして再スロー.<br>
 * Created by Eriko on 2015/11/23.
 */
public class L118 {

    private static Logger logger = Logger.getLogger("L118");
    private static String className;

    public L118() {
        className = "java.lang.String";
        try {
            createInstance(className);
        } catch (IllegalAccessException | InstantiationException ex) {
            logger.log(Level.SEVERE, "インスタンス生成失敗", ex);
        }

        className = "String";
        try {
            createInstance(className); // 存在しないクラスのためClassNotFoundExceptionが発生
        } catch (IllegalAccessException | InstantiationException ex) {
            logger.log(Level.SEVERE, "インスタンス生成失敗", ex);
        }

        className = "java.lang.Runnable";
        try {
            createInstance(className); // インタフェースのためInstantiationExceptionが発生
        } catch (IllegalAccessException | InstantiationException ex) {
            logger.log(Level.SEVERE, "インスタンス生成失敗", ex);
        }

        className = "java.lang.Void";
        try {
            createInstance(className); // 存在するクラスだがコンストラクタがないためIllegalAccessExceptionが発生
        } catch (IllegalAccessException | InstantiationException ex) {
            logger.log(Level.SEVERE, "インスタンス生成失敗", ex);
        }
    }

    private <T> T createInstance(String className) throws IllegalAccessException, InstantiationException {
        try {
            Class cls = Class.forName(className);
            return (T) cls.newInstance();
        } catch (ClassNotFoundException ex) {
            logger.log(Level.SEVERE, "クラスが見つかりませんでした", ex);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "クラスが見つかりませんでした", ex);
            throw ex;
        }
        return null;
    }

    public static void main(String[] args) {
        new L118();
    }

}
