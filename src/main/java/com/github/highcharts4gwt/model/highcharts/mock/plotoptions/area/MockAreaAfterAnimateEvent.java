
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaAfterAnimateEvent;

public class MockAreaAfterAnimateEvent
    implements AreaAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
