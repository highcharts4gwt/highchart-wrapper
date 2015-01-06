
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapHideEvent;

public class MockHeatmapHideEvent
    implements HeatmapHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
