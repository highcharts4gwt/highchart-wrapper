
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOverEvent;

public class MockAreasplineMouseOverEvent
    implements AreasplineMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
