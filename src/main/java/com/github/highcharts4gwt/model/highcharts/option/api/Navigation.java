
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.navigation.ButtonOptions;


/**
 * A collection of options for buttons and menus appearing in the exporting module.
 * 
 */
public interface Navigation {


    /**
     * A collection of options for buttons appearing in the exporting module.
     * 
     */
    ButtonOptions buttonOptions();

    /**
     * A collection of options for buttons appearing in the exporting module.
     * 
     */
    Navigation buttonOptions(ButtonOptions buttonOptions);

    /**
     * CSS styles for the hover state of the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to 
     * <pre>menuItemHoverStyle: {
     * 	background: '#4572A5',
     * 	color: '#FFFFFF'
     * }</pre>
     * 
     */
    String menuItemHoverStyle();

    /**
     * CSS styles for the hover state of the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to 
     * <pre>menuItemHoverStyle: {
     * 	background: '#4572A5',
     * 	color: '#FFFFFF'
     * }</pre>
     * 
     */
    Navigation menuItemHoverStyle(String menuItemHoverStyleAsJsonString);

    /**
     * CSS styles for the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to 
     * <pre>menuItemStyle: {
     * 	padding: '0 5px',
     * 	background: NONE,
     * 	color: '#303030'
     * }</pre>
     * 
     */
    String menuItemStyle();

    /**
     * CSS styles for the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to 
     * <pre>menuItemStyle: {
     * 	padding: '0 5px',
     * 	background: NONE,
     * 	color: '#303030'
     * }</pre>
     * 
     */
    Navigation menuItemStyle(String menuItemStyleAsJsonString);

    /**
     * CSS styles for the popup menu appearing by default when the export icon is clicked. This menu is rendered in HTML. Defaults to 
     * <pre>menuStyle: {
     * 	border: '1px solid #A0A0A0',
     * 	background: '#FFFFFF'
     * }</pre>
     * 
     */
    String menuStyle();

    /**
     * CSS styles for the popup menu appearing by default when the export icon is clicked. This menu is rendered in HTML. Defaults to 
     * <pre>menuStyle: {
     * 	border: '1px solid #A0A0A0',
     * 	background: '#FFFFFF'
     * }</pre>
     * 
     */
    Navigation menuStyle(String menuStyleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    Navigation setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Navigation setFunctionAsString(String fieldName, String functionAsString);

}
