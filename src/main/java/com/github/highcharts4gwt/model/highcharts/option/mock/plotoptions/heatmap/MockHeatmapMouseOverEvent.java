
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOverEvent;

public class MockHeatmapMouseOverEvent
    implements HeatmapMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
