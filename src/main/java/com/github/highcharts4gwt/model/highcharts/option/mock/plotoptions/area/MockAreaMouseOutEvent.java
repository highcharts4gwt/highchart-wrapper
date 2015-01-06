
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaMouseOutEvent;

public class MockAreaMouseOutEvent
    implements AreaMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
