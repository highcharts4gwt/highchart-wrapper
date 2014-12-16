
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.gauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeHideEvent;

public class MockGaugeHideEvent
    implements GaugeHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
