
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.CheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoCheckboxClickEvent
    extends NativeEvent
    implements CheckboxClickEvent
{


    protected JsoCheckboxClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
