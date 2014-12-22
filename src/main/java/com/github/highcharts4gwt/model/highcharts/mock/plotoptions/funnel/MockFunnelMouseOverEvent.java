
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelMouseOverEvent;

public class MockFunnelMouseOverEvent
    implements FunnelMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
