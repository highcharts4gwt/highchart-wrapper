
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.errorbar;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickEvent;

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
