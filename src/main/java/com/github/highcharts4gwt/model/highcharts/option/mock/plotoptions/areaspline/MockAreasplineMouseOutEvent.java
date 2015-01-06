
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineMouseOutEvent;

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
