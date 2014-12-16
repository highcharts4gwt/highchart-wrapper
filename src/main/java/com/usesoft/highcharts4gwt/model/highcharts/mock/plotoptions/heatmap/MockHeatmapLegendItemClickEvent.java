
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.heatmap;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapLegendItemClickEvent;

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
