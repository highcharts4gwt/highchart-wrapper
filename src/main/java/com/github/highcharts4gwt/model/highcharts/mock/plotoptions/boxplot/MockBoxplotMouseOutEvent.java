
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOutEvent;

public class MockBoxplotMouseOutEvent
    implements BoxplotMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}