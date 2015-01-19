
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoLineMouseOverEvent
    extends NativeEvent
    implements LineMouseOverEvent
{


    protected JsoLineMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
