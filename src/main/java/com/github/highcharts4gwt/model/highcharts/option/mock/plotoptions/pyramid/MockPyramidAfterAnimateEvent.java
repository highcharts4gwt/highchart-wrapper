
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidAfterAnimateEvent;

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
