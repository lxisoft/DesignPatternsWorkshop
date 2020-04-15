package com.jishnu.animalgame.util.factory;

import com.jishnu.animalgame.config.PlatformType;
import com.jishnu.animalgame.model.ForestJI;
import com.jishnu.animalgame.view.IotView;
import com.jishnu.animalgame.view.MobileView;
import com.jishnu.animalgame.view.ViewInterface;
import com.jishnu.animalgame.view.WebView;

public class ViewFactory {

	public static ViewInterface<ForestJI> getView(PlatformType type) {
		
		ViewInterface<ForestJI> view = null;
		
		switch(type) {
			case IOT: view = new IotView();break;
			case MOBILE: view = new MobileView();break;
			case WEB: view = new WebView();break;
		}
		
		return view;
		
	}
}
