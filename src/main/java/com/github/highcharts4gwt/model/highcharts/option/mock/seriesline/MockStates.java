
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesline;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.states.Hover;


/**
 * A wrapper object for all the series options in specific states.
 * 
 */
public class MockStates
    implements States
{

    private Hover hover;
    private String genericField;
    private String functionAsString;

    public Hover hover() {
        return hover;
    }

    public MockStates hover(Hover hover) {
        this.hover = hover;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockStates setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockStates setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
