package com.github.highcharts4gwt.model.array.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class JsoArray<T> extends JsArray<JavaScriptObject> implements Array<T>
{

    protected JsoArray()
    {
    }

    @SuppressWarnings("unchecked")
    @Override
    public final T getItem(int index)
    {
        return (T) get(index);
    }

    @Override
    final public void setValue(int index, T value)
    {
        set(index, (JavaScriptObject) value);
    }

    @Override
    final public <T2 extends T> void addToEnd(T2 value)
    {
        push((JavaScriptObject) value);
    }
}
