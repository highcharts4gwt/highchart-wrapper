
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineCheckboxClickEvent;

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
