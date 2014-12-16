
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOverEvent;

public class MockSolidgaugeMouseOverEvent
    implements SolidgaugeMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
