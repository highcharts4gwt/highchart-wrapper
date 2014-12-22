
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallHideEvent;

public class MockWaterfallHideEvent
    implements WaterfallHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
