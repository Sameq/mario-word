package org.projeto.jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {
    private boolean changinScane = false;
    private float timeToChengeScene = 2.0f;

    public LevelEditorScene() {
        System.out.printf("Insede level scane");
    }

    @Override
    public void upDate(float dt) {
        if (!changinScane && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            changinScane = true;
        }
        if (changinScane && timeToChengeScene > 0) {
            timeToChengeScene -= dt;
            Window.get().r -= dt * 5.0f;
            Window.get().g -= dt * 5.0f;
            Window.get().b -= dt * 5.0f;
        } else if (changinScane) {

        }
    }
}
