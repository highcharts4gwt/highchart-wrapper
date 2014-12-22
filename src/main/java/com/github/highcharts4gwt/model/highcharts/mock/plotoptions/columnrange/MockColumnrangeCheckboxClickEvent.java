
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeCheckboxClickEvent;

public class MockColumnrangeCheckboxClickEvent
    implements ColumnrangeCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
