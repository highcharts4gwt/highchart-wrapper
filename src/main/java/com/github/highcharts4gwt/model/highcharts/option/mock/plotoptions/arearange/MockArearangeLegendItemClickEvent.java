
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeLegendItemClickEvent;

public class MockArearangeLegendItemClickEvent
    implements ArearangeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
