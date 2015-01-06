
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineClickEvent;

public class MockLineClickEvent
    implements LineClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
