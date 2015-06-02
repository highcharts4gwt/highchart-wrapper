
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesline.point;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.point.PointRemoveEvent;

public class MockPointRemoveEvent
    implements PointRemoveEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Point Point;

    public com.github.highcharts4gwt.model.highcharts.object.api.Point point() {
        return Point;
    }

}
