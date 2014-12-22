
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSplineClickEvent
    extends NativeEvent
    implements SplineClickEvent
{


    protected JsoSplineClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
