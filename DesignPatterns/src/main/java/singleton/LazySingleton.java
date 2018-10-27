package singleton;

public final class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return null == instance ? new LazySingleton() : instance;
    }
}
