
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOverEvent;

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
