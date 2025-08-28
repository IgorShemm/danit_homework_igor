package aqa_hw_7.data_provider;

import org.testng.annotations.DataProvider;

public class ProvideData {

    @DataProvider
    public Object[][] getCityData() {
        return new Object[][] {
                {"Київ"},
                {"Одеса"},
                {"Львів"},
                {"Харків"},
                {"Дніпро"}
        };
    }
}