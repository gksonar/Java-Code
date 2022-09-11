package Oop;

public class InheritanceConstructor {
    int a;
    InheritanceConstructor() {
       a =10;
    }

}

class IN extends Inheritance {
   int a;
    IN() {
         a=10;
    }
}

class InheritanceCall {
    public static void main(String[] args) {
        IN id = new IN();
        System.out.println(id.a);

    }
}