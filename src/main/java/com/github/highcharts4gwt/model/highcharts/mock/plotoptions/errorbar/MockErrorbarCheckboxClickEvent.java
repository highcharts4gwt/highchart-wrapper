
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickEvent;

public class MockErrorbarCheckboxClickEvent
    implements ErrorbarCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockErrorbarCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
