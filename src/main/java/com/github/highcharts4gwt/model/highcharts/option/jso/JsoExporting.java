
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Exporting;
import com.github.highcharts4gwt.model.highcharts.option.api.exporting.Buttons;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoExporting
    extends JavaScriptObject
    implements Exporting
{


    protected JsoExporting() {
    }

    public final native Buttons buttons()
        throws RuntimeException /*-{
        return this["buttons"] = (this["buttons"] || {});
    }-*/
    ;

    public final native JsoExporting buttons(Buttons buttons)
        throws RuntimeException /*-{
        this["buttons"] = buttons;
        return this;
    }-*/
    ;

    public final native String chartOptions()
        throws RuntimeException /*-{
        this["chartOptions"] = (this["chartOptions"] || {});
        return JSON.stringify(this["chartOptions"]);
    }-*/
    ;

    public final native JsoExporting chartOptions(String chartOptionsAsJsonString)
        throws RuntimeException /*-{
        this["chartOptions"] = JSON.parse(chartOptionsAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoExporting enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native String filename()
        throws RuntimeException /*-{
        return this["filename"] = (this["filename"] || "chart");
    }-*/
    ;

    public final native JsoExporting filename(String filename)
        throws RuntimeException /*-{
        this["filename"] = filename;
        return this;
    }-*/
    ;

    public final native String formAttributes()
        throws RuntimeException /*-{
        this["formAttributes"] = (this["formAttributes"] || JSON.parse(''));
        return JSON.stringify(this["formAttributes"]);
    }-*/
    ;

    public final native JsoExporting formAttributes(String formAttributesAsJsonString)
        throws RuntimeException /*-{
        this["formAttributes"] = JSON.parse(formAttributesAsJsonString);
        return this;
    }-*/
    ;

    public final native double scale()
        throws RuntimeException /*-{
        return this["scale"] = (this["scale"] || 2.0);
    }-*/
    ;

    public final native JsoExporting scale(double scale)
        throws RuntimeException /*-{
        this["scale"] = scale;
        return this;
    }-*/
    ;

    public final native double sourceHeight()
        throws RuntimeException /*-{
        return this["sourceHeight"] = (this["sourceHeight"] || '');
    }-*/
    ;

    public final native JsoExporting sourceHeight(double sourceHeight)
        throws RuntimeException /*-{
        this["sourceHeight"] = sourceHeight;
        return this;
    }-*/
    ;

    public final native double sourceWidth()
        throws RuntimeException /*-{
        return this["sourceWidth"] = (this["sourceWidth"] || '');
    }-*/
    ;

    public final native JsoExporting sourceWidth(double sourceWidth)
        throws RuntimeException /*-{
        this["sourceWidth"] = sourceWidth;
        return this;
    }-*/
    ;

    public final native String type()
        throws RuntimeException /*-{
        return this["type"] = (this["type"] || "image/png");
    }-*/
    ;

    public final native JsoExporting type(String type)
        throws RuntimeException /*-{
        this["type"] = type;
        return this;
    }-*/
    ;

    public final native String url()
        throws RuntimeException /*-{
        return this["url"] = (this["url"] || "http://export.highcharts.com");
    }-*/
    ;

    public final native JsoExporting url(String url)
        throws RuntimeException /*-{
        this["url"] = url;
        return this;
    }-*/
    ;

    public final native double width()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || undefined);
    }-*/
    ;

    public final native JsoExporting width(double width)
        throws RuntimeException /*-{
        this["width"] = width;
        return this;
    }-*/
    ;

}