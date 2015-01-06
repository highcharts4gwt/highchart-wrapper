
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarHideEvent;

public class MockErrorbarHideEvent
    implements ErrorbarHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
