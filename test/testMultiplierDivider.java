import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.Matchers.contains;

/**
 * Created by employee on 11/4/16.
 */
public class testMultiplierDivider {

    @Test
    public void chekOutputForNumberOne(){

        assertThat(MultiplierDivider.getMultipliersForNumber(1),contains(1));
    }

    @Test
    public void chekOutputForNumberTwo(){

        List<Integer> actual = MultiplierDivider.getMultipliersForNumber(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);

        assertThat(actual,equalTo(expected));
    }

    @Test
    public void chekOutputForNumberThree(){

        List<Integer> actual = MultiplierDivider.getMultipliersForNumber(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(3);

        assertThat(actual,equalTo(expected));
    }

        @Test
    public void chekOutputForNumberFour(){
        List<Integer> actual = MultiplierDivider.getMultipliersForNumber(4);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);

        assertThat(actual,equalTo(expected));
    }


   @Test
    public void chekOutputForNumberFive(){

        List<Integer> actual = MultiplierDivider.getMultipliersForNumber(5);

        List<Integer> expected = new ArrayList<>();
        expected.add(5);

        assertThat(actual,equalTo(expected));
    }

    @Test
    public void chekOutputForNumber121(){

        List<Integer> actual = MultiplierDivider.getMultipliersForNumber(121);

        List<Integer> expected = new ArrayList<>();
        expected.add(11);
        expected.add(11);

        assertThat(actual,equalTo(expected));
    }



    @Test
    public void chekOutputForNumber100(){

        List<Integer> actual = MultiplierDivider.getMultipliersForNumber(100);


        assertThat(MultiplierDivider.getMultipliersForNumber(2*2*5*5),contains(2,2,5,5));
    }

    @Test
    public void chekOutputForNumber510(){
        
        assertThat(MultiplierDivider.getMultipliersForNumber(2*3*5*7*11),contains(2,3,5,7,11));
    }

    @Test
    public void chekOutputForNumber111(){

        assertThat(MultiplierDivider.getMultipliersForNumber(111),contains(3,37));
    }


}
