
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleMouseOutEvent
    extends NativeEvent
    implements BubbleMouseOutEvent
{


    protected JsoBubbleMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
