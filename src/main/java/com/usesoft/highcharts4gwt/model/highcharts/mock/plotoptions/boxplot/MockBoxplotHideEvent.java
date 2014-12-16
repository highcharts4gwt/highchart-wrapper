
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.boxplot;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotHideEvent;

public class MockBoxplotHideEvent
    implements BoxplotHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
