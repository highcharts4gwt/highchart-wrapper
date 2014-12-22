
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverEvent;

public class MockPieMouseOverEvent
    implements PieMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
