
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOutEvent;

public class MockGaugeMouseOutEvent
    implements GaugeMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
