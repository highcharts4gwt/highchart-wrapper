
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleMouseOutEvent
    extends NativeEvent
    implements SeriesBubbleMouseOutEvent
{


    protected JsoSeriesBubbleMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
