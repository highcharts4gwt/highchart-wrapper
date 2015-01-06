
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarMouseOverEvent;

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
