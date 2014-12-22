
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnLegendItemClickEvent;

public class MockColumnLegendItemClickEvent
    implements ColumnLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
