
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineAfterAnimateEvent;

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
