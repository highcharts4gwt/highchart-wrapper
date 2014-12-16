
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeClickEvent;

public class MockSolidgaugeClickEvent
    implements SolidgaugeClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
