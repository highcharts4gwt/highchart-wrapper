
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleShowEvent
    extends NativeEvent
    implements BubbleShowEvent
{


    protected JsoBubbleShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
