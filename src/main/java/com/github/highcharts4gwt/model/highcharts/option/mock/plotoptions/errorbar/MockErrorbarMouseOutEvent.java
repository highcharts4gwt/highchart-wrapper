
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarMouseOutEvent;

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
