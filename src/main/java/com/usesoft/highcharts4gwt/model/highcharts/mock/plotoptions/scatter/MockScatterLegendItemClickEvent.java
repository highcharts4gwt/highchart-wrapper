
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.scatter;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterLegendItemClickEvent;

public class MockScatterLegendItemClickEvent
    implements ScatterLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
