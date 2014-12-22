
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickEvent;

public class MockHeatmapCheckboxClickEvent
    implements HeatmapCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
