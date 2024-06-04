package dio.gof.singleton;

/**
 * Singleton "Apressado"
 * 
 * @author WMarques25
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
