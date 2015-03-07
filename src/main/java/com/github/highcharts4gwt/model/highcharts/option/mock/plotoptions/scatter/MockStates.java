
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.states.Hover;

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
