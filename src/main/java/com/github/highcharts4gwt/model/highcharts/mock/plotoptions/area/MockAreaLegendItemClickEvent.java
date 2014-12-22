
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaLegendItemClickEvent;

public class MockAreaLegendItemClickEvent
    implements AreaLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
