
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelShowEvent;

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
