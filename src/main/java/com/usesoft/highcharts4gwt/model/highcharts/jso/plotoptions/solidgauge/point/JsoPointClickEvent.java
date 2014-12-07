
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.solidgauge.point;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointClickEvent;

public class JsoPointClickEvent
    extends NativeEvent
    implements PointClickEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
