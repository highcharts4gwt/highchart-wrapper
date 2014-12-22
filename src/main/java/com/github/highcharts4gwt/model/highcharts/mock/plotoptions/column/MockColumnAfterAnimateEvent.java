
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnAfterAnimateEvent;

public class MockColumnAfterAnimateEvent
    implements ColumnAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
