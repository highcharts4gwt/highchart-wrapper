
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieHideEvent;

public class MockPieHideEvent
    implements PieHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
