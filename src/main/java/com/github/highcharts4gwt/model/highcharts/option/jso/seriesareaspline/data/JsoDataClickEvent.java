
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.data.DataClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDataClickEvent
    extends NativeEvent
    implements DataClickEvent
{


    protected JsoDataClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
