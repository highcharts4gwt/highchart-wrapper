
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieClickEvent;

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
