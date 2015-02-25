
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.polygon.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.point.PointSelectEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointSelectEvent
    extends NativeEvent
    implements PointSelectEvent
{


    protected JsoPointSelectEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
