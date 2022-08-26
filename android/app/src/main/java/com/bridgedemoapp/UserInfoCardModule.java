package com.bridgedemoapp;

import android.widget.Toast;
import android.util.Log;


// https://facebook.github.io/react-native/

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import androidx.annotation.Nullable;

public class UserInfoCardModule extends SimpleViewManager<CustomCardView> {

    public static final String REACT_CLASS = "CustomCardView";
    ReactApplicationContext mCallerContext;

    public UserInfoCardModule(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public CustomCardView createViewInstance(ThemedReactContext context) {
        CustomCardView customCardView = new CustomCardView(context);
        return customCardView;
    }

    @ReactProp(name = "text")
    public void setText(CustomCardView view, @Nullable String text) {
        view.setText(text);
    }

    // @ReactPropGroup(names = {"userId", "name", "location"})
    // public void setText(CustomCardView view, @Nullable String userId,  @Nullable String name,  @Nullable String location) {
    //     view.setText(userId, name, location);
    // }   

}