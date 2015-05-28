package com.github.highcharts4gwt.model.array.api;

public interface Array<T>
{
    T getItem(int index);

    int length();

    <T2 extends T> void addToEnd(T2 value); // Cannot use JsArray method name otherwise error
                            // overload using erasure
    
    /**
     * Replacement for native set method
     * 
     * @param index
     * @param value 
     */
    void setValue(int index, T value);
    
    void setLength(int newLength);
}
