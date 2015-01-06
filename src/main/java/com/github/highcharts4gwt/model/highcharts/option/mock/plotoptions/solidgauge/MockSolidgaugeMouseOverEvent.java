
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOverEvent;

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
