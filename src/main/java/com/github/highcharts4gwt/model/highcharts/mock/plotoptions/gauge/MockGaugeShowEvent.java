
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeShowEvent;

public class MockGaugeShowEvent
    implements GaugeShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
