
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesfunnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesFunnelHideEvent
    extends NativeEvent
    implements SeriesFunnelHideEvent
{


    protected JsoSeriesFunnelHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
