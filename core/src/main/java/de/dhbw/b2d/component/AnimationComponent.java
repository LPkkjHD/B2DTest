package de.dhbw.b2d.component;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.ArrayMap;

public class AnimationComponent implements Component {
    public ArrayMap<String, Animation<TextureAtlas.AtlasRegion>> animations;
}
