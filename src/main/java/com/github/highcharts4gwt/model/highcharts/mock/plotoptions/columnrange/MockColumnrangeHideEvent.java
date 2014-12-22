
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeHideEvent;

public class MockColumnrangeHideEvent
    implements ColumnrangeHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
