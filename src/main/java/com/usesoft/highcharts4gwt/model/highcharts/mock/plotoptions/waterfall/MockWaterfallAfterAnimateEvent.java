
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.waterfall;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallAfterAnimateEvent;

public class MockWaterfallAfterAnimateEvent
    implements WaterfallAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
