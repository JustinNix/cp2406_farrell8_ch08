/**
 * Created by jc428352 on 15/09/17.
 */
import java.util.Scanner;
public class CarCareChoice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] services =  new String[4][2];
        services[0][0] = "oil change";
        services[0][1] = "25";
        services[1][0] = "tire rotation";
        services[1][1] = "22";
        services[2][0] = "battery";
        services[2][1] = "15";

        while (true){
            String option = input.nextLine();
            for(int i = 0; i<services.length -1; i++){
                if((services[i][0].charAt(0) == option.charAt(0) && services[i][0].charAt(1) == option.charAt(1) && services[i][0].charAt(2) == option.charAt(2))){
                    System.out.println("You chose: " + services[i][0] + " costing " + services[i][1]);
                }
            }
        }

    }


}
