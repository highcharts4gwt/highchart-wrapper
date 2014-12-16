
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineLegendItemClickEvent;

public class MockSplineLegendItemClickEvent
    implements SplineLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
