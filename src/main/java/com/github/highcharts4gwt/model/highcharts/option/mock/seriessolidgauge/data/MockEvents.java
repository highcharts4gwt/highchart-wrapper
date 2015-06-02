
package com.github.highcharts4gwt.model.highcharts.option.mock.seriessolidgauge.data;

import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.data.Events;


/**
 * Individual point events
 * 
 */
public class MockEvents
    implements Events
{

    private String genericField;
    private String functionAsString;

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockEvents setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockEvents setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
