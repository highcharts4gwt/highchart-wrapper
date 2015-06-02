
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataUpdateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDataUpdateEvent
    extends NativeEvent
    implements DataUpdateEvent
{


    protected JsoDataUpdateEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
