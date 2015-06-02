
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesfunnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesFunnelMouseOverEvent
    extends NativeEvent
    implements SeriesFunnelMouseOverEvent
{


    protected JsoSeriesFunnelMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
