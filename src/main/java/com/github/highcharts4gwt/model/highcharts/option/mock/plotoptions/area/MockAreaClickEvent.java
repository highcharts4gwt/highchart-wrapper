
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaClickEvent;

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
