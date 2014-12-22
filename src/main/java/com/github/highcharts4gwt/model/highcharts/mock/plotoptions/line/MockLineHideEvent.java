
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineHideEvent;

public class MockLineHideEvent
    implements LineHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
