
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnCheckboxClickEvent;

public class MockColumnCheckboxClickEvent
    implements ColumnCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
