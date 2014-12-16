
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.gauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeCheckboxClickEvent;

public class MockGaugeCheckboxClickEvent
    implements GaugeCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
