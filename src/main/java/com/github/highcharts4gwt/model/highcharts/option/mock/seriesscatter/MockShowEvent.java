
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.ShowEvent;

public class MockShowEvent
    implements ShowEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
