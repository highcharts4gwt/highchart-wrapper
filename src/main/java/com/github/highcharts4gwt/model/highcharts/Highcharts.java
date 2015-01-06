package com.github.highcharts4gwt.model.highcharts;

import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;

public class Highcharts
{
    private static native void setOptions(GlobalOptions options)
    /*-{
            Highcharts.setOptions(options);
    }-*/;
}
