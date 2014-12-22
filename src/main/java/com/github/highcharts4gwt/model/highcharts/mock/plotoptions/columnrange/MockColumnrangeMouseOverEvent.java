
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOverEvent;

public class MockColumnrangeMouseOverEvent
    implements ColumnrangeMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
