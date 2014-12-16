
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeAfterAnimateEvent;

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
