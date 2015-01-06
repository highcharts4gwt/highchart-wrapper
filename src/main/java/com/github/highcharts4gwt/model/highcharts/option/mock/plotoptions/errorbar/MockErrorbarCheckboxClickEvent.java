
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarCheckboxClickEvent;

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
