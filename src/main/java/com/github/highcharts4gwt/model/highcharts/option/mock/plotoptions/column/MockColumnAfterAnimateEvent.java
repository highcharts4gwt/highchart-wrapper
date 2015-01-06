
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnAfterAnimateEvent;

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
