
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.areasplinerange;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOutEvent;

public class MockAreasplinerangeMouseOutEvent
    implements AreasplinerangeMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
