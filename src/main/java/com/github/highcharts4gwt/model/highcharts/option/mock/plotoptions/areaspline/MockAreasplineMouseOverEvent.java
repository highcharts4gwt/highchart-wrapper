
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineMouseOverEvent;

public class MockAreasplineMouseOverEvent
    implements AreasplineMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
