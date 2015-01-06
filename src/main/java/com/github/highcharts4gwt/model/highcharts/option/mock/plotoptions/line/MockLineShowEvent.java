
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineShowEvent;

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
