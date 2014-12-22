
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarLegendItemClickEvent;

public class MockBarLegendItemClickEvent
    implements BarLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
