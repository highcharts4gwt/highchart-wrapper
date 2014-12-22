
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOverEvent;

public class MockAreasplinerangeMouseOverEvent
    implements AreasplinerangeMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
