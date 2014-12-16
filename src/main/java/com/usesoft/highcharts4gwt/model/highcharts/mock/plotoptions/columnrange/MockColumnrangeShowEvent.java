
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeShowEvent;

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
