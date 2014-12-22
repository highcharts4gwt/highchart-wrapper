
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOutEvent;

public class MockSolidgaugeMouseOutEvent
    implements SolidgaugeMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
