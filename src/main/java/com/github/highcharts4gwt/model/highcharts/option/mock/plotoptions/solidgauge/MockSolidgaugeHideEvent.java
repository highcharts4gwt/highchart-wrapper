
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeHideEvent;

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
