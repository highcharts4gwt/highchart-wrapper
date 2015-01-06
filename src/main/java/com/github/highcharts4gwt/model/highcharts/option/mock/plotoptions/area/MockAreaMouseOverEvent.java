
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaMouseOverEvent;

public class MockAreaMouseOverEvent
    implements AreaMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
