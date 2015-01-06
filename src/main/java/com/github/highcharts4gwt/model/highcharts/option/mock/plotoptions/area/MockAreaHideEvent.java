
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaHideEvent;

public class MockAreaHideEvent
    implements AreaHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
