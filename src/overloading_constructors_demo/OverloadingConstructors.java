package overloading_constructors_demo;

//Demonstrations of constructor overloading
public class OverloadingConstructors {
    int x;

    OverloadingConstructors(){
        System.out.println("Inside overloading_constructors_demo.OverloadingConstructors(): ");
        x = 0;
    }

    OverloadingConstructors(int i){
        System.out.println("Inside overloading_constructors_demo.OverloadingConstructors(int i): ");
        x = i;
    }

    OverloadingConstructors(double d){
        System.out.println("Inside overloading_constructors_demo.OverloadingConstructors(double d): ");
        x = (int) d;
    }

    OverloadingConstructors(int i, int j){
        System.out.println("Inside overloading_constructors_demo.OverloadingConstructors(int i, int j): ");
        x = i * j;
    }

}