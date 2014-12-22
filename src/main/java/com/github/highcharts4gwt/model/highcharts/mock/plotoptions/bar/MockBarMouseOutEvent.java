
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOutEvent;

public class MockBarMouseOutEvent
    implements BarMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}