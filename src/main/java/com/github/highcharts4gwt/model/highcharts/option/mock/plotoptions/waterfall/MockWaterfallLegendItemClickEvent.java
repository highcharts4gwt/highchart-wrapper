
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallLegendItemClickEvent;

public class MockWaterfallLegendItemClickEvent
    implements WaterfallLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
