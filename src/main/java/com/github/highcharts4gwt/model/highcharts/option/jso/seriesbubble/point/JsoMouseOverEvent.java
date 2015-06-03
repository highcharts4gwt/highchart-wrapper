
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.point.MouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoMouseOverEvent
    extends NativeEvent
    implements MouseOverEvent
{


    protected JsoMouseOverEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
