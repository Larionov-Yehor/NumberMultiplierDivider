import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */

public class MultiplierDivider {

    public static List<Integer> getMultipliersForNumber (int number){

        List<Integer> result = new ArrayList<>();

       if(number==1 || number==2 || number==3){

            result.add(number);
        }




       /* for (int i=2; i<number;i++){
            if (number%i==0){
                result.add(number);
            }
        }
*/



       /* if(number%2==0){
            do{
                int numberToAddIntoResult =number/2;
                result.add(numberToAddIntoResult);
            } while();
        }*/

    return result;}

}
