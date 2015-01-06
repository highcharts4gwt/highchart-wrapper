
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarAfterAnimateEvent;

public class MockBarAfterAnimateEvent
    implements BarAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
