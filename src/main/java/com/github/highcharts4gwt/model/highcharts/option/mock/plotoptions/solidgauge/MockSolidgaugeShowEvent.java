
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeShowEvent;

public class MockSolidgaugeShowEvent
    implements SolidgaugeShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
