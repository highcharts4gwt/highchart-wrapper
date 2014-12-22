
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOverEvent;

public class MockColumnMouseOverEvent
    implements ColumnMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
