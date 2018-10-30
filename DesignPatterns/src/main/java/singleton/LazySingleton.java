package singleton;

public final class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == instance) return new LazySingleton();
        else return instance;
    }
}
