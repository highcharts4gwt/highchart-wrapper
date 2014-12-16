
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOutEvent;

public class MockSplineMouseOutEvent
    implements SplineMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
