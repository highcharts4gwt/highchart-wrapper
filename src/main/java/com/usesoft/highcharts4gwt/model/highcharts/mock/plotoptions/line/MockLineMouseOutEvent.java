
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.line;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOutEvent;

public class MockLineMouseOutEvent
    implements LineMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
