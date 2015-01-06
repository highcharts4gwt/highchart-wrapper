
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeAfterAnimateEvent;

public class MockArearangeAfterAnimateEvent
    implements ArearangeAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
