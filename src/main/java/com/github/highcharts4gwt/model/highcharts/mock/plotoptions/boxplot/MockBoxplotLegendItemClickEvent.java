
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotLegendItemClickEvent;

public class MockBoxplotLegendItemClickEvent
    implements BoxplotLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}