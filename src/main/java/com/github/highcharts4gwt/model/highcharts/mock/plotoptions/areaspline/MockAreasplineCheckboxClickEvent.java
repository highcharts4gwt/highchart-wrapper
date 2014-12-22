
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineCheckboxClickEvent;

public class MockAreasplineCheckboxClickEvent
    implements AreasplineCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
