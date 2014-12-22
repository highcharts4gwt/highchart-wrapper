
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOutEvent;

public class MockScatterMouseOutEvent
    implements ScatterMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
