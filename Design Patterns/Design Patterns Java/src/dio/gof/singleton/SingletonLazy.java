package dio.gof.singleton;

/**
 * Singleton "Preguiçoso"
 * 
 * @author WMarques25
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
