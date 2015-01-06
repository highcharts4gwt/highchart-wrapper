
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarLegendItemClickEvent;

public class MockErrorbarLegendItemClickEvent
    implements ErrorbarLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
