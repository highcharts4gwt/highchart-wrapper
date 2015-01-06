
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarHideEvent;

public class MockBarHideEvent
    implements BarHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
