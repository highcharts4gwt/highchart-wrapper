
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesMouseOutEvent;

public class MockSeriesMouseOutEvent
    implements SeriesMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
