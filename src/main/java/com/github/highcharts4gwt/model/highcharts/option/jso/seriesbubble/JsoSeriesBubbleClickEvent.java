
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleClickEvent
    extends NativeEvent
    implements SeriesBubbleClickEvent
{


    protected JsoSeriesBubbleClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
