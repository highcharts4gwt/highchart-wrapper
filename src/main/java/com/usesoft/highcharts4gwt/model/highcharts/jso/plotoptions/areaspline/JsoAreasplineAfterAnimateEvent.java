
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.areaspline;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineAfterAnimateEvent;

public class JsoAreasplineAfterAnimateEvent
    extends NativeEvent
    implements AreasplineAfterAnimateEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
