
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoArearangeMouseOverEvent
    extends NativeEvent
    implements ArearangeMouseOverEvent
{


    protected JsoArearangeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
