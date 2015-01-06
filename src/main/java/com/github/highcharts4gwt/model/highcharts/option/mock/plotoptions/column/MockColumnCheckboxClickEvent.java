
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnCheckboxClickEvent;

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
