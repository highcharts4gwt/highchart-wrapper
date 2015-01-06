
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidHideEvent;

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
