
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.navigation.ButtonOptions;

public class MockNavigation
    implements Navigation
{

    private ButtonOptions buttonOptions;
    private String menuItemHoverStyle;
    private String menuItemStyle;
    private String menuStyle;

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

}
