
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.LegendItemClickEvent;

public class MockLegendItemClickEvent
    implements LegendItemClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
