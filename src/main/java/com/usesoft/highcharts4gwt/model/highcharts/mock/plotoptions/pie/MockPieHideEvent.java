
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieHideEvent;

public class MockPieHideEvent
    implements PieHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
