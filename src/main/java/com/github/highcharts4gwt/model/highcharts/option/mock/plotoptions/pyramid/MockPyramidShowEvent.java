
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidShowEvent;

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
