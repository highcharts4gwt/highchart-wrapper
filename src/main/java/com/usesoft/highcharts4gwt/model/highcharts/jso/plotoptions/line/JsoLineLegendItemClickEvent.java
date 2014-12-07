
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.line;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickEvent;

public class JsoLineLegendItemClickEvent
    extends NativeEvent
    implements LineLegendItemClickEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}