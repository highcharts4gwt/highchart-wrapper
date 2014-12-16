
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineShowEvent;

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
