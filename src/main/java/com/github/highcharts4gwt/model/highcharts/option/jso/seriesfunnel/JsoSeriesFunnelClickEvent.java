
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesfunnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesFunnelClickEvent
    extends NativeEvent
    implements SeriesFunnelClickEvent
{


    protected JsoSeriesFunnelClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
