
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.columnrange.point;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.point.PointSelectEvent;

public class JsoPointSelectEvent
    extends NativeEvent
    implements PointSelectEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
