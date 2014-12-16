
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.errorbar;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateEvent;

public class MockErrorbarAfterAnimateEvent
    implements ErrorbarAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
