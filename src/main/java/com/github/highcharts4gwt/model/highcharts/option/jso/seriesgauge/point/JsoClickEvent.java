
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.ClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoClickEvent
    extends NativeEvent
    implements ClickEvent
{


    protected JsoClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
