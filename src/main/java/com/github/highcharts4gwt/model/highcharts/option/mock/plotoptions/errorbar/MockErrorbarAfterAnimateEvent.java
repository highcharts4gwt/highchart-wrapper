
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarAfterAnimateEvent;

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
