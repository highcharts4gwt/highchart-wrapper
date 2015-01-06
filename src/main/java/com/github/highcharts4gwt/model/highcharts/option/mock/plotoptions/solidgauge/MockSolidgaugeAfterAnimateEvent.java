
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeAfterAnimateEvent;

public class MockSolidgaugeAfterAnimateEvent
    implements SolidgaugeAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
