
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineLegendItemClickEvent;

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
