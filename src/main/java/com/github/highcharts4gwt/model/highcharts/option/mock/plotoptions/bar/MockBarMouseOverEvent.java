
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarMouseOverEvent;

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
