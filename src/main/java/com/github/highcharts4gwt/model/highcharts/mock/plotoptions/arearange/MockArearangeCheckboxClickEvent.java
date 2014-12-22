
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeCheckboxClickEvent;

public class MockArearangeCheckboxClickEvent
    implements ArearangeCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
