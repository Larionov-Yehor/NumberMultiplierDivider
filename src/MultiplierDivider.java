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

        else if(checkIfTheNumberIsPime(number)){
            result.add(number);
        }

        else if(number%Math.sqrt(number)==0){
            result.add((int)Math.sqrt(number));
            result.add((int)Math.sqrt(number));
        }

        else if(number%2==0){
            int numberToAddToResult =number;
            do {
                result.add(numberToAddToResult%2);

            }while (checkIfTheNumberIsPime(numberToAddToResult));
        }

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