
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeClickEvent;

public class MockArearangeClickEvent
    implements ArearangeClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
