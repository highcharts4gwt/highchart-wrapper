
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOverEvent;

public class MockArearangeMouseOverEvent
    implements ArearangeMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
