import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 * x
 */

public class MultiplierDivider {

    public static List<Integer> getMultipliersForNumber(int number) {

        List<Integer> result = new ArrayList<>();

        if (number == 1) {
            result.add(number);
            return result;
        }

        if (checkIfTheNumberIsPime(number)) {
            result.add(number);
            return result;
        }

       int divider =2;

       for(int i=1; number >= divider ; i++){

           if(number%divider==0) {

               number=number/divider;
               result.add(divider);
           }
           else {
               divider+=1;
           }

       }

        return result;

    }


    public static boolean checkIfTheNumberIsPime(int number) {
        int i;

        for (i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


}