
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineAfterAnimateEvent;

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
