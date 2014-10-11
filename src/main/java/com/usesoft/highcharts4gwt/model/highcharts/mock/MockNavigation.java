
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.Navigation;
import com.usesoft.highcharts4gwt.model.highcharts.api.navigation.ButtonOptions;

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

    public MockNavigation menuItemHoverStyle(String menuItemHoverStyle) {
        this.menuItemHoverStyle = menuItemHoverStyle;
        return this;
    }

    public String menuItemStyle() {
        return menuItemStyle;
    }

    public MockNavigation menuItemStyle(String menuItemStyle) {
        this.menuItemStyle = menuItemStyle;
        return this;
    }

    public String menuStyle() {
        return menuStyle;
    }

    public MockNavigation menuStyle(String menuStyle) {
        this.menuStyle = menuStyle;
        return this;
    }

}
