
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelHideEvent
    extends NativeEvent
    implements FunnelHideEvent
{


    protected JsoFunnelHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
