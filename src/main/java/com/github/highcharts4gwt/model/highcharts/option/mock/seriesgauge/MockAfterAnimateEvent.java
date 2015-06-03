
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.AfterAnimateEvent;

public class MockAfterAnimateEvent
    implements AfterAnimateEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
