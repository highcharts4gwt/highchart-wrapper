
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallHideEvent;

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
