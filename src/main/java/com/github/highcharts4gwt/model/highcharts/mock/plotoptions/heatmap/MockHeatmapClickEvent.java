
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapClickEvent;

public class MockHeatmapClickEvent
    implements HeatmapClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
