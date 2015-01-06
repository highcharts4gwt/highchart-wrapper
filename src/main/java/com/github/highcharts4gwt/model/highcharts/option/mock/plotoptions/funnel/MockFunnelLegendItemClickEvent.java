
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelLegendItemClickEvent;

public class MockFunnelLegendItemClickEvent
    implements FunnelLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
