
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaClickEvent;

public class MockAreaClickEvent
    implements AreaClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
