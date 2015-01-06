
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineLegendItemClickEvent;

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
