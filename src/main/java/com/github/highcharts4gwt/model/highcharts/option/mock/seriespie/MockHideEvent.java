
package com.github.highcharts4gwt.model.highcharts.option.mock.seriespie;

import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.HideEvent;

public class MockHideEvent
    implements HideEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
