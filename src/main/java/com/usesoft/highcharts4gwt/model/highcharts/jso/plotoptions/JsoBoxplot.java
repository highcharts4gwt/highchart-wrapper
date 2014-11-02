
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoColumn;

public class JsoBoxplot
    extends JsoColumn
    implements Boxplot
{


    protected JsoBoxplot() {
    }

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoBoxplot fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native String medianColor()
        throws RuntimeException /*-{
        return this["medianColor"] = (this["medianColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot medianColor(String medianColor)
        throws RuntimeException /*-{
        this["medianColor"] = medianColor;
        return this;
    }-*/
    ;

    public final native Number medianWidth()
        throws RuntimeException /*-{
        return this["medianWidth"] = (this["medianWidth"] || 2.0);
    }-*/
    ;

    public final native JsoBoxplot medianWidth(Number medianWidth)
        throws RuntimeException /*-{
        this["medianWidth"] = medianWidth;
        return this;
    }-*/
    ;

    public final native String stemColor()
        throws RuntimeException /*-{
        return this["stemColor"] = (this["stemColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot stemColor(String stemColor)
        throws RuntimeException /*-{
        this["stemColor"] = stemColor;
        return this;
    }-*/
    ;

    public final native String stemDashStyle()
        throws RuntimeException /*-{
        return this["stemDashStyle"] = (this["stemDashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoBoxplot stemDashStyle(String stemDashStyle)
        throws RuntimeException /*-{
        this["stemDashStyle"] = stemDashStyle;
        return this;
    }-*/
    ;

    public final native Number stemWidth()
        throws RuntimeException /*-{
        return this["stemWidth"] = (this["stemWidth"] || null);
    }-*/
    ;

    public final native JsoBoxplot stemWidth(Number stemWidth)
        throws RuntimeException /*-{
        this["stemWidth"] = stemWidth;
        return this;
    }-*/
    ;

    public final native String whiskerColor()
        throws RuntimeException /*-{
        return this["whiskerColor"] = (this["whiskerColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot whiskerColor(String whiskerColor)
        throws RuntimeException /*-{
        this["whiskerColor"] = whiskerColor;
        return this;
    }-*/
    ;

    public final native Number whiskerLengthAsNumber()
        throws RuntimeException /*-{
        return this["whiskerLength"] = (this["whiskerLength"] || null);
    }-*/
    ;

    public final native JsoBoxplot whiskerLengthAsNumber(Number whiskerLengthAsNumber)
        throws RuntimeException /*-{
        this["whiskerLength"] = whiskerLengthAsNumber;
        return this;
    }-*/
    ;

    public final native String whiskerLengthAsString()
        throws RuntimeException /*-{
        return this["whiskerLength"] = (this["whiskerLength"] || "50%");
    }-*/
    ;

    public final native JsoBoxplot whiskerLengthAsString(String whiskerLengthAsString)
        throws RuntimeException /*-{
        this["whiskerLength"] = whiskerLengthAsString;
        return this;
    }-*/
    ;

    public final native Number whiskerWidth()
        throws RuntimeException /*-{
        return this["whiskerWidth"] = (this["whiskerWidth"] || 2.0);
    }-*/
    ;

    public final native JsoBoxplot whiskerWidth(Number whiskerWidth)
        throws RuntimeException /*-{
        this["whiskerWidth"] = whiskerWidth;
        return this;
    }-*/
    ;

}
