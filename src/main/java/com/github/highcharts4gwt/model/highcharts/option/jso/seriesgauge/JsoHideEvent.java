
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.HideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoHideEvent
    extends NativeEvent
    implements HideEvent
{


    protected JsoHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
