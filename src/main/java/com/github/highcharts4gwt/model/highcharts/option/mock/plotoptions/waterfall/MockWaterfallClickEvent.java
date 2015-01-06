
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallClickEvent;

public class MockWaterfallClickEvent
    implements WaterfallClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
