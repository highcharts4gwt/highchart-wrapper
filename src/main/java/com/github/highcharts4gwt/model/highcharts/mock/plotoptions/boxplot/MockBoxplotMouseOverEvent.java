
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOverEvent;

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
