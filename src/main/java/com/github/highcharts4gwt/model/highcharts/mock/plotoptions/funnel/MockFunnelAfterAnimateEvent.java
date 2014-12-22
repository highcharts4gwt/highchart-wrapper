
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelAfterAnimateEvent;

public class MockFunnelAfterAnimateEvent
    implements FunnelAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
