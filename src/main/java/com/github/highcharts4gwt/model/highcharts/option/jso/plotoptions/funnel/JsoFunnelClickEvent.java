
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelClickEvent
    extends NativeEvent
    implements FunnelClickEvent
{


    protected JsoFunnelClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
