
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleAfterAnimateEvent
    extends NativeEvent
    implements BubbleAfterAnimateEvent
{


    protected JsoBubbleAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
