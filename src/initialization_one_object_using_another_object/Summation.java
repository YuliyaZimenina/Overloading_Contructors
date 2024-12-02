package initialization_one_object_using_another_object;
/*
Using the Summation class to calculate integer values starting from
one and ending at a specified value
 */
public class Summation {
    int sum;

    // Constructing from an int value
    Summation (int num){
        sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
    }

    //Constructing based on another object
    Summation(Summation obj){
        sum = obj.sum;
    }
}
