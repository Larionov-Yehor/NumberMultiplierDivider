import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by employee on 11/4/16.
 */
public class testMultiplierDivider {

    @Test
    public void chekOutputForNumberOne(){

        List<Integer> actual = MultiplierDivider.getMultipliersForNumber(1);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        assertThat(actual,equalTo(expected));
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



}
