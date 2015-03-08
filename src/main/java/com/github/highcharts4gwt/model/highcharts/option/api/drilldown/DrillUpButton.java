
package com.github.highcharts4gwt.model.highcharts.option.api.drilldown;



/**
 * Options for the drill up button that appears when drilling down on a series. The text for the button is defined in <a href="#lang.drillUpText">lang.drillUpText</a>.
 * 
 */
public interface DrillUpButton {


    /**
     * Positioning options for the button within the <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.
     * 
     */
    String position();

    /**
     * Positioning options for the button within the <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.
     * 
     */
    DrillUpButton position(String positionAsJsonString);

    /**
     * What box to align the button to. Can be either "plotBox" or "spacingBox".
     * 
     */
    String relativeTo();

    /**
     * What box to align the button to. Can be either "plotBox" or "spacingBox".
     * 
     */
    DrillUpButton relativeTo(String relativeTo);

    /**
     * A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
     * 
     */
    String theme();

    /**
     * A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
     * 
     */
    DrillUpButton theme(String themeAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    DrillUpButton setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
