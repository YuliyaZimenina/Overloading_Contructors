package overloading_constructors_demo;

public class OverloadingConstructorsDemo {
    public static void main(String[] args) {
        OverloadingConstructors test1 = new OverloadingConstructors();
        System.out.println("test1.x: " + test1.x);

        OverloadingConstructors test2 = new OverloadingConstructors(99);
        System.out.println("test2.x: " + test2.x);

        OverloadingConstructors test3 = new OverloadingConstructors(15.4);
        System.out.println("test3.x: " + test3.x);

        OverloadingConstructors test4 = new OverloadingConstructors(5, 3);
        System.out.println("test4.x: " + test4.x);
    }
}
