
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesbar;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.LegendItemClickEvent;

public class MockLegendItemClickEvent
    implements LegendItemClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
