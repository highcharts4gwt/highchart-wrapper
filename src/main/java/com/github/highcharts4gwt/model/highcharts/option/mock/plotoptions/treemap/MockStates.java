
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.states.Hover;

public class MockStates
    implements States
{

    private Hover hover;

    public Hover hover() {
        return hover;
    }

    public MockStates hover(Hover hover) {
        this.hover = hover;
        return this;
    }

}
