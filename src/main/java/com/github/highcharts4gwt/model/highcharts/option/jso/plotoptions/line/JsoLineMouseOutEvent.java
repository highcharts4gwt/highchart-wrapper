
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoLineMouseOutEvent
    extends NativeEvent
    implements LineMouseOutEvent
{


    protected JsoLineMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
