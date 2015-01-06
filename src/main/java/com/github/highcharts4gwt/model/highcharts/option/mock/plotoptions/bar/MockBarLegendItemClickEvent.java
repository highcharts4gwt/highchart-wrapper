
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarLegendItemClickEvent;

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
