
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeClickEvent;

public class MockAreasplinerangeClickEvent
    implements AreasplinerangeClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
