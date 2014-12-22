
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineHideEvent;

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
