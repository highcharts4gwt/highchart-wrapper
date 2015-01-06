
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotShowEvent;

public class MockBoxplotShowEvent
    implements BoxplotShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
