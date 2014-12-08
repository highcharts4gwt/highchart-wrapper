
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.spline;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOutEvent;

public class JsoSplineMouseOutEvent
    extends NativeEvent
    implements SplineMouseOutEvent
{


    protected JsoSplineMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
