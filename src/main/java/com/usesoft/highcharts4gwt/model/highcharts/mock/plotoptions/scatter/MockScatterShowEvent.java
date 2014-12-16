
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.scatter;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterShowEvent;

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
