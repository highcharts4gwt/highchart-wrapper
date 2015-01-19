
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplineMouseOutEvent
    extends NativeEvent
    implements AreasplineMouseOutEvent
{


    protected JsoAreasplineMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
