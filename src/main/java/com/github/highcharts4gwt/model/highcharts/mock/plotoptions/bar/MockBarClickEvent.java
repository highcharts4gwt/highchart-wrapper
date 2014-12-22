
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarClickEvent;

public class MockBarClickEvent
    implements BarClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
