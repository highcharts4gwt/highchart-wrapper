
package com.github.highcharts4gwt.model.highcharts.option.mock.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.ClickEvent;

public class MockClickEvent
    implements ClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}