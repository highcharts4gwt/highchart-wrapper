
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.UpdateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoUpdateEvent
    extends NativeEvent
    implements UpdateEvent
{


    protected JsoUpdateEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
