
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeClickEvent;

public class MockGaugeClickEvent
    implements GaugeClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
