
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.states.Hover;


/**
 * A wrapper object for all the series options in specific states.
 * 
 */
public class MockStates
    implements States
{

    private Hover hover;
    private String genericField;

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

}
