
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleHideEvent
    extends NativeEvent
    implements BubbleHideEvent
{


    protected JsoBubbleHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
