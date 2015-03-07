
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.NoData;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoNoData
    extends JavaScriptObject
    implements NoData
{


    protected JsoNoData() {
    }

    public final native String attr()
        throws RuntimeException /*-{
        this["attr"] = (this["attr"] || {});
        return JSON.stringify(this["attr"]);
    }-*/
    ;

    public final native JsoNoData attr(String attrAsJsonString)
        throws RuntimeException /*-{
        this["attr"] = JSON.parse(attrAsJsonString);
        return this;
    }-*/
    ;

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || JSON.parse('{ "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }'));
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoNoData position(String positionAsJsonString)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(positionAsJsonString);
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{ "fontSize": "12px", "fontWeight": "bold", "color": "#60606a" }'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoNoData style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoNoData setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
