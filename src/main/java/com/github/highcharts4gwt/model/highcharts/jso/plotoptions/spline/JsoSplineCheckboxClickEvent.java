
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSplineCheckboxClickEvent
    extends NativeEvent
    implements SplineCheckboxClickEvent
{


    protected JsoSplineCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
