
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeAfterAnimateEvent;

public class MockGaugeAfterAnimateEvent
    implements GaugeAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
