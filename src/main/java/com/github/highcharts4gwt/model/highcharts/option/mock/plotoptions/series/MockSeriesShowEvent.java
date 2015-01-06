
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesShowEvent;

public class MockSeriesShowEvent
    implements SeriesShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
