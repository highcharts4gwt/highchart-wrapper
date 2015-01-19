
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.heatmap.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointClickEvent
    extends NativeEvent
    implements PointClickEvent
{


    protected JsoPointClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
