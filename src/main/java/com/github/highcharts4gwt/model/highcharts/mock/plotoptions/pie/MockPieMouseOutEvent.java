
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOutEvent;

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
