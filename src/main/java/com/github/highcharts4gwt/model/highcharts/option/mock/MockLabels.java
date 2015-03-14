
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.option.api.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;


/**
 * HTML labels that can be positioned anywhere in the chart area.
 * 
 */
public class MockLabels
    implements Labels
{

    private Array<Item> items;
    private String style;
    private String genericField;
    private String functionAsString;

    public Array<Item> items() {
        return items;
    }

    public MockLabels items(Array<Item> items) {
        this.items = items;
        return this;
    }

    public String style() {
        return style;
    }

    public MockLabels style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockLabels setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
