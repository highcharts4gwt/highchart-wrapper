
package com.github.highcharts4gwt.model.highcharts.option.api;


public interface Credits {


    boolean enabled();

    Credits enabled(boolean enabled);

    String href();

    Credits href(String href);

    String position();

    Credits position(String positionAsJsonString);

    String style();

    Credits style(String styleAsJsonString);

    String text();

    Credits text(String text);

}
