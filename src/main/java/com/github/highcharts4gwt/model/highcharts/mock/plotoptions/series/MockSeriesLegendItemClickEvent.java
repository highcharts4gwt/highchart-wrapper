
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesLegendItemClickEvent;

public class MockSeriesLegendItemClickEvent
    implements SeriesLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
