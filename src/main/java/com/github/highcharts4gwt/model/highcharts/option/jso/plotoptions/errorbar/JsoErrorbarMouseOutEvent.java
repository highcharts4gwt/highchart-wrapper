
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoErrorbarMouseOutEvent
    extends NativeEvent
    implements ErrorbarMouseOutEvent
{


    protected JsoErrorbarMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
