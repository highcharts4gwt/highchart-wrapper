
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.line.marker;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.marker.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.marker.states.Select;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * 
 */
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

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoStates setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoStates setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + valueToBeEvaluated + ')');
        return this;
    }-*/
    ;

}
