/**
 * Created by jc428352 on 1/09/17.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> enteredNums = new ArrayList<>();
        double value = 0;
        while(value != 99999) {
             value = input.nextDouble();
            if(value > 0 && value <20){
                enteredNums.add(value);
            }
        }
        int sum = 0;
        for (int i = 0; i<enteredNums.size(); i++){
            sum += enteredNums.get(i);
        }
        System.out.println(sum/enteredNums.size());
    }
}
