
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.states.Hover;

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
