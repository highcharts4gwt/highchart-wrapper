
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDataMouseOverEvent
    extends NativeEvent
    implements DataMouseOverEvent
{


    protected JsoDataMouseOverEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
