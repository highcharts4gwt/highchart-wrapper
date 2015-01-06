
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeCheckboxClickEvent;

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
