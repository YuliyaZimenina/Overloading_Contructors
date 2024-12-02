package initialization_one_object_using_another_object;

public class SummationDemo {
    public static void main(String[] args) {
        Summation summation1 = new Summation(5);
        Summation summation2 = new Summation(summation1);

        System.out.println("summation1.sum: " + summation1.sum);
        System.out.println("summation2.sum: " + summation2.sum);
    }
}
