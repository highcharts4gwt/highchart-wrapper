
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesbar;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.MouseOverEvent;

public class MockMouseOverEvent
    implements MouseOverEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
