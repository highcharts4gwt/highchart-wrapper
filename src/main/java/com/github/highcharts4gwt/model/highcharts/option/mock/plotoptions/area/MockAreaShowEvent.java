
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaShowEvent;

public class MockAreaShowEvent
    implements AreaShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
