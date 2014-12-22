
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineClickEvent;

public class MockSplineClickEvent
    implements SplineClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
