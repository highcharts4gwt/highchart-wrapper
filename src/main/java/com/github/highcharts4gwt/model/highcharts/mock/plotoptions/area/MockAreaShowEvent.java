
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaShowEvent;

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
