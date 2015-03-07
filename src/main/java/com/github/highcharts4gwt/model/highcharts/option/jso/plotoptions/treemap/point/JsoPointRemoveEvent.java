
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.point.PointRemoveEvent;
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