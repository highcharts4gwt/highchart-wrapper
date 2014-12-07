
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.boxplot.point;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.point.PointMouseOverEvent;

public class JsoPointMouseOverEvent
    extends NativeEvent
    implements PointMouseOverEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
