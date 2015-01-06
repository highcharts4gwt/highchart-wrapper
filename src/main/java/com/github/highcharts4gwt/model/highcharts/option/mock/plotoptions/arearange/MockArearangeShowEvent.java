
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeShowEvent;

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
