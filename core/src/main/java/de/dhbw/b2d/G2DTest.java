package de.dhbw.b2d;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import de.dhbw.b2d.component.AnimationComponent;
import de.dhbw.b2d.component.BodyComponent;
import de.dhbw.b2d.entity.PlayerEntitiy;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms.
 */
public class G2DTest extends ApplicationAdapter {
    Engine engine;

    @Override
    public void create() {
        engine = new Engine();
        Entity playerEntity = new PlayerEntitiy();
        playerEntity.add(new AnimationComponent());
        playerEntity.add(new BodyComponent());
        engine.addEntity(playerEntity);
    }

    @Override
    public void render() {
        engine.update(Gdx.graphics.getDeltaTime());
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void dispose() {
    }
}
