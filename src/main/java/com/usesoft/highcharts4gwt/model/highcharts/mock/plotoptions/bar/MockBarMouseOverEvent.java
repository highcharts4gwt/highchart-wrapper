
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.bar;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOverEvent;

public class MockBarMouseOverEvent
    implements BarMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
