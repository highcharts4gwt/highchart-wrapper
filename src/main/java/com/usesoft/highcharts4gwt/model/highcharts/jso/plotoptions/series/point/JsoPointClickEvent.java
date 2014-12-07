
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.series.point;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.point.PointClickEvent;

public class JsoPointClickEvent
    extends NativeEvent
    implements PointClickEvent
{


    public final native getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
