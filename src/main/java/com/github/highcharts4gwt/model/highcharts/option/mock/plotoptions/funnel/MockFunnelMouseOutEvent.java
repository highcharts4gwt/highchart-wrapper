
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOutEvent;

public class MockFunnelMouseOutEvent
    implements FunnelMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
