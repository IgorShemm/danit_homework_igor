package aqa_hw_12.step_definitions;

import java.util.HashMap;
import java.util.Map;

public class BaseStepDefinition {

    protected static Map<String, String> dataContainer = new HashMap<>();

    protected String getValueFromMapByKey(String key) {
        return dataContainer.get(key);
    }

    protected void putValueToMapByKey(String key, String value) {
        dataContainer.put(key, value);
    }
}