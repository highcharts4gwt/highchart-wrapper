
package com.github.highcharts4gwt.model.highcharts.option.mock.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnClickEvent;

public class MockSeriesColumnClickEvent
    implements SeriesColumnClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
