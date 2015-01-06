
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapClickEvent;

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
