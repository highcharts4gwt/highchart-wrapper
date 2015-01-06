
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeLegendItemClickEvent;

public class MockSolidgaugeLegendItemClickEvent
    implements SolidgaugeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
