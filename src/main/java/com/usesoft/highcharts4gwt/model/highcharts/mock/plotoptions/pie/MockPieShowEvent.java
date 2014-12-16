
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowEvent;

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
