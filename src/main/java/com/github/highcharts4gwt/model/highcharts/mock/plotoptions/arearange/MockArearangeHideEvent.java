
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeHideEvent;

public class MockArearangeHideEvent
    implements ArearangeHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
