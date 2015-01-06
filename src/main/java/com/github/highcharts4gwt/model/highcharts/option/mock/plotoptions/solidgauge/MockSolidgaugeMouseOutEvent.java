
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOutEvent;

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
