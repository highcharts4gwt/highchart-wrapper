
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieMouseOutEvent;

public class MockPieMouseOutEvent
    implements PieMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
