
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeMouseOverEvent;

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
