
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallAfterAnimateEvent;

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
