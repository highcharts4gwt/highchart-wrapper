
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.errorbar;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickEvent;

public class MockErrorbarClickEvent
    implements ErrorbarClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
