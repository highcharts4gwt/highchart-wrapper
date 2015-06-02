
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleMouseOverEvent
    extends NativeEvent
    implements SeriesBubbleMouseOverEvent
{


    protected JsoSeriesBubbleMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
