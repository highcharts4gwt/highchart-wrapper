
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.highcharts.api.navigation.ButtonOptions;

public interface Navigation {


    ButtonOptions buttonOptions();

    Navigation buttonOptions(ButtonOptions buttonOptions);

    String menuItemHoverStyle();

    Navigation menuItemHoverStyle(String menuItemHoverStyle);

    String menuItemStyle();

    Navigation menuItemStyle(String menuItemStyle);

    String menuStyle();

    Navigation menuStyle(String menuStyle);

}
