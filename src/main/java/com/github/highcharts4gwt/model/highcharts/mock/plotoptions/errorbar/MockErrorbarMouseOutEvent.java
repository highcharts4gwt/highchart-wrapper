
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutEvent;

public class MockErrorbarMouseOutEvent
    implements ErrorbarMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
