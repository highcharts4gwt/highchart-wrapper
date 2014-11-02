
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.highcharts.api.XAxis;
import com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.StackLabels;

public interface YAxis
    extends XAxis
{


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
