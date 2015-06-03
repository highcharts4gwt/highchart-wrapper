
package com.github.highcharts4gwt.model.highcharts.option.mock.chart;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.RedrawEvent;

public class MockRedrawEvent
    implements RedrawEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Chart Chart;

    public com.github.highcharts4gwt.model.highcharts.object.api.Chart chart() {
        return Chart;
    }

}
