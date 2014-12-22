
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarCheckboxClickEvent;

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
