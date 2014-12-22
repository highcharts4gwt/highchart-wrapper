
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapAfterAnimateEvent;

public class MockHeatmapAfterAnimateEvent
    implements HeatmapAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
