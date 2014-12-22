
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotClickEvent;

public class MockBoxplotClickEvent
    implements BoxplotClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
