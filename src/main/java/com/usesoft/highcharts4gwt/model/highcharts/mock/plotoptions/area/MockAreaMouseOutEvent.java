
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOutEvent;

public class MockAreaMouseOutEvent
    implements AreaMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
