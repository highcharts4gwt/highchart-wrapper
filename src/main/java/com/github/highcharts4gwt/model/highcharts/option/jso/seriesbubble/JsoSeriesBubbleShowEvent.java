
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleShowEvent
    extends NativeEvent
    implements SeriesBubbleShowEvent
{


    protected JsoSeriesBubbleShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
