
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOutEvent;

public class MockColumnrangeMouseOutEvent
    implements ColumnrangeMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
