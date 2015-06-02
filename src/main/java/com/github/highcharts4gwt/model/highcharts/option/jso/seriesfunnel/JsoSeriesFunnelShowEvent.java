
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesfunnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesFunnelShowEvent
    extends NativeEvent
    implements SeriesFunnelShowEvent
{


    protected JsoSeriesFunnelShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
