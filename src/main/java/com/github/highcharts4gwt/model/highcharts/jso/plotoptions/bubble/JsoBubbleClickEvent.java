
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleClickEvent
    extends NativeEvent
    implements BubbleClickEvent
{


    protected JsoBubbleClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}