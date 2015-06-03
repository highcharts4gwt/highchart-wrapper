
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.LoadEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoLoadEvent
    extends NativeEvent
    implements LoadEvent
{


    protected JsoLoadEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
