
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesMouseOverEvent;

public class MockSeriesMouseOverEvent
    implements SeriesMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
