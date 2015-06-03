
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.DrillupEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDrillupEvent
    extends NativeEvent
    implements DrillupEvent
{


    protected JsoDrillupEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
