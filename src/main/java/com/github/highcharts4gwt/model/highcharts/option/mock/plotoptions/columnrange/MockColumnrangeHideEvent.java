
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeHideEvent;

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
