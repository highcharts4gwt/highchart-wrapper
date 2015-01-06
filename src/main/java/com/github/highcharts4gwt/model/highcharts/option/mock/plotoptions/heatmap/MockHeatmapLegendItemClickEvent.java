
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapLegendItemClickEvent;

public class MockHeatmapLegendItemClickEvent
    implements HeatmapLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
