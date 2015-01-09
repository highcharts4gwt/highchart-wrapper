
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOutEvent;

public class MockGaugeMouseOutEvent
    implements GaugeMouseOutEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series getSeries() {
        return Series;
    }

    public MockGaugeMouseOutEvent Series(com.github.highcharts4gwt.model.highcharts.object.api.Series Series) {
        this.Series = Series;
        return this;
    }

}