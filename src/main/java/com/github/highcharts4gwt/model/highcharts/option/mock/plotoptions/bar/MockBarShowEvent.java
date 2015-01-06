
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarShowEvent;

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
