
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineLegendItemClickEvent;

public class MockAreasplineLegendItemClickEvent
    implements AreasplineLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplineLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
