
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleMouseOverEvent
    extends NativeEvent
    implements BubbleMouseOverEvent
{


    protected JsoBubbleMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
