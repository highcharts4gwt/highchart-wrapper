
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.polygon.marker;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.marker.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.marker.states.Select;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoStates
    extends JavaScriptObject
    implements States
{


    protected JsoStates() {
    }

    public final native Hover hover()
        throws RuntimeException /*-{
        return this["hover"] = (this["hover"] || {});
    }-*/
    ;

    public final native JsoStates hover(Hover hover)
        throws RuntimeException /*-{
        this["hover"] = hover;
        return this;
    }-*/
    ;

    public final native Select select()
        throws RuntimeException /*-{
        return this["select"] = (this["select"] || {});
    }-*/
    ;

    public final native JsoStates select(Select select)
        throws RuntimeException /*-{
        this["select"] = select;
        return this;
    }-*/
    ;

}
