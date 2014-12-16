
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.waterfall;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOverEvent;

public class MockWaterfallMouseOverEvent
    implements WaterfallMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
