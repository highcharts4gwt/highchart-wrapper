
package com.github.highcharts4gwt.model.highcharts.option.api.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.FormatterCallback;


/**
 * The stack labels show the total value for each bar in a stacked column or bar chart. The label will be placed on top of
 * 	positive columns and below negative columns. In case of an inverted column chart or a bar chart the label is placed to 
 * 	the right of positive bars and to the left of negative bars.
 * 
 */
public interface StackLabels {


    /**
     * Defines the horizontal alignment of the stack total label.  Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
     * 
     */
    String align();

    /**
     * Defines the horizontal alignment of the stack total label.  Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
     * 
     */
    StackLabels align(String align);

    /**
     * Enable or disable the stack total labels.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable the stack total labels.
     * 
     */
    StackLabels enabled(boolean enabled);

    /**
     * A <a href="http://docs.highcharts.com/#formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
     * 
     */
    String format();

    /**
     * A <a href="http://docs.highcharts.com/#formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
     * 
     */
    StackLabels format(String format);

    /**
     * Callback JavaScript function to format the label. The value is  given by <code>this.total</code>. Defaults to: 
     * <pre>function() {
     * 	return this.total;
     * }</pre>
     * 
     */
    StackLabels formatter(FormatterCallback formatter);

    /**
     * Rotation of the labels in degrees.
     * 
     */
    double rotation();

    /**
     * Rotation of the labels in degrees.
     * 
     */
    StackLabels rotation(double rotation);

    /**
     * CSS styles for the label.
     * 
     */
    String style();

    /**
     * CSS styles for the label.
     * 
     */
    StackLabels style(String styleAsJsonString);

    /**
     * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed with regards to the stack, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are <code>"left"</code>, <code>"center"</code> and <code>"right"</code>. The default value is calculated at runtime and depends on orientation and whether the stack is positive or negative.
     * 
     */
    String textAlign();

    /**
     * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed with regards to the stack, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are <code>"left"</code>, <code>"center"</code> and <code>"right"</code>. The default value is calculated at runtime and depends on orientation and whether the stack is positive or negative.
     * 
     */
    StackLabels textAlign(String textAlign);

    /**
     * Whether to <a href="http://docs.highcharts.com/#formatting$html">use HTML</a> to render the labels.
     * 
     */
    boolean useHTML();

    /**
     * Whether to <a href="http://docs.highcharts.com/#formatting$html">use HTML</a> to render the labels.
     * 
     */
    StackLabels useHTML(boolean useHTML);

    /**
     * Defines the vertical alignment of the stack total label. Can be one of <code>"top"</code>, <code>"middle"</code> or <code>"bottom"</code>. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
     * 
     */
    String verticalAlign();

    /**
     * Defines the vertical alignment of the stack total label. Can be one of <code>"top"</code>, <code>"middle"</code> or <code>"bottom"</code>. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
     * 
     */
    StackLabels verticalAlign(String verticalAlign);

    /**
     * The x position offset of the label relative to the left of the stacked bar. The default value is calculated at runtime and depends on orientation and whether the stack is positive or negative.
     * 
     */
    double x();

    /**
     * The x position offset of the label relative to the left of the stacked bar. The default value is calculated at runtime and depends on orientation and whether the stack is positive or negative.
     * 
     */
    StackLabels x(double x);

    /**
     * The y position offset of the label relative to the tick position on the axis. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
     * 
     */
    double y();

    /**
     * The y position offset of the label relative to the tick position on the axis. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
     * 
     */
    StackLabels y(double y);

    String getFieldAsJsonObject(String fieldName);

    StackLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    StackLabels setFunctionAsString(String fieldName, String functionAsString);

}
