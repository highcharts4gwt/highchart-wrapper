
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineAfterAnimateEvent;

public class MockSplineAfterAnimateEvent
    implements SplineAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
