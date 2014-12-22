
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineCheckboxClickEvent;

public class MockSplineCheckboxClickEvent
    implements SplineCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
