
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesMouseOutEvent;

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
