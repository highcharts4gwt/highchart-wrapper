
package com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Back;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Bottom;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Side;

public interface Frame {


    Back back();

    Frame back(Back back);

    Bottom bottom();

    Frame bottom(Bottom bottom);

    Side side();

    Frame side(Side side);

    String getFieldAsJsonObject(String fieldName);

    Frame setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
