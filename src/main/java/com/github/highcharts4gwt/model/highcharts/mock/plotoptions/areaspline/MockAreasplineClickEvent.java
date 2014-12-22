
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineClickEvent;

public class MockAreasplineClickEvent
    implements AreasplineClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
