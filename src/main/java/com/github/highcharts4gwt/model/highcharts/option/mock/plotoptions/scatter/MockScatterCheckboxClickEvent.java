
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterCheckboxClickEvent;

public class MockScatterCheckboxClickEvent
    implements ScatterCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
