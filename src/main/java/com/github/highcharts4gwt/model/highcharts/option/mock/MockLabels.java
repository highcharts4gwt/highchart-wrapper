
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.option.api.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;

public class MockLabels
    implements Labels
{

    private Array<Item> items;
    private String style;
    private String genericField;

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

}
