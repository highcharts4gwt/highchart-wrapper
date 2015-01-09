
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series.marker;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.marker.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.marker.states.Select;

public class MockStates
    implements States
{

    private Hover hover;
    private Select select;

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

}