
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.states.Hover;

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
