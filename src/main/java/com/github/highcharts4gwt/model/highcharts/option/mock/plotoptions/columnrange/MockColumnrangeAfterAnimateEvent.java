
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeAfterAnimateEvent;

public class MockColumnrangeAfterAnimateEvent
    implements ColumnrangeAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
