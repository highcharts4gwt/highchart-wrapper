
package com.usesoft.highcharts4gwt.model.highcharts.mock.chart.options3d;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.Frame;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Back;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Bottom;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Side;

public class MockFrame
    implements Frame
{

    private Back back;
    private Bottom bottom;
    private Side side;

    public Back back() {
        return back;
    }

    public MockFrame back(Back back) {
        this.back = back;
        return this;
    }

    public Bottom bottom() {
        return bottom;
    }

    public MockFrame bottom(Bottom bottom) {
        this.bottom = bottom;
        return this;
    }

    public Side side() {
        return side;
    }

    public MockFrame side(Side side) {
        this.side = side;
        return this;
    }

}
