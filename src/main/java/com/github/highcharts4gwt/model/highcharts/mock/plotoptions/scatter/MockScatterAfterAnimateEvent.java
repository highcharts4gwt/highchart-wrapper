
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterAfterAnimateEvent;

public class MockScatterAfterAnimateEvent
    implements ScatterAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
