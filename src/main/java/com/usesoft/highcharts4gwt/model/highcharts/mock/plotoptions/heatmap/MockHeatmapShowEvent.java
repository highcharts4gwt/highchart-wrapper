
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.heatmap;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapShowEvent;

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
