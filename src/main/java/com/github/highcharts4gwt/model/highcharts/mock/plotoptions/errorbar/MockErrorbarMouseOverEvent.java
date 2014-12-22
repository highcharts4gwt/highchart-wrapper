
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverEvent;

public class MockErrorbarMouseOverEvent
    implements ErrorbarMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
