
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOverEvent;

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
