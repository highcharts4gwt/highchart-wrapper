
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidLegendItemClickEvent;

public class MockPyramidLegendItemClickEvent
    implements PyramidLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
