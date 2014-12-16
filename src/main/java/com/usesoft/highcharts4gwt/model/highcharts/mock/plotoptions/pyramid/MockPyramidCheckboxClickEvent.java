
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidCheckboxClickEvent;

public class MockPyramidCheckboxClickEvent
    implements PyramidCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
