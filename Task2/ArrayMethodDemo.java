/**
 * Created by jc428352 on 15/09/17.
 */
public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i;
        }
        displayAll(numbers);
        System.out.println();
        reverseOrder(numbers);
        System.out.println();
        sumNumbers(numbers);
        System.out.println();
        lessThan(numbers);
        System.out.println();
        higherAverage(numbers);
    }

    public static void displayAll(int[] numbers){
        for(int i: numbers){
            System.out.print(i + " ");
        }
    }

    public static void reverseOrder(int[] numbers){
        for(int i = numbers.length - 1; i > -1; i--){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void sumNumbers(int[] numbers){
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.print(sum);
    }

    public static void lessThan(int[] numbers){
        int delimeter = 5;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] < delimeter){
                System.out.print(numbers[i]);
            }
        }
    }

    public static void higherAverage(int[] numbers){
        int sum = 0;
        int average;
        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        average = sum/numbers.length;
        for(int j = 0; j<numbers.length; j++){
            if(j > average){
                System.out.print(j);
            }
        }
    }

}
