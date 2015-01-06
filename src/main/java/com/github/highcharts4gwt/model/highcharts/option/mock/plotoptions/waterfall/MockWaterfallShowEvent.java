
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallShowEvent;

public class MockWaterfallShowEvent
    implements WaterfallShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
