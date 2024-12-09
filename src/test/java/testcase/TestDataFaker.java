package testcase;

import helpers.DataFakerHelpers;
import net.datafaker.Faker;
import org.testng.annotations.Test;

public class TestDataFaker {
    @Test
    public void initDataFaker(){
        String city = DataFakerHelpers.getFaker().address().city();
        System.out.println(city);
    }
}
