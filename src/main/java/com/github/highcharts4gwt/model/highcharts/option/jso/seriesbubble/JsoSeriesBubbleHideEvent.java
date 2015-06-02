
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleHideEvent
    extends NativeEvent
    implements SeriesBubbleHideEvent
{


    protected JsoSeriesBubbleHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
