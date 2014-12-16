
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOverEvent;

public class MockPyramidMouseOverEvent
    implements PyramidMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
