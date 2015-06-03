
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.RedrawEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoRedrawEvent
    extends NativeEvent
    implements RedrawEvent
{


    protected JsoRedrawEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
