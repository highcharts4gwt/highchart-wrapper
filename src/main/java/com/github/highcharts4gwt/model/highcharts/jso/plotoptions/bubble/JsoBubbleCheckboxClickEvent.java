
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleCheckboxClickEvent
    extends NativeEvent
    implements BubbleCheckboxClickEvent
{


    protected JsoBubbleCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}