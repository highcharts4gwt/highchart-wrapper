
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieClickEvent;

public class MockPieClickEvent
    implements PieClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
