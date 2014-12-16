
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.heatmap;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapHideEvent;

public class MockHeatmapHideEvent
    implements HeatmapHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockHeatmapHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
