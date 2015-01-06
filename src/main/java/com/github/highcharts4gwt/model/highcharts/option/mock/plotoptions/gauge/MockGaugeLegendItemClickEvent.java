
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeLegendItemClickEvent;

public class MockGaugeLegendItemClickEvent
    implements GaugeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockGaugeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
