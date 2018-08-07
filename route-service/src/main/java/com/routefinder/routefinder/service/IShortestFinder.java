package com.routefinder.routefinder.service;

import com.routefinder.routefinder.dto.ShortestWayContainer;

public interface IShortestFinder {

    ShortestWayContainer calculateTheShortestWay(String city);
}
