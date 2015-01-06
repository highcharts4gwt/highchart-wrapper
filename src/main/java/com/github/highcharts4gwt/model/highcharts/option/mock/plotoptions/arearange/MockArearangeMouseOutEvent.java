
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOutEvent;

public class MockArearangeMouseOutEvent
    implements ArearangeMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
