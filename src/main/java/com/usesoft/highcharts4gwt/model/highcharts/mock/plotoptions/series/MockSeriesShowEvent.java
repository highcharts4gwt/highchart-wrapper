
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.series;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesShowEvent;

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
