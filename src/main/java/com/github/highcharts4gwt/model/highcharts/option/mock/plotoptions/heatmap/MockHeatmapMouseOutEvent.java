
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOutEvent;

public class MockHeatmapMouseOutEvent
    implements HeatmapMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
