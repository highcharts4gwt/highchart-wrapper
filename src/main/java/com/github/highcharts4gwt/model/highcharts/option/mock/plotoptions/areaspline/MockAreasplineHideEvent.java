
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineHideEvent;

public class MockAreasplineHideEvent
    implements AreasplineHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
