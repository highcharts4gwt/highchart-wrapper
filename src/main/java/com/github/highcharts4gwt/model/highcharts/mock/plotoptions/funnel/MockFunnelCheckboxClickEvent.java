
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelCheckboxClickEvent;

public class MockFunnelCheckboxClickEvent
    implements FunnelCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
