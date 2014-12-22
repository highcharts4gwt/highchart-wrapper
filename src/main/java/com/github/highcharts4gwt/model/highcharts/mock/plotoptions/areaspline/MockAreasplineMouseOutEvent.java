
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOutEvent;

public class MockAreasplineMouseOutEvent
    implements AreasplineMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
