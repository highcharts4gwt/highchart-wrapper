
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarClickEvent;

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
