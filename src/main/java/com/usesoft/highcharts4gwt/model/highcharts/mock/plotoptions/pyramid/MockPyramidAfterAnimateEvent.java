
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidAfterAnimateEvent;

public class MockPyramidAfterAnimateEvent
    implements PyramidAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
