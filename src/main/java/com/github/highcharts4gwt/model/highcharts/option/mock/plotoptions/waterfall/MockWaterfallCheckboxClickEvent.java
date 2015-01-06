
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallCheckboxClickEvent;

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
