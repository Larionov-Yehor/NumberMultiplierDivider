import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */

public class MultiplierDivider {

    public static List<Integer> getMultipliersForNumber(int number) {

        List<Integer> result = new ArrayList<>();

        int divider= 2;

        if (number == 1 ) {
            result.add(number);
            return result;
        }

        if(checkIfTheNumberIsPime(number)){
            result.add(number);
            return result;
        }

        /*if(number%Math.sqrt(number)==0){
            result.add((int)Math.sqrt(number));
            result.add((int)Math.sqrt(number));
        }*/


            do{
                if(number%divider==0){

                    number=number/divider;
                    result.add(divider);

                }
                else {
                    divider=divider+1;
                }
            }while (number>=divider);


        return result;

    }


    public static boolean checkIfTheNumberIsPime(int number) {
            int i;

            for (i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

        return true;
    }



}