
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidShowEvent;

public class MockPyramidShowEvent
    implements PyramidShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
