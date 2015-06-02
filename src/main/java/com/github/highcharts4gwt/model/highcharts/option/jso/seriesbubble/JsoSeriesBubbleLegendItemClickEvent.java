
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleLegendItemClickEvent
    extends NativeEvent
    implements SeriesBubbleLegendItemClickEvent
{


    protected JsoSeriesBubbleLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
