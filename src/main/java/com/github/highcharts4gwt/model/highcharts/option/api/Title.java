
package com.github.highcharts4gwt.model.highcharts.option.api;



/**
 * The chart's main title.
 * 
 */
public interface Title {


    /**
     * The horizontal alignment of the title. Can be one of "left", "center" and "right".
     * 
     */
    String align();

    /**
     * The horizontal alignment of the title. Can be one of "left", "center" and "right".
     * 
     */
    Title align(String align);

    /**
     * When the title is floating, the plot area will not move to make space for it.
     * 
     */
    boolean floating();

    /**
     * When the title is floating, the plot area will not move to make space for it.
     * 
     */
    Title floating(boolean floating);

    /**
     * The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area.
     * 
     */
    double margin();

    /**
     * The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area.
     * 
     */
    Title margin(double margin);

    /**
     * CSS styles for the title. Use this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
     * 
     */
    String style();

    /**
     * CSS styles for the title. Use this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
     * 
     */
    Title style(String styleAsJsonString);

    /**
     * The title of the chart. To disable the title, set the <code>text</code> to <code>null</code>.
     * 
     */
    String text();

    /**
     * The title of the chart. To disable the title, set the <code>text</code> to <code>null</code>.
     * 
     */
    Title text(String text);

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
     * 
     */
    boolean useHTML();

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
     * 
     */
    Title useHTML(boolean useHTML);

    /**
     * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
     * 
     */
    String verticalAlign();

    /**
     * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
     * 
     */
    Title verticalAlign(String verticalAlign);

    /**
     * The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
     * 
     */
    double x();

    /**
     * The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
     * 
     */
    Title x(double x);

    /**
     * The y position of the title relative to the alignment within <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.
     * 
     */
    double y();

    /**
     * The y position of the title relative to the alignment within <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.
     * 
     */
    Title y(double y);

    String getFieldAsJsonObject(String fieldName);

    Title setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
