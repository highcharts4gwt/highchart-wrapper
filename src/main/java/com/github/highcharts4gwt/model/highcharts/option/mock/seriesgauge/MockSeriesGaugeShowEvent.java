
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeShowEvent;

public class MockSeriesGaugeShowEvent
    implements SeriesGaugeShowEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
