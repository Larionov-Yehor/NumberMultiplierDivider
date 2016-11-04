import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */

public class MultiplierDivider {

    public static List<Integer> getMultipliersForNumber(int number) {

        List<Integer> result = new ArrayList<>();


        if (number == 1 ) {
            result.add(number);
        }

        if(checkIfTheNumberIsPime(number)){
            result.add(number);
        }

        if(number%Math.sqrt(number)==0){
            result.add((int)Math.sqrt(number));
            result.add((int)Math.sqrt(number));
        }
        

      //  if(number%2==0 || number%3==0 ||number%5==0 ||number%7==0 || number%9==0){}


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