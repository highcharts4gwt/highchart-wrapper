
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineHideEvent;

public class MockSplineHideEvent
    implements SplineHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
