
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieLegendItemClickEvent;

public class MockPieLegendItemClickEvent
    implements PieLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
