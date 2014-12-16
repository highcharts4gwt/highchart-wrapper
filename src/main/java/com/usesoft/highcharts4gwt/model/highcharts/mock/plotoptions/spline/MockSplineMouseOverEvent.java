
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOverEvent;

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
