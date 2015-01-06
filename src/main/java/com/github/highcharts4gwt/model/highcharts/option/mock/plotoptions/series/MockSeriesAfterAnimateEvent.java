
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesAfterAnimateEvent;

public class MockSeriesAfterAnimateEvent
    implements SeriesAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
