
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.HideEvent;
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
