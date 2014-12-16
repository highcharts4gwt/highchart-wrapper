
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.arearange;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOutEvent;

public class MockArearangeMouseOutEvent
    implements ArearangeMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
