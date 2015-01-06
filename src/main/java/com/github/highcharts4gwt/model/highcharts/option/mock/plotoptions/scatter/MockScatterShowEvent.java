
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterShowEvent;

public class MockScatterShowEvent
    implements ScatterShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
