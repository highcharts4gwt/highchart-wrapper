
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesHideEvent;

public class MockSeriesHideEvent
    implements SeriesHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
