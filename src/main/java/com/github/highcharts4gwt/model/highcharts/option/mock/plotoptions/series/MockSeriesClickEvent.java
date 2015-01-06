
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesClickEvent;

public class MockSeriesClickEvent
    implements SeriesClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
