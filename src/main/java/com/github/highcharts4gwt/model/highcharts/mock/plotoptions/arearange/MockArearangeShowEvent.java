
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeShowEvent;

public class MockArearangeShowEvent
    implements ArearangeShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
