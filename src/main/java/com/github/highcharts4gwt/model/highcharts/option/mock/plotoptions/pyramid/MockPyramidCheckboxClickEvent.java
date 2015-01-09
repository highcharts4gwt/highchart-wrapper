
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidCheckboxClickEvent;

public class MockPyramidCheckboxClickEvent
    implements PyramidCheckboxClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series getSeries() {
        return Series;
    }

    public MockPyramidCheckboxClickEvent Series(com.github.highcharts4gwt.model.highcharts.object.api.Series Series) {
        this.Series = Series;
        return this;
    }

}