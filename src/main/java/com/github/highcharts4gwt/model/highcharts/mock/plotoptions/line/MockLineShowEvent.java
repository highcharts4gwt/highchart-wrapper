
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineShowEvent;

public class MockLineShowEvent
    implements LineShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
