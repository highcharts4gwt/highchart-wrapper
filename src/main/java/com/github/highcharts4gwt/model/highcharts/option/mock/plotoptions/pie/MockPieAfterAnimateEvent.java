
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieAfterAnimateEvent;

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
