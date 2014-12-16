
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieAfterAnimateEvent;

public class MockPieAfterAnimateEvent
    implements PieAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
