
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelShowEvent;

public class MockFunnelShowEvent
    implements FunnelShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}