
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeCheckboxClickEvent;

public class MockSolidgaugeCheckboxClickEvent
    implements SolidgaugeCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
