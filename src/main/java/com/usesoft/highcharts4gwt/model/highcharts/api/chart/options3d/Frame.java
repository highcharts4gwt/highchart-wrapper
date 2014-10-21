
package com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Back;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Bottom;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Side;

public interface Frame {


    Back back();

    Frame back(Back back);

    Bottom bottom();

    Frame bottom(Bottom bottom);

    Side side();

    Frame side(Side side);

}
