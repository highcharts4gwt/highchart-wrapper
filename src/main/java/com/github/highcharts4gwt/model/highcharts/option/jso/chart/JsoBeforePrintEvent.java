
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.BeforePrintEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBeforePrintEvent
    extends NativeEvent
    implements BeforePrintEvent
{


    protected JsoBeforePrintEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
