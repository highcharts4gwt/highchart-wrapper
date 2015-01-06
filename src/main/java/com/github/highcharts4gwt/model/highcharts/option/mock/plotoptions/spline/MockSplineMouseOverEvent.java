
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineMouseOverEvent;

public class MockSplineMouseOverEvent
    implements SplineMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
