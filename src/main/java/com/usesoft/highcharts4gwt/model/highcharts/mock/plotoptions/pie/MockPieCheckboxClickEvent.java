
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pie;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieCheckboxClickEvent;

public class MockPieCheckboxClickEvent
    implements PieCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPieCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
