
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesfunnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesFunnelMouseOutEvent
    extends NativeEvent
    implements SeriesFunnelMouseOutEvent
{


    protected JsoSeriesFunnelMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
