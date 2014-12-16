
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineLegendItemClickEvent;

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
