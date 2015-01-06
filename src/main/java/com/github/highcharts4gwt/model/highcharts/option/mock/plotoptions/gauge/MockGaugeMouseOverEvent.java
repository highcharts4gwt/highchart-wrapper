
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOverEvent;

public class MockGaugeMouseOverEvent
    implements GaugeMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
