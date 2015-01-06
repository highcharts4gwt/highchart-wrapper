
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterHideEvent;

public class MockScatterHideEvent
    implements ScatterHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
