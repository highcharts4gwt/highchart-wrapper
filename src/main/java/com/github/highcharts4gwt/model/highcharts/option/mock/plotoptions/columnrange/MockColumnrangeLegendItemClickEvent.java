
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeLegendItemClickEvent;

public class MockColumnrangeLegendItemClickEvent
    implements ColumnrangeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
