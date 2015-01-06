
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnHideEvent;

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
