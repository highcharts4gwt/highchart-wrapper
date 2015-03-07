
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline.marker;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.marker.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.marker.states.Select;

public class MockStates
    implements States
{

    private Hover hover;
    private Select select;
    private String genericField;

    public Hover hover() {
        return hover;
    }

    public MockStates hover(Hover hover) {
        this.hover = hover;
        return this;
    }

    public Select select() {
        return select;
    }

    public MockStates select(Select select) {
        this.select = select;
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
