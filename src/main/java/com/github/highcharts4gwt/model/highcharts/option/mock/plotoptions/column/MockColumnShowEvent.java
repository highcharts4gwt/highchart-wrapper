
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnShowEvent;

public class MockColumnShowEvent
    implements ColumnShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
