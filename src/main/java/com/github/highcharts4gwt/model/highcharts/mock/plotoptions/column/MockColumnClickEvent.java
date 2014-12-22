
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnClickEvent;

public class MockColumnClickEvent
    implements ColumnClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
