
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelClickEvent;

public class MockFunnelClickEvent
    implements FunnelClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
