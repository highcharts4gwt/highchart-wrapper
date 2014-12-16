
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.waterfall;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallClickEvent;

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
