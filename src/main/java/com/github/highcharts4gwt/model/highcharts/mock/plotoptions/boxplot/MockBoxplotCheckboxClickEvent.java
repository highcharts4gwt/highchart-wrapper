
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotCheckboxClickEvent;

public class MockBoxplotCheckboxClickEvent
    implements BoxplotCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
