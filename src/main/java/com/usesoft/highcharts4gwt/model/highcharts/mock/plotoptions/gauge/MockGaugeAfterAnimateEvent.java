
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.gauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeAfterAnimateEvent;

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
