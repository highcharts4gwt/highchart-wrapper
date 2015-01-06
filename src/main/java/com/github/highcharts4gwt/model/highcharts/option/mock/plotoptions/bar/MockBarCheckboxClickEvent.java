
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarCheckboxClickEvent;

public class MockBarCheckboxClickEvent
    implements BarCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
