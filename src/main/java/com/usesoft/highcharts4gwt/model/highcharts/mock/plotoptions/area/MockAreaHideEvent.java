
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaHideEvent;

public class MockAreaHideEvent
    implements AreaHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
