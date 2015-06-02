
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.point.PointRemoveEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointRemoveEvent
    extends NativeEvent
    implements PointRemoveEvent
{


    protected JsoPointRemoveEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
