
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidHideEvent;

public class MockPyramidHideEvent
    implements PyramidHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
