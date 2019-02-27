package com.somenew.giminey.main;

import com.somenew.giminey.render.RenderLoader;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo() {
		RenderLoader.registerRender();
	}
}
