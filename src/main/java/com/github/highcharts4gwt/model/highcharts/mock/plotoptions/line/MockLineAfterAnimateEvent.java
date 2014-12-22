
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineAfterAnimateEvent;

public class MockLineAfterAnimateEvent
    implements LineAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}