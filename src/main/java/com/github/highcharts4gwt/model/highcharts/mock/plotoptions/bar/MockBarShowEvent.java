
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarShowEvent;

public class MockBarShowEvent
    implements BarShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
