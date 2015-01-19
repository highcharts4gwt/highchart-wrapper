
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreaMouseOverEvent
    extends NativeEvent
    implements AreaMouseOverEvent
{


    protected JsoAreaMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
