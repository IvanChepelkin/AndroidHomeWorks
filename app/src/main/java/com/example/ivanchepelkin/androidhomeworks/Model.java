package com.example.ivanchepelkin.androidhomeworks;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by akabanov on 19.06.2017.
 */
public class Model {
    private List<Integer> mList;
    public Model(){
        mList = new ArrayList<>(3);
        mList.add(0);
        mList.add(0);
        mList.add(0);
    }
    public int getElementValueAtIndex(int _index){
        return mList.get(_index);
    }
    public void setElementValueAtIndex(int _index, int value){
        mList.set(_index, value);
    }
}

