
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.point.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.point.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.point.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.point.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.point.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.point.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.point.UpdateHandler;


/**
 * Properties for each single point
 * 
 */
public interface Point {


    void addClickHandler(ClickHandler clickHandler);

    void addMouseOutHandler(MouseOutHandler mouseOutHandler);

    void addMouseOverHandler(MouseOverHandler mouseOverHandler);

    void addRemoveHandler(RemoveHandler removeHandler);

    void addSelectHandler(SelectHandler selectHandler);

    void addUnselectHandler(UnselectHandler unselectHandler);

    void addUpdateHandler(UpdateHandler updateHandler);

    String getFieldAsJsonObject(String fieldName);

    Point setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Point setFunctionAsString(String fieldName, String functionAsString);

}
