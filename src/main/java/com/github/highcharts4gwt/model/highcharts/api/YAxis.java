
package com.github.highcharts4gwt.model.highcharts.api;

import com.github.highcharts4gwt.model.highcharts.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.api.yaxis.StackLabels;
import com.github.highcharts4gwt.model.highcharts.api.yaxis.YAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.api.yaxis.YAxisSetExtremesHandler;

public interface YAxis
    extends XAxis
{


    void addYAxisAfterSetExtremesHandler(YAxisAfterSetExtremesHandler yAxisAfterSetExtremesHandler);

    void addYAxisSetExtremesHandler(YAxisSetExtremesHandler yAxisSetExtremesHandler);

    String gridLineInterpolation();

    YAxis gridLineInterpolation(String gridLineInterpolation);

    String maxColor();

    YAxis maxColor(String maxColor);

    String minColor();

    YAxis minColor(String minColor);

    boolean reversedStacks();

    YAxis reversedStacks(boolean reversedStacks);

    StackLabels stackLabels();

    YAxis stackLabels(StackLabels stackLabels);

}
