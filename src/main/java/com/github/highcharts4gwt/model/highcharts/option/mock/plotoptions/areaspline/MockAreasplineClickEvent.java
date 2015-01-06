
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineClickEvent;

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
