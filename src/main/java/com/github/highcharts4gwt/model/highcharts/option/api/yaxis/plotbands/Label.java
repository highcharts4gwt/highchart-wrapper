
package com.github.highcharts4gwt.model.highcharts.option.api.yaxis.plotbands;



/**
 * Text labels for the plot bands
 * 
 */
public interface Label {


    /**
     * Horizontal alignment of the label. Can be one of "left", "center" or "right".
     * 
     */
    String align();

    /**
     * Horizontal alignment of the label. Can be one of "left", "center" or "right".
     * 
     */
    Label align(String align);

    /**
     * Rotation of the text label in degrees .
     * 
     */
    double rotation();

    /**
     * Rotation of the text label in degrees .
     * 
     */
    Label rotation(double rotation);

    /**
     * CSS styles for the text label.
     * 
     */
    String style();

    /**
     * CSS styles for the text label.
     * 
     */
    Label style(String styleAsJsonString);

    /**
     * The string text itself. A subset of HTML is supported.
     * 
     */
    String text();

    /**
     * The string text itself. A subset of HTML is supported.
     * 
     */
    Label text(String text);

    /**
     * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
     * 
     */
    String textAlign();

    /**
     * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
     * 
     */
    Label textAlign(String textAlign);

    /**
     * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
     * 
     */
    boolean useHTML();

    /**
     * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
     * 
     */
    Label useHTML(boolean useHTML);

    /**
     * Vertical alignment of the label relative to the plot band. Can be one of "top", "middle" or "bottom".
     * 
     */
    String verticalAlign();

    /**
     * Vertical alignment of the label relative to the plot band. Can be one of "top", "middle" or "bottom".
     * 
     */
    Label verticalAlign(String verticalAlign);

    /**
     * Horizontal position relative the alignment. Default varies by orientation.
     * 
     */
    double x();

    /**
     * Horizontal position relative the alignment. Default varies by orientation.
     * 
     */
    Label x(double x);

    /**
     * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
     * 
     */
    double y();

    /**
     * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
     * 
     */
    Label y(double y);

    String getFieldAsJsonObject(String fieldName);

    Label setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Label setFunctionAsString(String fieldName, String functionAsString);

}
