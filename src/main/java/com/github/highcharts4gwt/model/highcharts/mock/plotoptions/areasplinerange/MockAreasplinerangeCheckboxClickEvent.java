
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeCheckboxClickEvent;

public class MockAreasplinerangeCheckboxClickEvent
    implements AreasplinerangeCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
