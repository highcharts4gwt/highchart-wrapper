
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarClickEvent;

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
