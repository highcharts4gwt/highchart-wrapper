
package com.github.highcharts4gwt.model.highcharts.option.api.exporting.buttons;



/**
 * Options for the export button.
 * 
 */
public interface ContextButton {


    /**
     * Alignment for the buttons.
     * 
     */
    String align();

    /**
     * Alignment for the buttons.
     * 
     */
    ContextButton align(String align);

    /**
     * Whether to enable buttons.
     * 
     */
    boolean enabled();

    /**
     * Whether to enable buttons.
     * 
     */
    ContextButton enabled(boolean enabled);

    /**
     * Pixel height of the buttons.
     * 
     */
    double height();

    /**
     * Pixel height of the buttons.
     * 
     */
    ContextButton height(double height);

    /**
     * <p>A collection of config options for the menu items. Each options object consists of a <code>text</code> option which is a string to show in the menu item, as well as an <code>onclick</code> parameter which is a callback function to run on click.</p> <p>By default, there is the "Print" menu item plus one menu item for each of the available export types. Menu items can be customized by defining a new array of items and assigning  <code>null</code> to unwanted positions (see override example below).</p>
     * 
     */
    String menuItems();

    /**
     * <p>A collection of config options for the menu items. Each options object consists of a <code>text</code> option which is a string to show in the menu item, as well as an <code>onclick</code> parameter which is a callback function to run on click.</p> <p>By default, there is the "Print" menu item plus one menu item for each of the available export types. Menu items can be customized by defining a new array of items and assigning  <code>null</code> to unwanted positions (see override example below).</p>
     * 
     */
    ContextButton menuItems(String menuItemsAsJsonStringArray);

    /**
     * The symbol for the button. Points to a definition function in the  <code>Highcharts.Renderer.symbols</code> collection. The default <code>exportIcon</code> function is part of the exporting module.
     * 
     */
    String symbol();

    /**
     * The symbol for the button. Points to a definition function in the  <code>Highcharts.Renderer.symbols</code> collection. The default <code>exportIcon</code> function is part of the exporting module.
     * 
     */
    ContextButton symbol(String symbol);

    /**
     * See <a class="internal" href="#navigation.buttonOptions">navigation.buttonOptions</a> =&gt; symbolFill.
     * 
     */
    String symbolFill();

    /**
     * See <a class="internal" href="#navigation.buttonOptions">navigation.buttonOptions</a> =&gt; symbolFill.
     * 
     */
    ContextButton symbolFill(String symbolFill);

    /**
     * The pixel size of the symbol on the button.
     * 
     */
    double symbolSize();

    /**
     * The pixel size of the symbol on the button.
     * 
     */
    ContextButton symbolSize(double symbolSize);

    /**
     * The color of the symbol's stroke or line.
     * 
     */
    String symbolStroke();

    /**
     * The color of the symbol's stroke or line.
     * 
     */
    ContextButton symbolStroke(String symbolStroke);

    /**
     * The pixel stroke width of the symbol on the button.
     * 
     */
    double symbolStrokeWidth();

    /**
     * The pixel stroke width of the symbol on the button.
     * 
     */
    ContextButton symbolStrokeWidth(double symbolStrokeWidth);

    /**
     * The x position of the center of the symbol inside the button.
     * 
     */
    double symbolX();

    /**
     * The x position of the center of the symbol inside the button.
     * 
     */
    ContextButton symbolX(double symbolX);

    /**
     * The y position of the center of the symbol inside the button.
     * 
     */
    double symbolY();

    /**
     * The y position of the center of the symbol inside the button.
     * 
     */
    ContextButton symbolY(double symbolY);

    /**
     * A text string to add to the individual button.
     * 
     */
    String text();

    /**
     * A text string to add to the individual button.
     * 
     */
    ContextButton text(String text);

    /**
     * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
     * 
     */
    String theme();

    /**
     * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
     * 
     */
    ContextButton theme(String themeAsJsonString);

    /**
     * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
     * 
     */
    String verticalAlign();

    /**
     * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
     * 
     */
    ContextButton verticalAlign(String verticalAlign);

    /**
     * The pixel width of the button.
     * 
     */
    double width();

    /**
     * The pixel width of the button.
     * 
     */
    ContextButton width(double width);

    /**
     * The horizontal position of the button relative to the <code>align</code>
     *  option.
     * 
     */
    double x();

    /**
     * The horizontal position of the button relative to the <code>align</code>
     *  option.
     * 
     */
    ContextButton x(double x);

    /**
     * The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
     * 
     */
    double y();

    /**
     * The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
     * 
     */
    ContextButton y(double y);

    String getFieldAsJsonObject(String fieldName);

    ContextButton setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
