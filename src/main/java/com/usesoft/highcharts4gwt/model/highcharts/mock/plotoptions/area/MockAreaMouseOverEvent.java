
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOverEvent;

public class MockAreaMouseOverEvent
    implements AreaMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
