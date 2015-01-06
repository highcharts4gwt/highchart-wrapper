
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSplineMouseOverEvent
    extends NativeEvent
    implements SplineMouseOverEvent
{


    protected JsoSplineMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
