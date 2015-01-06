
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaCheckboxClickEvent;

public class MockAreaCheckboxClickEvent
    implements AreaCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreaCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
