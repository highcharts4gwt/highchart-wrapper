
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.AfterPrintEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAfterPrintEvent
    extends NativeEvent
    implements AfterPrintEvent
{


    protected JsoAfterPrintEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
