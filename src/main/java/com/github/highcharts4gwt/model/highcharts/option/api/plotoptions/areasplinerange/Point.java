
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.point.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.point.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.point.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.point.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.point.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.point.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.point.UpdateHandler;


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
