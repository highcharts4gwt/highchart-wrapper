
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeShowEvent;

public class MockColumnrangeShowEvent
    implements ColumnrangeShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
