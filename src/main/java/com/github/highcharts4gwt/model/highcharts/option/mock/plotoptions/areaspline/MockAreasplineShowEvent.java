
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineShowEvent;

public class MockAreasplineShowEvent
    implements AreasplineShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
