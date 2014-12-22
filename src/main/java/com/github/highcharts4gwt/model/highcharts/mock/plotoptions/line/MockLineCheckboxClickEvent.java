
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickEvent;

public class MockLineCheckboxClickEvent
    implements LineCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
