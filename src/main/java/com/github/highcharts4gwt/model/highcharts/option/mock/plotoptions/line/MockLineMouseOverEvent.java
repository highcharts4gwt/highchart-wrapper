
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOverEvent;

public class MockLineMouseOverEvent
    implements LineMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
