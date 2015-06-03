
package com.github.highcharts4gwt.model.highcharts.option.mock.seriespie;

import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.MouseOutEvent;

public class MockMouseOutEvent
    implements MouseOutEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
