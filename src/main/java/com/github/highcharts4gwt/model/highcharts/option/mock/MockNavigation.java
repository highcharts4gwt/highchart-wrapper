
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.navigation.ButtonOptions;


/**
 * A collection of options for buttons and menus appearing in the exporting module.
 * 
 */
public class MockNavigation
    implements Navigation
{

    private ButtonOptions buttonOptions;
    private String menuItemHoverStyle;
    private String menuItemStyle;
    private String menuStyle;
    private String genericField;
    private String functionAsString;

    public ButtonOptions buttonOptions() {
        return buttonOptions;
    }

    public MockNavigation buttonOptions(ButtonOptions buttonOptions) {
        this.buttonOptions = buttonOptions;
        return this;
    }

    public String menuItemHoverStyle() {
        return menuItemHoverStyle;
    }

    public MockNavigation menuItemHoverStyle(String menuItemHoverStyleAsJsonString) {
        this.menuItemHoverStyle = menuItemHoverStyleAsJsonString;
        return this;
    }

    public String menuItemStyle() {
        return menuItemStyle;
    }

    public MockNavigation menuItemStyle(String menuItemStyleAsJsonString) {
        this.menuItemStyle = menuItemStyleAsJsonString;
        return this;
    }

    public String menuStyle() {
        return menuStyle;
    }

    public MockNavigation menuStyle(String menuStyleAsJsonString) {
        this.menuStyle = menuStyleAsJsonString;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockNavigation setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockNavigation setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
