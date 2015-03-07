
package com.github.highcharts4gwt.model.highcharts.option.mock.series.data;

import com.github.highcharts4gwt.model.highcharts.option.api.series.data.Events;

public class MockEvents
    implements Events
{

    private String genericField;

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockEvents setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
