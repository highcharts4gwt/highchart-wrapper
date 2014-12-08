
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.bubble;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickEvent;

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
