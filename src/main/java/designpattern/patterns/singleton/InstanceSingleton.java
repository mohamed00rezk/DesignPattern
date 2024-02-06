package designpattern.patterns.singleton;

public class InstanceSingleton {
    // used for eager
    //private static final InstanceSingleton instance = new InstanceSingleton();

    private static InstanceSingleton instance;
    private InstanceSingleton(){}

    public static InstanceSingleton getInstance() {
        if (instance == null) {
            synchronized (InstanceSingleton.class) {
                if (instance == null) {
                    instance = new InstanceSingleton();
                }
            }
        }
        return instance;
    }
}
