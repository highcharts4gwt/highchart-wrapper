
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaCheckboxClickEvent;

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
