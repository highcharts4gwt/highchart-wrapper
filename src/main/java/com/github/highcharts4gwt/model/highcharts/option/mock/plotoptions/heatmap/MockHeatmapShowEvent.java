
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapShowEvent;

public class MockHeatmapShowEvent
    implements HeatmapShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
