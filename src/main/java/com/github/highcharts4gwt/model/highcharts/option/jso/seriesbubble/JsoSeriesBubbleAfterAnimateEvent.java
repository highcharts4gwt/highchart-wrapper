
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleAfterAnimateEvent
    extends NativeEvent
    implements SeriesBubbleAfterAnimateEvent
{


    protected JsoSeriesBubbleAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
