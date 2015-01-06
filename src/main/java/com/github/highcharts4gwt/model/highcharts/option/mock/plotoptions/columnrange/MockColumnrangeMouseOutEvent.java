
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeMouseOutEvent;

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
