
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.point.PointUpdateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointUpdateEvent
    extends NativeEvent
    implements PointUpdateEvent
{


    protected JsoPointUpdateEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
