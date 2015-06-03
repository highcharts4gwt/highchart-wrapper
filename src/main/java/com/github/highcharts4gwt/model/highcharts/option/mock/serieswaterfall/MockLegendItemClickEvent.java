
package com.github.highcharts4gwt.model.highcharts.option.mock.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.LegendItemClickEvent;

public class MockLegendItemClickEvent
    implements LegendItemClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
