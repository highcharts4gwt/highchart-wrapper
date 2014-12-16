
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.errorbar;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowEvent;

public class MockErrorbarShowEvent
    implements ErrorbarShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
