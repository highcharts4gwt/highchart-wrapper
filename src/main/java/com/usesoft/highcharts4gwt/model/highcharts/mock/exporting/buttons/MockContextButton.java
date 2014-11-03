
package com.usesoft.highcharts4gwt.model.highcharts.mock.exporting.buttons;

import com.usesoft.highcharts4gwt.model.highcharts.api.exporting.buttons.ContextButton;
import com.usesoft.highcharts4gwt.model.highcharts.mock.navigation.MockButtonOptions;

public class MockContextButton
    extends MockButtonOptions
    implements ContextButton
{

    private String menuItems;
    private String symbol;
    private double x;

    public String menuItems() {
        return menuItems;
    }

    public MockContextButton menuItems(String menuItemsAsJsonStringArray) {
        this.menuItems = menuItemsAsJsonStringArray;
        return this;
    }

    public String symbol() {
        return symbol;
    }

    public MockContextButton symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public double x() {
        return x;
    }

    public MockContextButton x(double x) {
        this.x = x;
        return this;
    }

}
