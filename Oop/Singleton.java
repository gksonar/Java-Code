package Oop;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstances() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}

class SingletonCall {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstances();
        Singleton s1 = Singleton.getInstances();
        Singleton s2 = Singleton.getInstances();

        System.out.println(" 1." + s.hashCode() + "\n 2." + s.hashCode() + "\n 3." + s.hashCode());

        if (s == s1 && s1 == s2) {
            System.out.println("Its a Singlton class. all values refers to single address space");
        } else
            System.out.println("Not a singlton");
    }
}
