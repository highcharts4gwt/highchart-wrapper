
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineAfterAnimateEvent;

public class MockAreasplineAfterAnimateEvent
    implements AreasplineAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}