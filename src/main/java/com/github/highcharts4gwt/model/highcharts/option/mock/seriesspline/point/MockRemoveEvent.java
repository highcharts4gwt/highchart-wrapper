
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesspline.point;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.point.RemoveEvent;

public class MockRemoveEvent
    implements RemoveEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Point Point;

    public com.github.highcharts4gwt.model.highcharts.object.api.Point point() {
        return Point;
    }

}