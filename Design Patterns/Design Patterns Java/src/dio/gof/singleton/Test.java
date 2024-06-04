package dio.gof.singleton;

public class Test {
    public static void main(String[] args) {
    
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy + "\n" +lazy2);

        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager + "\n" +eager2);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder + "\n" +lazyHolder2);
    }
}
