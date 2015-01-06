
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesLegendItemClickEvent;

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
