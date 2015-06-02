
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesscatter.point;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.point.PointRemoveEvent;

public class MockPointRemoveEvent
    implements PointRemoveEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Point Point;

    public com.github.highcharts4gwt.model.highcharts.object.api.Point point() {
        return Point;
    }

}
