
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieMouseOverEvent;

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
