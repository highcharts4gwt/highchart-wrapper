
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeHideEvent;

public class MockSolidgaugeHideEvent
    implements SolidgaugeHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
