
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidLegendItemClickEvent;

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
