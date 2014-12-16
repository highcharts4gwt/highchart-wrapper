
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.heatmap;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickEvent;

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
