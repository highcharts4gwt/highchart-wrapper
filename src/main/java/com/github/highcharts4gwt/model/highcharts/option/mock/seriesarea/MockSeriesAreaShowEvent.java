
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesarea;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaShowEvent;

public class MockSeriesAreaShowEvent
    implements SeriesAreaShowEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
