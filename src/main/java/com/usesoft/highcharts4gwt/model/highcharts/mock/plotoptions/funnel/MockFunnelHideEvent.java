
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelHideEvent;

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
