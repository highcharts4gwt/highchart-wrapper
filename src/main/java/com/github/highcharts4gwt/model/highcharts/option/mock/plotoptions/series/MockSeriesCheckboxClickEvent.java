
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesCheckboxClickEvent;

public class MockSeriesCheckboxClickEvent
    implements SeriesCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
