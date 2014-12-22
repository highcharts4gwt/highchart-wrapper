
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickEvent;

public class MockLineLegendItemClickEvent
    implements LineLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
