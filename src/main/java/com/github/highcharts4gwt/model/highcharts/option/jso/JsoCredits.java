
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Credits;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoCredits
    extends JavaScriptObject
    implements Credits
{


    protected JsoCredits() {
    }

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoCredits enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native String href()
        throws RuntimeException /*-{
        return this["href"] = (this["href"] || "http://www.highcharts.com");
    }-*/
    ;

    public final native JsoCredits href(String href)
        throws RuntimeException /*-{
        this["href"] = href;
        return this;
    }-*/
    ;

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || {});
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoCredits position(String positionAsJsonString)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(positionAsJsonString);
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoCredits style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String text()
        throws RuntimeException /*-{
        return this["text"] = (this["text"] || "Highcharts.com");
    }-*/
    ;

    public final native JsoCredits text(String text)
        throws RuntimeException /*-{
        this["text"] = text;
        return this;
    }-*/
    ;

}
