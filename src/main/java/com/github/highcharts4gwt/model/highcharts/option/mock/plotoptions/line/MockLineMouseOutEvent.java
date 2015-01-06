
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOutEvent;

public class MockLineMouseOutEvent
    implements LineMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
