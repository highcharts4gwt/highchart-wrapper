
package com.github.highcharts4gwt.model.highcharts.option.api.navigation;



/**
 * A collection of options for buttons appearing in the exporting module.
 * 
 */
public interface ButtonOptions {


    /**
     * Alignment for the buttons.
     * 
     */
    String align();

    /**
     * Alignment for the buttons.
     * 
     */
    ButtonOptions align(String align);

    /**
     * Whether to enable buttons.
     * 
     */
    boolean enabled();

    /**
     * Whether to enable buttons.
     * 
     */
    ButtonOptions enabled(boolean enabled);

    /**
     * Pixel height of the buttons.
     * 
     */
    double height();

    /**
     * Pixel height of the buttons.
     * 
     */
    ButtonOptions height(double height);

    /**
     * Fill color for the symbol within the button.
     * 
     */
    String symbolFill();

    /**
     * Fill color for the symbol within the button.
     * 
     */
    ButtonOptions symbolFill(String symbolFill);

    /**
     * The pixel size of the symbol on the button.
     * 
     */
    double symbolSize();

    /**
     * The pixel size of the symbol on the button.
     * 
     */
    ButtonOptions symbolSize(double symbolSize);

    /**
     * The color of the symbol's stroke or line.
     * 
     */
    String symbolStroke();

    /**
     * The color of the symbol's stroke or line.
     * 
     */
    ButtonOptions symbolStroke(String symbolStroke);

    /**
     * The pixel stroke width of the symbol on the button.
     * 
     */
    double symbolStrokeWidth();

    /**
     * The pixel stroke width of the symbol on the button.
     * 
     */
    ButtonOptions symbolStrokeWidth(double symbolStrokeWidth);

    /**
     * The x position of the center of the symbol inside the button.
     * 
     */
    double symbolX();

    /**
     * The x position of the center of the symbol inside the button.
     * 
     */
    ButtonOptions symbolX(double symbolX);

    /**
     * The y position of the center of the symbol inside the button.
     * 
     */
    double symbolY();

    /**
     * The y position of the center of the symbol inside the button.
     * 
     */
    ButtonOptions symbolY(double symbolY);

    /**
     * A text string to add to the individual button.
     * 
     */
    String text();

    /**
     * A text string to add to the individual button.
     * 
     */
    ButtonOptions text(String text);

    /**
     * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
     * 
     */
    String theme();

    /**
     * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
     * 
     */
    ButtonOptions theme(String themeAsJsonString);

    /**
     * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
     * 
     */
    String verticalAlign();

    /**
     * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
     * 
     */
    ButtonOptions verticalAlign(String verticalAlign);

    /**
     * The pixel width of the button.
     * 
     */
    double width();

    /**
     * The pixel width of the button.
     * 
     */
    ButtonOptions width(double width);

    /**
     * The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
     * 
     */
    double y();

    /**
     * The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
     * 
     */
    ButtonOptions y(double y);

    String getFieldAsJsonObject(String fieldName);

    ButtonOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    ButtonOptions setFunctionAsString(String fieldName, String functionAsString);

}
