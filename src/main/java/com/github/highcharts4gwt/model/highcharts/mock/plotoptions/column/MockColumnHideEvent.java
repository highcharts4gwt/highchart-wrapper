
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnHideEvent;

public class MockColumnHideEvent
    implements ColumnHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
