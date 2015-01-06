
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineCheckboxClickEvent;

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
