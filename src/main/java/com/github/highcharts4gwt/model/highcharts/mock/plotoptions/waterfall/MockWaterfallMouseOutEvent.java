
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOutEvent;

public class MockWaterfallMouseOutEvent
    implements WaterfallMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
