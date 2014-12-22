
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeClickEvent;

public class MockColumnrangeClickEvent
    implements ColumnrangeClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
