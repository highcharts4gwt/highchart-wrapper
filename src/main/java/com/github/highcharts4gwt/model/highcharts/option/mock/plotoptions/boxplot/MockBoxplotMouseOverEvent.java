
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOverEvent;

public class MockBoxplotMouseOverEvent
    implements BoxplotMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
