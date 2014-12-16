
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieClickEvent;

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
