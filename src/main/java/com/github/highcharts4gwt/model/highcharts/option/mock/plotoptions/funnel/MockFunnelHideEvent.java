
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelHideEvent;

public class MockFunnelHideEvent
    implements FunnelHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
