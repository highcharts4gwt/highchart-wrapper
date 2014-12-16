
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.arearange;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOverEvent;

public class MockArearangeMouseOverEvent
    implements ArearangeMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
