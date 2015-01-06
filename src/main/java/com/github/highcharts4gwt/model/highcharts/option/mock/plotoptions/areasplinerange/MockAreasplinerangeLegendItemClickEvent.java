
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickEvent;

public class MockAreasplinerangeLegendItemClickEvent
    implements AreasplinerangeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
