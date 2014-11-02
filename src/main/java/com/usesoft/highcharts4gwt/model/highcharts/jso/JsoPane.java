
package com.usesoft.highcharts4gwt.model.highcharts.jso;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.Pane;

public class JsoPane
    extends JavaScriptObject
    implements Pane
{


    protected JsoPane() {
    }

    public final native String background()
        throws RuntimeException /*-{
        this["background"] = (this["background"] || []);
        return JSON.stringify(this["background"]);
    }-*/
    ;

    public final native JsoPane background(String backgroundAsJsonStringArray)
        throws RuntimeException /*-{
        this["background"] = JSON.parse(backgroundAsJsonStringArray);
        return this;
    }-*/
    ;

    public final native Number endAngle()
        throws RuntimeException /*-{
        return this["endAngle"] = (this["endAngle"] || null);
    }-*/
    ;

    public final native JsoPane endAngle(Number endAngle)
        throws RuntimeException /*-{
        this["endAngle"] = endAngle;
        return this;
    }-*/
    ;

    public final native Number sizeAsNumber()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || null);
    }-*/
    ;

    public final native JsoPane sizeAsNumber(Number sizeAsNumber)
        throws RuntimeException /*-{
        this["size"] = sizeAsNumber;
        return this;
    }-*/
    ;

    public final native String sizeAsString()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || "85%");
    }-*/
    ;

    public final native JsoPane sizeAsString(String sizeAsString)
        throws RuntimeException /*-{
        this["size"] = sizeAsString;
        return this;
    }-*/
    ;

    public final native Number startAngle()
        throws RuntimeException /*-{
        return this["startAngle"] = (this["startAngle"] || null);
    }-*/
    ;

    public final native JsoPane startAngle(Number startAngle)
        throws RuntimeException /*-{
        this["startAngle"] = startAngle;
        return this;
    }-*/
    ;

}
