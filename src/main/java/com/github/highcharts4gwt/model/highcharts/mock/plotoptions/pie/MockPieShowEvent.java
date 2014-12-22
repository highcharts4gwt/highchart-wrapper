
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowEvent;

public class MockPieShowEvent
    implements PieShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
