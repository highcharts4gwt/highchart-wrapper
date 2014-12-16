
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.waterfall;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallCheckboxClickEvent;

public class MockWaterfallCheckboxClickEvent
    implements WaterfallCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
